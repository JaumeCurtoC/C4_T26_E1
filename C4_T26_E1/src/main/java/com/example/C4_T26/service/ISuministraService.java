package com.example.C4_T26.service;

import java.util.List;

import com.example.C4_T26.dto.Suministra;

public interface ISuministraService {

	// Metodos CRUD
	//Listar
	public List<Suministra> listarSuministras();
	
	// CREATE
	public Suministra guardarSuministra(Suministra suministra);
	
	// READ
	public Suministra suministraXID(int id);
	
	// UPDATE
	public Suministra actualizarSuministra(Suministra suministra);
	
	// DELETE
	public void eliminarSuministra(int id);
	
}
