package com.example.C4_T26.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.C4_T26.dao.IPiezaDAO;
import com.example.C4_T26.dto.Pieza;

@Service
public class PiezaServiceImpl implements IPiezaService {

	@Autowired
	IPiezaDAO piezaDAO;

	@Override
	public List<Pieza> listarPiezas() {
		// TODO Auto-generated method stub
		return piezaDAO.findAll();
	}

	@Override
	public Pieza guardarPieza(Pieza pieza) {
		// TODO Auto-generated method stub
		return piezaDAO.save(pieza);
	}

	@Override
	public Pieza piezaXID(int id) {
		// TODO Auto-generated method stub
		return piezaDAO.findById(id).get();
	}

	@Override
	public Pieza actualizarPieza(Pieza pieza) {
		// TODO Auto-generated method stub
		return piezaDAO.save(pieza);
	}

	@Override
	public void eliminarPieza(int id) {
		// TODO Auto-generated method stub
		piezaDAO.deleteById(id);
	}
}
