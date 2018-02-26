package mx.squall.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import mx.squall.entity.Seccion;

public interface SeccionRepository extends MongoRepository<Seccion, String> {

	@Query(value = "{}", fields = "{ 'titulo' : 1 }")
	List<Seccion> getSeccionsTitles();

	@Query(value = "{'id': ?0, 'preguntas.id' : ?1}", fields = "{ 'preguntas.respuesta' : 1 }")
	Seccion getAnwser(String seccId, String resId);
}
