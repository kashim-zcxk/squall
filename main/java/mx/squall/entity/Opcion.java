package mx.squall.entity;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Opcion {

	private String id = UUID.randomUUID().toString().replace("-", "");
	private String descripcion;

	
	public Opcion(String descripcion) {
		super();
		this.descripcion = descripcion;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
