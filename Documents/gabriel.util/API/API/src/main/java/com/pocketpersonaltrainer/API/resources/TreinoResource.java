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

import com.pocketpersonaltrainer.API.model.Treino;
import com.pocketpersonaltrainer.API.repository.TreinoRepository;

import io.swagger.annotations.Api;

@Api(value="PocketPersonalTrainer API Rest")
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path="/pocketPersonalTrainer")
public class TreinoResource {

	
	@Autowired
	TreinoRepository treinoRepository;
	
	@GetMapping(path="/treinos")
	public @ResponseBody Iterable<Treino> mostrarTodos(){
		return treinoRepository.findAll();
	}
	
	@GetMapping(path="/treinos/{id}")
	public @ResponseBody Optional<Treino> treinoById(@RequestParam long id){
		return treinoRepository.findById(id);
	}
	
	@GetMapping(path="/treinos/search/{nome}")
	public @ResponseBody Treino treinoByName(@RequestParam String name){
		return treinoRepository.findByNome(name);
	}
	
	@PostMapping(path="/treino")
	public Treino salvaTreino(@RequestParam Treino treino) {
		return treinoRepository.save(treino);
	}
	
	@DeleteMapping(path="/deletaTreino/{id}")
	public void deletarTreino(@RequestParam long id) {
		treinoRepository.deleteById(id);
	}
}
