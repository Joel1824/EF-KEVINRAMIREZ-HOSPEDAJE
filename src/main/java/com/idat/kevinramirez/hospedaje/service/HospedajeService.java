package com.idat.kevinramirez.hospedaje.service;

import java.util.List;


import com.idat.kevinramirez.hospedaje.modelo.Hospedaje;

public interface HospedajeService {

	List<Hospedaje> listar();
	void guardarHospedaje(Hospedaje hospedaje);
}
