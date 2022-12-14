package com.idat.kevinramirez.hospedaje.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.idat.kevinramirez.hospedaje.modelo.Hospedaje;
import com.idat.kevinramirez.hospedaje.repository.DetalleHospedajeRepository;
import com.idat.kevinramirez.hospedaje.repository.HospedajeRepository;

@Service
public class HospedajeServiceImpl implements HospedajeService{

	@Autowired
	private HospedajeRepository hospedajeRepo;
	
	@Autowired
	private DetalleHospedajeRepository detalleRepo;
	
	
	@Override
	public List<Hospedaje> listar() {
		List<Hospedaje> listadto = new ArrayList<>();
		Hospedaje dto = null;
				
		for (Hospedaje turista : hospedajeRepo.findAll()) {
			dto = new Hospedaje();
			dto.setNombre(turista.getNombre());
			
			listadto.add(dto);
		}
		
		return listadto;
	}


	@Override
	public void guardarHospedaje(Hospedaje hospedaje) {
		hospedajeRepo.save(hospedaje);
		
	}

		
	
	
	
}
