package com.pocketpersonaltrainer.API.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.pocketpersonaltrainer.API.model.Compra;

public interface CompraRepository extends CrudRepository<Compra, Long> {
	
}

