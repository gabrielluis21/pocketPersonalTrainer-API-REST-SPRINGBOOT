package com.pocketpersonaltrainer.API.resources;

//import java.util.Date;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pocketpersonaltrainer.API.model.CompraAcademia;
import com.pocketpersonaltrainer.API.repository.CompraAcademiaRepository;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(path="/pocketPersonalTrainer")
@Api(value="PocketPersonalTrainer API Rest")
@CrossOrigin(origins = "*")
public class CompraAcademiaRepositoy {

	@Autowired
	CompraAcademiaRepository comprasGymRepository;
	
	
	@GetMapping(path="/seusPlanos")
	public @ResponseBody Iterable<CompraAcademia> mostrarTodos(){
		return comprasGymRepository.findAll();
	}
	
	/*@GetMapping(path="/seusPlanos/{dtCompra}")
	public @ResponseBody Iterable<CompraAcademia> mostrarTodosPorDataCompra(@RequestParam Date dtCompra){
		return comprasGymRepository.findAll(dtCompra);
	}*/
	
	@GetMapping(path="/seusPlanos/{Status}")
	public @ResponseBody Iterable<CompraAcademia> mostrarTodosPorStatusCompra(@RequestParam Iterable<Long> status){
		return comprasGymRepository.findAllById(status);
	}
	
	@PostMapping("/finalizarCompra")
	public CompraAcademia salvaFinalizaCompra(@RequestParam CompraAcademia compraGym) {
		return comprasGymRepository.save(compraGym);
	}
	
	@DeleteMapping("/deletarFinalizarCompra")
	public void deletarFinalizaCompra(@RequestParam CompraAcademia compraGym) {
		comprasGymRepository.delete(compraGym);
	}
	
}
