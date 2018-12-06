package com.pocketpersonaltrainer.API.resources;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pocketpersonaltrainer.API.model.Compra;
import com.pocketpersonaltrainer.API.repository.CompraRepository;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(path="/pocketPersonalTrainer")
@Api(value="PocketPersonalTrainer API Rest")
@CrossOrigin(origins = "*")
public class CompraResource {

	@Autowired
	CompraRepository compraRepository;
	
	@GetMapping(path="/compras")
	public @ResponseBody Iterable<Compra> mostrarTodos(){
		return compraRepository.findAll();
	}
	
	@GetMapping(path="/compras/{id}")
	public @ResponseBody Optional<Compra> getCompraById(@RequestBody long id) {
		return compraRepository.findById(id);
	}
	
	@PostMapping(path="/compra")
	public @ResponseBody Compra salvarCompra(@RequestBody Compra comprar) {		
		return compraRepository.save(comprar);
	}
}
