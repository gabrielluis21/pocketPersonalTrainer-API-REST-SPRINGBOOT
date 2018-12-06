package com.pocketpersonaltrainer.API.repository;



//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.pocketpersonaltrainer.API.model.Academia;

public interface AcademiaRepository extends CrudRepository<Academia, Long>{
	
	Academia findByEmailAndSenha(final String email, final String senha);
	
}
