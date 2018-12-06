package com.pocketpersonaltrainer.API.resources;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pocketpersonaltrainer.API.model.PersonalTrainer;
import com.pocketpersonaltrainer.API.repository.PersonalTrainerRepository;

import io.swagger.annotations.Api;

@Api(value="PocketPersonalTrainer API Rest")
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path="/pocketPersonalTrainer")
public class PersonalResources {
	
	@Autowired
	PersonalTrainerRepository personalRepository;
	
	
	@GetMapping(path="/personais")
	public Iterable<PersonalTrainer> mostraTodos(){
		return personalRepository.findAll();
	}
	
	@GetMapping(path="/personal/{id}")
	public PersonalTrainer personalById(@PathVariable(value="id") long id){
		return personalRepository.findById(id);
	}
	
	@PostMapping(path="/personalT")
	public PersonalTrainer salvarPersonal(@RequestBody PersonalTrainer personal) {
		return personalRepository.save(personal);
	}
	
	@DeleteMapping(path="/deletaPersonal/{id}")
	public void deletarPersonal(@RequestBody long id) {
		personalRepository.deleteById(id);
	}
}
