package com.rlibanez.videojuegos.controller;

import com.rlibanez.videojuegos.model.Videojuego;
import com.rlibanez.videojuegos.service.VideojuegoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ListadoController {

    private final VideojuegoService videojuegoService;

    public ListadoController(VideojuegoService videojuegoService) {
        this.videojuegoService = videojuegoService;
    }

    @RequestMapping("/")
    public String listarVideojuegos(Model model) {
        List<Videojuego> destacados = videojuegoService.buscarDestacados();
        //List<Videojuego> destacados = videojuegoService.buscarDestacadosOrdenadosNombre();
        model.addAttribute("videojuegos", destacados);
        return "listado";
    }

    @RequestMapping("/videojuegosPorDistribuidor")
    public String listarVideojuegosPorDistribuidor(int distribuidorId, Model model) {
        List<Videojuego> juegos = videojuegoService.buscarPorDistribuidor(distribuidorId);
        model.addAttribute("videojuegos", juegos);
        return "listado";
    }

}
