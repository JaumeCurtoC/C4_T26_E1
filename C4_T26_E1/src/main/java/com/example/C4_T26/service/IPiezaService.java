package com.example.C4_T26.service;

import java.util.List;

import com.example.C4_T26.dto.Pieza;

public interface IPiezaService {

	// Metodos CRUD
	//Listar
	public List<Pieza> listarPiezas();
	
	// CREATE
	public Pieza guardarPieza(Pieza pieza);
	
	// READ
	public Pieza piezaXID(int id);
	
	// UPDATE
	public Pieza actualizarPieza(Pieza pieza);
	
	// DELETE
	public void eliminarPieza(int id);
	
}
