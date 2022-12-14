package com.idat.kevinramirez.hospedaje.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class ReservaHospedajeFK implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = -7659126074514584950L;
	
	@Column(name = "id_hospedaje", nullable = false)
	private Integer idHospedaje;
	
	@Column(name = "id_reserva", nullable = false)
	private Integer idReserva;

}
