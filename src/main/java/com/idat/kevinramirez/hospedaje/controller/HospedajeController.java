package com.idat.kevinramirez.hospedaje.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.idat.kevinramirez.hospedaje.modelo.Hospedaje;
import com.idat.kevinramirez.hospedaje.service.HospedajeService;



@Controller
@RequestMapping("/api/hospedaje/v1")
public class HospedajeController {


	@Autowired
	private HospedajeService service;
	
	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody Hospedaje hospedaje) {
		service.guardarHospedaje(hospedaje);
		
	}
	
	@GetMapping("/listar")
	public @ResponseBody List<Hospedaje> listar(){
		return service.listar();
	}
}
