package mx.squall.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import mx.squall.entity.Registro;

public interface RegistroRepository extends MongoRepository<Registro, String> {

}
