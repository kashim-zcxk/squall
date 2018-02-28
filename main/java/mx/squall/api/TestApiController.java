package mx.squall.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mx.squall.entity.Pregunta;
import mx.squall.entity.Seccion;
import mx.squall.repository.SeccionRepository;

@RestController
@RequestMapping("/api/1.0/")
public class TestApiController {

	@Autowired
	private SeccionRepository seccionRepository;
	
	@RequestMapping(value = "insert", method = RequestMethod.GET)
	@ResponseBody
	public Object insert() {
		List<Pregunta> preguntas = new ArrayList<Pregunta>();
		Pregunta test = new Pregunta("Test");
		Seccion seccionA = new Seccion();
		seccionA.setTitulo("Mi seccion");
		seccionA.setPreguntas(preguntas);
		preguntas.add(test);
		seccionRepository.save(seccionA);
		return seccionRepository.findAll();
	}
	
}
