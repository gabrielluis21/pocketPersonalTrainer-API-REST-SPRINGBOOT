package com.pocketpersonaltrainer.API.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.pocketpersonaltrainer.API.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
	
	Usuario findByEmailAndSenha( final String email, final String senha);
	
}
