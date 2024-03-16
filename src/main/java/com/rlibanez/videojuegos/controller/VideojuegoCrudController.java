package com.rlibanez.videojuegos.controller;

import com.rlibanez.videojuegos.model.Videojuego;
import com.rlibanez.videojuegos.service.DistribuidorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VideojuegoCrudController {

    private final DistribuidorService distribuidorService;

    public VideojuegoCrudController(DistribuidorService distribuidorService) {
        this.distribuidorService = distribuidorService;
    }

    @RequestMapping("/videojuegos/crear")
    public String mostrarFormAlta(Model model) {
        model.addAttribute("distribuidores", distribuidorService.buscarTodos());
        model.addAttribute("videojuego", new Videojuego());
        return "formVideojuego";
    }

    @PostMapping("/videojuegos/guardar")
    public String guardar(Videojuego videojuego) {
        System.out.println(videojuego);
        return "redirect:/";
    }
}
