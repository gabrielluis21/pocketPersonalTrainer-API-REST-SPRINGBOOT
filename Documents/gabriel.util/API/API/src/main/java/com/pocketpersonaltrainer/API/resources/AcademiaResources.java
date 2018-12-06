package com.pocketpersonaltrainer.API.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pocketpersonaltrainer.API.model.Academia;
import com.pocketpersonaltrainer.API.repository.AcademiaRepository;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(path="/pocketPersonalTrainer")
@Api(value="PocketPersonalTrainer API Rest")
@CrossOrigin(origins = "*")
public class AcademiaResources {

	@Autowired
	private AcademiaRepository academiaRepository;
	
	@GetMapping(path="/academias")
	public @ResponseBody Iterable<Academia> listarTodasAcademias(){
		return academiaRepository.findAll();
	}
	
	@GetMapping(path="/academia/{id}")
	public @ResponseBody Optional<Academia> getAcademiaById(@RequestParam long id){
		return academiaRepository.findById(id);
	}
	
	@GetMapping(path="/academia/login/{email,senha}")
	public @ResponseBody Academia login(@RequestParam String email, @RequestParam String senha){
		return academiaRepository.findByEmailAndSenha(email,senha);
	}
	
	@PostMapping(path="/academia")
	public @ResponseBody Academia salvaAcademia(@RequestBody Academia academia) {
		return academiaRepository.save(academia);
	}
	
	@DeleteMapping(path="/deletaGym")
	public void deletarAcademia(@RequestBody Academia academia) {
		academiaRepository.delete(academia);
	}
	
}
