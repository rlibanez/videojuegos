package com.rlibanez.videojuegos.service;

import com.rlibanez.videojuegos.model.Videojuego;
import com.rlibanez.videojuegos.repository.VideojuegoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideojuegoService {

    private final VideojuegoRepository videojuegoRepository;

    public VideojuegoService(VideojuegoRepository videojuegoRepository) {
        this.videojuegoRepository = videojuegoRepository;
    }

    public List<Videojuego> buscarDestacados() {
        return videojuegoRepository.buscarTodos3();
    }

    public List<Videojuego> buscarDestacadosOrdenadosNombre() {
        Sort orden = Sort.by(Sort.Direction.ASC, "nombre");
        return videojuegoRepository.findAll(orden);
    }

    public List<Videojuego> buscarDestacadosOrdenadosNombre2() {
        return videojuegoRepository.findAllByOrderByNombreAsc();
    }

    public List<Videojuego> buscarPorDistribuidor(int distribuidorId) {
        return videojuegoRepository.buscarPorDistribuidor(distribuidorId);
    }

    // Buscar por nombre del videojuego
    public List<Videojuego> buscarPorNombre(String consulta) {
        //return videojuegoRepository.buscarPorNombre(consulta);
        return videojuegoRepository.findByNombreContaining(consulta);
    }
}
