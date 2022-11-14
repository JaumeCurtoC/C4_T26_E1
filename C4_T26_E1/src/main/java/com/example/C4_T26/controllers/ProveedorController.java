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

import com.example.C4_T26.dto.Proveedor;
import com.example.C4_T26.service.ProveedorServiceImpl;

@RestController
@RequestMapping("/api")
public class ProveedorController {

	@Autowired
	ProveedorServiceImpl proveedorServiceImpl;
	
	@GetMapping("/proveedores")
	public List<Proveedor> listarProveedores(){
		return proveedorServiceImpl.listarProveedores();
	}
	
	@PostMapping("/proveedores")
	public Proveedor salvarProveedor(@RequestBody Proveedor proveedor) {
		return proveedorServiceImpl.guardarProveedor(proveedor);
	}
	
	@GetMapping("/proveedores/{id}")
	public Proveedor ProveedorXID(@PathVariable(name = "id") int id) {
		return proveedorServiceImpl.proveedorXID(id);
	}
	
	@PutMapping("proveedores/{id}")
	public Proveedor actualizarProveedor(@PathVariable(name = "id") int id, @RequestBody Proveedor proveedor) {
		Proveedor pro_s = new Proveedor();
		Proveedor pro_a = new Proveedor();
		
		pro_s = proveedorServiceImpl.proveedorXID(id);
		
		pro_s.setNombre(proveedor.getNombre());
		
		pro_a = proveedorServiceImpl.actualizarProveedor(pro_s);
		
		System.out.println("Proveedor actualizada:" + pro_a);
		
		return pro_a;
	}
	
	@DeleteMapping("/proveedores/{id}")
	public void eliminarProveedor(@PathVariable(name = "id") int id) {
		proveedorServiceImpl.eliminarProveedor(id);
	}
}
