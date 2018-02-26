package mx.squall.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.squall.entity.Opcion;
import mx.squall.entity.Seccion;
import mx.squall.repository.SeccionRepository;
import mx.squall.service.SeccionService;

@Service
public class SeccionSericeImpl implements SeccionService {

	@Autowired
	private SeccionRepository repositorioSeccion;
	
	@Override
	public List<Seccion> obtenerSecciones() {
		return repositorioSeccion.getSeccionsTitles();
	}

	@Override
	public Seccion obtenerSeccion(String id) {
		return repositorioSeccion.findOne(id);
	}

	@Override
	public Opcion obtenerRespuesta(String seccId, String resId) {
		Seccion res = repositorioSeccion.getAnwser(seccId, resId);
		return res.getPreguntas().get(0).getRespuesta();
	}

	@Override
	public Boolean esCorrecto(String seccionId, String preguntaId, String opcionId) {
		Seccion res = repositorioSeccion.getAnwser(seccionId, preguntaId);
		return res.getPreguntas().get(0).getRespuesta().getId().equals(opcionId);
	}

	
}
