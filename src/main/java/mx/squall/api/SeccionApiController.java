package mx.squall.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mx.squall.service.SeccionService;

@RestController
@RequestMapping("/api/1.0/")
public class SeccionApiController {

	@Autowired
	private SeccionService servicioSeccion;
	
	@RequestMapping(value = "secciones", method = RequestMethod.GET)
	@ResponseBody
	public Object getSecciones() {
		return servicioSeccion.obtenerSecciones();
	}
	
	@RequestMapping(value = "secciones/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Object getSecciones(@PathVariable String id) {
		return servicioSeccion.obtenerSeccion(id);
	}
	
	@RequestMapping(value = "secciones/{seccionId}/preguntas/{preguntaId}/respuestas", method = RequestMethod.POST)
	@ResponseBody
	public Object getSecciones(@PathVariable String seccionId, @PathVariable String preguntaId, @RequestBody Map<String, Object> respuestaBody) {
		String respuestaId;
		Map<String, Object> result = new HashMap<String, Object>();

		if(respuestaBody.containsKey("respuestaId")) {
			respuestaId = (String) respuestaBody.get("respuestaId");
			result.put("esCorrecto", servicioSeccion.esCorrecto(seccionId, preguntaId, respuestaId));
			result.put("opcion", respuestaId);
		}else {
			result.put("error", "No id");
		}
		result.put("seccion", seccionId);
		result.put("pregunta", preguntaId);
		return result;
	}
}
