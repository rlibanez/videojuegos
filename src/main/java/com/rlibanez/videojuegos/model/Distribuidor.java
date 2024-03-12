package com.rlibanez.videojuegos.model;

import jakarta.persistence.*;

@Entity
@Table(name="distribuidor")
public class Distribuidor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
    private String nombre;
    @Column(name="sitio_web") // Opcional. En el caso de usar nomenclatura camelCase, antes de las mayúsculas introduce una barra baja: sitioWeb = sitio_web
    private String sitioWeb;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }
}
