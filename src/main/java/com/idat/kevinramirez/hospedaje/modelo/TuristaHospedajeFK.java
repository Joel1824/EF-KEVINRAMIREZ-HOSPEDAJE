package com.idat.kevinramirez.hospedaje.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class TuristaHospedajeFK implements Serializable{

	
	private static final long serialVersionUID = -3381001379486739698L;
	
	@Column(name="id_hospedaje", nullable = false)
	private Integer idHospedaje;
	
	
	@Column(name = "id_turista", nullable = false)
	private Integer idTurista;
	
}
