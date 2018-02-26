package mx.squall.service;

import java.util.List;

import mx.squall.entity.Opcion;
import mx.squall.entity.Seccion;

public interface SeccionService {

	List<Seccion> obtenerSecciones();
	Seccion obtenerSeccion(String id);
	Opcion obtenerRespuesta(String seccionId, String preguntaId);
	Boolean esCorrecto(String seccionId, String preguntaId, String opcionId);
}
