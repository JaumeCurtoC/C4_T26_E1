package com.example.C4_T26.service;

import java.util.List;

import com.example.C4_T26.dto.Proveedor;

public interface IProveedorService {

	// Metodos CRUD
	//Listar
	public List<Proveedor> listarProveedores();
	
	// CREATE
	public Proveedor guardarProveedor(Proveedor proveedor);
	
	// READ
	public Proveedor proveedorXID(int id);
	
	// UPDATE
	public Proveedor actualizarProveedor(Proveedor proveedor);
	
	// DELETE
	public void eliminarProveedor(int id);
	
}
