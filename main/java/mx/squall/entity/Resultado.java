package mx.squall.entity;

import java.util.UUID;

import org.springframework.data.mongodb.core.mapping.DBRef;

public class Resultado {

	private String id = UUID.randomUUID().toString().replace("-", "");
	@DBRef
	private Seccion seccion;
	private Integer correctas;
	private Integer incorrectas;
	@SuppressWarnings("unused")
	private Integer total;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Seccion getSeccion() {
		return seccion;
	}

	public void setSeccion(Seccion seccion) {
		this.seccion = seccion;
	}

	public Integer getCorrectas() {
		return correctas;
	}

	public void setCorrectas(Integer correctas) {
		this.correctas = correctas;
	}

	public Integer getIncorrectas() {
		return incorrectas;
	}

	public void setIncorrectas(Integer incorrectas) {
		this.incorrectas = incorrectas;
	}

	public Integer getTotal() {
		return correctas + incorrectas;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

}
