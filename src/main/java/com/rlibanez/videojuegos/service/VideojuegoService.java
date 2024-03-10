package com.rlibanez.videojuegos.service;

import com.rlibanez.videojuegos.model.Videojuego;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VideojuegoService {

    public List<Videojuego> buscarDestacados() {
        List<Videojuego> destacados = new ArrayList<>();

        Videojuego juego = new Videojuego();

        // Juego 1
        juego.setNombre("Bioshock Infinite");
        juego.setDescripcion("La última gran entrega de la saga Bioshock, ahora en una imperdible ciudad de ensueño entre las nubes.");
        juego.setImagenUrl("https://image.api.playstation.com/vulcan/img/cfn/11307sTZ0IfHm2mu2m-Bv67cCZdanpm3BrdhlSEdrfCM_Lk4_LU8iLKiFXzeca0FX_xWI8YQTxGjcbyQjPENYMTj7gE6a0kt.png");
        destacados.add(juego);

        // Juego 2
        juego = new Videojuego();
        juego.setNombre("Insurgency: Sandstorm");
        juego.setDescripcion("Un FPS táctico por equipos basado en combates letales en espacios reducidos y multijugador centrado en objetivos.");
        juego.setImagenUrl("https://image.api.playstation.com/vulcan/ap/rnd/202108/0611/eoDbrsfX3o7IkaNzaLMcWq9e.png");
        destacados.add(juego);

        // Juego 3
        juego = new Videojuego();
        juego.setNombre("The Witness");
        juego.setDescripcion("Te despiertas, a solas, en una extraña isla llena de puzles que te retarán y sorprenderán.");
        juego.setImagenUrl("https://image.api.playstation.com/cdn/EP8932/CUSA04263_00/7ZDA0HNGdkgUiE4ZIqDqLyqfxGxQooEo.png");
        destacados.add(juego);

        // Juego 4
        juego = new Videojuego();
        juego.setNombre("Braid");
        juego.setDescripcion("Braid es un juego de rompecabezas con toques plataformeros, presentado con un estilo pictórico, donde puedes manipular el flujo del tiempo de unas maneras inusuales y extrañas.");
        juego.setImagenUrl("https://store.playstation.com/store/api/chihiro/00_09_000/container/ES/es/99/EP4049-NPEB00150_00-BRAID00000000001/0/image");
        destacados.add(juego);

        // Juego 5
        juego = new Videojuego();
        juego.setNombre("Tonto");
        juego.setDescripcion("Tonto es un juego de rompecabezas con toques plataformeros, presentado con un estilo pictórico, donde puedes manipular el flujo del tiempo de unas maneras inusuales y extrañas.");
        juego.setImagenUrl("https://store.playstation.com/store/api/chihiro/00_09_000/container/ES/es/99/EP4049-NPEB00150_00-BRAID00000000001/0/image");
        destacados.add(juego);

        return destacados;
    }
}
