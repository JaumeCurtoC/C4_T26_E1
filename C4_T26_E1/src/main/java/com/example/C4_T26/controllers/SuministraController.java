package com.example.C4_T26.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.C4_T26.dto.Suministra;
import com.example.C4_T26.service.SuministraServiceImpl;

@RestController
@RequestMapping("/api")
public class SuministraController {

	@Autowired
	SuministraServiceImpl suministraServiceImpl;
	
	@GetMapping("/suministra")
	public List<Suministra> listarSuministras(){
		return suministraServiceImpl.listarSuministras();
	}
	
	@PostMapping("/suministra")
	public Suministra salvarSuministra(@RequestBody Suministra suministra) {
		return suministraServiceImpl.guardarSuministra(suministra);
	}
	
	@GetMapping("/suministra/{id}")
	public Suministra SuministraXID(@PathVariable(name = "id") int id) {
		return suministraServiceImpl.suministraXID(id);
	}
	
	@PutMapping("suministra/{id}")
	public Suministra actualizarSuministra(@PathVariable(name = "id") int id, @RequestBody Suministra suministra) {
		Suministra sum_s = new Suministra();
		Suministra sum_a = new Suministra();
		
		sum_s = suministraServiceImpl.suministraXID(id);
		
		sum_s.setPieza(suministra.getPieza());
		sum_s.setProveedor(suministra.getProveedor());
		sum_s.setPrecio(suministra.getPrecio());
		
		sum_a = suministraServiceImpl.actualizarSuministra(sum_s);
		
		System.out.println("Suministra actualizada:" + sum_a);
		
		return sum_a;
	}
	
	@DeleteMapping("/suministra/{id}")
	public void eliminarSuministra(@PathVariable(name = "id") int id) {
		suministraServiceImpl.eliminarSuministra(id);
	}
}
