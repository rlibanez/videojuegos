package com.rlibanez.videojuegos.repository;

import com.rlibanez.videojuegos.model.Distribuidor;
import com.rlibanez.videojuegos.model.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistribuidorRepository extends JpaRepository<Distribuidor, Integer> {

    // Consulta automática de Spring
    List<Distribuidor> findAllByOrderByNombreAsc();

}
