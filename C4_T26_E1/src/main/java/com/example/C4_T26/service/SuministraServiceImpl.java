package com.example.C4_T26.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.C4_T26.dao.ISuministraDAO;
import com.example.C4_T26.dto.Suministra;

@Service
public class SuministraServiceImpl implements ISuministraService{

	@Autowired
	ISuministraDAO suministraDAO;

	@Override
	public List<Suministra> listarSuministras() {
		// TODO Auto-generated method stub
		return suministraDAO.findAll();
	}

	@Override
	public Suministra guardarSuministra(Suministra suministra) {
		// TODO Auto-generated method stub
		return suministraDAO.save(suministra);
	}

	@Override
	public Suministra suministraXID(int id) {
		// TODO Auto-generated method stub
		return suministraDAO.findById(id).get();
	}

	@Override
	public Suministra actualizarSuministra(Suministra suministra) {
		// TODO Auto-generated method stub
		return suministraDAO.save(suministra);
	}

	@Override
	public void eliminarSuministra(int id) {
		// TODO Auto-generated method stub
		suministraDAO.deleteById(id);
	}
}
