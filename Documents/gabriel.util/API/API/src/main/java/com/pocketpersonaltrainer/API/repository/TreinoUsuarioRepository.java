package com.pocketpersonaltrainer.API.repository;

import java.util.Date;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.pocketpersonaltrainer.API.model.TreinoUsuario;

public interface TreinoUsuarioRepository extends CrudRepository<TreinoUsuario, Long> {
	
	TreinoUsuario findByUserId(long idUser);
	
	TreinoUsuario findByDtAgendado(Date dtAgendado);
	
}
