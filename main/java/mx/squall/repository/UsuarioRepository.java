package mx.squall.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import mx.squall.entity.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {

}
