package com.rlibanez.videojuegos.service;

import com.rlibanez.videojuegos.model.Videojuego;
import com.rlibanez.videojuegos.repository.VideojuegoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideojuegoService {

    private final VideojuegoRepository videojuegoRepository;

    public VideojuegoService(VideojuegoRepository videojuegoRepository) {
        this.videojuegoRepository = videojuegoRepository;
    }

    public List<Videojuego> buscarDestacados() {
        return videojuegoRepository.findAll();
    }
}
