package com.pocketpersonaltrainer.API.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pocketpersonaltrainer.API.model.Pacote;
import com.pocketpersonaltrainer.API.repository.PacoteRepository;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(path="/pocketPersonalTrainer")
@Api(value="PocketPersonalTrainer API Rest")
@CrossOrigin(origins = "*")
public class PacoteResource {
	
	@Autowired
	PacoteRepository pacoteRepository;
	
	@GetMapping(path="/pacotes")
	public @ResponseBody Iterable<Pacote> mostrarTodos(){
		return pacoteRepository.findAll();
	}
	
	@GetMapping(path="/pacotes/{id}")
	public @ResponseBody Optional<Pacote> pacoteById(@RequestParam long id){
		return pacoteRepository.findById(id);
	}
	
	@PostMapping(path="/pacote")
	public @ResponseBody Pacote salvarPacote(@RequestParam Pacote pacote){
		return pacoteRepository.save(pacote);
	}
	
	@DeleteMapping("/deletaPackege")
	public void deletarpacote(@RequestParam Pacote pacote) {
		pacoteRepository.delete(pacote);
	}
}
