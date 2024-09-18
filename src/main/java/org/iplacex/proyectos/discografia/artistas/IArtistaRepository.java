package org.iplacex.proyectos.discografia.artistas;

import java.util.List;

import org.iplacex.proyectos.discografia.discos.Disco;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;


public interface IArtistaRepository extends MongoRepository<Artista, String> {
@Query("{ 'idArtista': ?0 }")
    List<Disco> findDiscosByIdArtista(String idArtista);
}
