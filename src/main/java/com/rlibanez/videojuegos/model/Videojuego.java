package com.rlibanez.videojuegos.model;

import jakarta.persistence.*;

@Entity
@Table(name="videojuego")
public class Videojuego {
    @Id
    // La generación automática de valores para la clave primaria queda delegada en la base de datos
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="imagen_url") // Opcional. En el caso de usar nomenclatura camelCase, antes de las mayúsculas introduce una barra baja: imagenUrl = imagen_url
    private String imagenUrl;
    @ManyToOne
    private Distribuidor distribuidor;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Distribuidor getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(Distribuidor distribuidor) {
        this.distribuidor = distribuidor;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", imagenUrl='" + imagenUrl + '\'' +
                ", distribuidor=" + distribuidor.getId() +
                '}';
    }
}
