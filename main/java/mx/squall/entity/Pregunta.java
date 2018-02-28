package mx.squall.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Pregunta {
	
	private String id = UUID.randomUUID().toString().replace("-", "");
	private String pregunta;
	private List<Opcion> opciones;
	private Opcion respuesta;

	public Pregunta(String pregunta) {
		super();
		List<Opcion> opciones = new ArrayList<Opcion>();
		Opcion opcionA = new Opcion("Opcion a");
		Opcion opcionB = new Opcion("Opcion b");
		opciones.add(opcionA);
		opciones.add(opcionB);
		this.opciones = opciones;
		this.respuesta = opcionA;
		this.pregunta = pregunta;
	}

	@Id
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public List<Opcion> getOpciones() {
		return opciones;
	}

	public void setOpciones(List<Opcion> opciones) {
		this.opciones = opciones;
	}

	@JsonIgnore
	public Opcion getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(Opcion respuesta) {
		this.respuesta = respuesta;
	}

}
