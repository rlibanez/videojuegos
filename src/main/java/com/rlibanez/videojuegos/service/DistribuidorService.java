package com.rlibanez.videojuegos.service;

import com.rlibanez.videojuegos.model.Distribuidor;
import com.rlibanez.videojuegos.repository.DistribuidorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistribuidorService {
    private final DistribuidorRepository distribuidorRepository;

    public DistribuidorService(DistribuidorRepository distribuidorRepository) {
        this.distribuidorRepository = distribuidorRepository;
    }

    public List<Distribuidor> buscarTodos() {
        return distribuidorRepository.findAllByOrderByNombreAsc();
    }
}

