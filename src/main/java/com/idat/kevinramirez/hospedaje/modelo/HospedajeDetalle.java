package com.idat.kevinramirez.hospedaje.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name ="detalle_hospedaje")
public class HospedajeDetalle {

	@Id
	private TuristaHospedajeFK fk = new TuristaHospedajeFK();
	
	
	@Id
	private ReservaHospedajeFK ff = new ReservaHospedajeFK();
}
