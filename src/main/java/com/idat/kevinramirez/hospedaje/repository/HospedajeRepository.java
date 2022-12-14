package com.idat.kevinramirez.hospedaje.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.idat.kevinramirez.hospedaje.modelo.Hospedaje;

@Repository
public interface HospedajeRepository extends JpaRepository<Hospedaje, Integer>{

}
