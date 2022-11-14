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

import com.example.C4_T26.dto.Pieza;
import com.example.C4_T26.service.PiezaServiceImpl;

@RestController
@RequestMapping("/api")
public class PiezaController {

	@Autowired
	PiezaServiceImpl piezaServiceImpl;
	
	@GetMapping("/piezas")
	public List<Pieza> listarPiezas(){
		return piezaServiceImpl.listarPiezas();
	}
	
	@PostMapping("/piezas")
	public Pieza salvarPieza(@RequestBody Pieza pieza) {
		return piezaServiceImpl.guardarPieza(pieza);
	}
	
	@GetMapping("/piezas/{id}")
	public Pieza PiezaXID(@PathVariable(name = "id") int id) {
		return piezaServiceImpl.piezaXID(id);
	}
	
	@PutMapping("piezas/{id}")
	public Pieza actualizarPieza(@PathVariable(name = "id") int id, @RequestBody Pieza pieza) {
		Pieza pieza_s = new Pieza();
		Pieza pieza_a = new Pieza();
		
		pieza_s = piezaServiceImpl.piezaXID(id);
		
		pieza_s.setNombre(pieza.getNombre());
		
		pieza_a = piezaServiceImpl.actualizarPieza(pieza_s);
		
		System.out.println("Pieza actualizada:" + pieza_a);
		
		return pieza_a;
	}
	
	@DeleteMapping("/piezas/{id}")
	public void eliminarPieza(@PathVariable(name = "id") int id) {
		piezaServiceImpl.eliminarPieza(id);
	}
}
