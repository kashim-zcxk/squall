package mx.squall.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

@Document(collection = "registros")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Registro {

	@Id
	private String id;
	@DBRef
	private Usuario usuario;
	private List<Resultado> Resultados;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Resultado> getResultados() {
		return Resultados;
	}

	public void setResultados(List<Resultado> resultados) {
		Resultados = resultados;
	}

}
