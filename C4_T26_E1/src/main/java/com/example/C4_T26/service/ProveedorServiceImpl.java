package com.example.C4_T26.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.C4_T26.dao.IProveedorDAO;
import com.example.C4_T26.dto.Proveedor;


@Service
public class ProveedorServiceImpl implements IProveedorService {

	@Autowired
	IProveedorDAO proveedorDAO;

	@Override
	public List<Proveedor> listarProveedores() {
		// TODO Auto-generated method stub
		return proveedorDAO.findAll();
	}

	@Override
	public Proveedor guardarProveedor(Proveedor proveedor) {
		// TODO Auto-generated method stub
		return proveedorDAO.save(proveedor);
	}

	@Override
	public Proveedor proveedorXID(int id) {
		// TODO Auto-generated method stub
		return proveedorDAO.findById(id).get();
	}

	@Override
	public Proveedor actualizarProveedor(Proveedor proveedor) {
		// TODO Auto-generated method stub
		return proveedorDAO.save(proveedor);
	}

	@Override
	public void eliminarProveedor(int id) {
		// TODO Auto-generated method stub
		proveedorDAO.deleteById(id);
	}

	
}
