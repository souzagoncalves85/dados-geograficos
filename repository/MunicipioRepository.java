/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.example.model.Municipio;

/**
 *
 * @author caian
 */
public interface MunicipioRepository extends JpaRepository<Municipio, Integer>{
        
    @Query("select m2 from Municipio m1, Municipio m2 where within(m2.geometria, m1.geometria) = true and m1.nome = :nomeMunicipio")
    List<Municipio> findMunicipiosDentroDeOutroMunicipio(@Param("nomeMunicipio") String nomeMunicipio);

    @Query("SELECT m2 FROM Municipio m1, Municipio m2 WHERE touches(m2.geometria, m1.geometria) = true AND m1.nome = :nomeMunicipio")
    List<Municipio> findMunicipiosQueTocamOutroMunicipio(@Param("nomeMunicipio") String nomeMunicipio);

    @Query("SELECT m2 FROM Municipio m1, Municipio m2 WHERE intersects(m2.geometria, m1.geometria) = true AND m1.nome = :nomeMunicipio")
    List<Municipio> findMunicipiosQueIntersectam(@Param("nomeMunicipio") String nomeMunicipio);
}
