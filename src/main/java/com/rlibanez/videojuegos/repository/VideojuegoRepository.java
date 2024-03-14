package com.rlibanez.videojuegos.repository;

import com.rlibanez.videojuegos.model.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideojuegoRepository extends JpaRepository<Videojuego, Integer> {
    // JPQL
    // @Query("select v from Videojuego v order by v.nombre")
    // JPQL abreviado para ordenar resultados por el nombre del videojuego
    @Query("from Videojuego v order by v.nombre")
    List<Videojuego> buscarTodos();

    // Native SQL
    @Query(value = "select * from videojuego order by nombre", nativeQuery = true)
    List<Videojuego> buscarTodos2();

    // Consulta automática de Spring
    List<Videojuego> findAllByOrderByNombreAsc();

    // JPQL abreviado para ordenar resultados por el nombre del distribuidor
    @Query("from Videojuego v order by v.distribuidor.nombre")
    List<Videojuego> buscarTodos3();

    // JPQL abreviado
    // ?x hace referencia al parámetro número x del método
    @Query("from Videojuego v where v.distribuidor.id = ?1")
    List<Videojuego> buscarPorDistribuidor(int distribuidorId);

    //// Buscar por nombre del videojuego
    // Con @Query
    @Query("from Videojuego v where v.nombre like %?1%")
    List<Videojuego> buscarPorNombre(String consulta);

    // Con query methods
    List<Videojuego> findByNombreContaining(String consulta);

}
