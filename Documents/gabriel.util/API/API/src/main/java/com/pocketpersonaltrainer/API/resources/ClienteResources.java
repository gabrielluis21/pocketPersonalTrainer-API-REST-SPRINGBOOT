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

import com.pocketpersonaltrainer.API.model.Usuario;
import com.pocketpersonaltrainer.API.repository.UsuarioRepository;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(path="/pocketPersonalTrainer")
@Api(value="PocketPersonalTrainer API Rest")
@CrossOrigin(origins = "*")
public class ClienteResources {

	@Autowired
	UsuarioRepository userRepository;
	
	@GetMapping("/clientes")
	public @ResponseBody Iterable<Usuario> mostraTodos(){
		return userRepository.findAll();
	}
	
	@GetMapping("/cliente/{id}")
	public @ResponseBody Optional<Usuario> usuarioById(@RequestParam long id){
		return userRepository.findById(id);
	}
	
	@GetMapping(path="/cliente/loginUser/{email,senha}")
	public @ResponseBody Usuario loginApp(@RequestParam String email, @RequestParam String senha) {
		return userRepository.findByEmailAndSenha(email, senha);
	}
	
	@PostMapping("/user")
	public Usuario salvarCliente(@RequestBody Usuario user) {
		return userRepository.save(user);
	}
	
	@DeleteMapping("/deletarUser/{id}")
	public void deletarUser(@RequestBody long id) {
		userRepository.deleteById(id);
	}
}
