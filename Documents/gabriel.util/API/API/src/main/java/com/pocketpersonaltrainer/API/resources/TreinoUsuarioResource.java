package com.pocketpersonaltrainer.API.resources;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pocketpersonaltrainer.API.model.TreinoUsuario;
import com.pocketpersonaltrainer.API.repository.TreinoUsuarioRepository;

@RestController
@RequestMapping(path="/pocketPersonalTrainer")

public class TreinoUsuarioResource {
	
	@Autowired
	TreinoUsuarioRepository treinoUserRepository;
	
	@GetMapping(path="/seusTreinos")
	public @ResponseBody Iterable<TreinoUsuario> mostrarTodos(){
		return treinoUserRepository.findAll();
	}
	
	@GetMapping(path="/seusTtreinos/{id}")
	public @ResponseBody Optional<TreinoUsuario> treinoById(@RequestParam long id){
		return treinoUserRepository.findById(id);
	}
	
	@GetMapping(path="/treinos/mostrar/{dtAgendamento}")
	public @ResponseBody TreinoUsuario treinoByDate(@RequestParam Date dtAgendada){
		return treinoUserRepository.findByDtAgendado(dtAgendada);
	}
	
	@PostMapping(path="/agendarTreinos")
	public @ResponseBody TreinoUsuario agendarTreinos(@RequestParam TreinoUsuario treinoUser) {
		return treinoUserRepository.save(treinoUser);
	}
	
	@DeleteMapping("/deletarTreinoUser")
	public void deletarTreinoUser(@RequestParam TreinoUsuario treinoUser) {
		treinoUserRepository.delete(treinoUser);
	}
	
}
