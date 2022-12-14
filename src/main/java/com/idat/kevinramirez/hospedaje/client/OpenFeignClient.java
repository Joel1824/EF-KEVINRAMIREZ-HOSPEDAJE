package com.idat.kevinramirez.hospedaje.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


import com.idat.kevinramirez.hospedaje.dto.ReservaDTO;


@FeignClient(name = "turista-microservicio", url= "localhost:8097")
public interface OpenFeignClient {

	
	@GetMapping("/api/reserva/v1/listar")
	public List<ReservaDTO> listarReserva();
	
	@GetMapping("/api/turista/v1/listar")
	public List<ReservaDTO> listarTurista();
}
