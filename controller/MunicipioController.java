package br.com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.example.model.Municipio;
import br.com.example.repository.MunicipioRepository;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@RestController
@CrossOrigin(origins = "*")
@OpenAPIDefinition(info = @Info(title = "Municípios API", version = "1.0", description = "Dados de Municípios"))
public class MunicipioController {
    
    @Autowired
    private MunicipioRepository repository;

    // Encontrar municípios que estão inteiramente contidos dentro de outro município pelo nome
    @GetMapping("/municipios/dentro-de-outro/{nomeMunicipio}")
    public List<Municipio> getMunicipiosDentroDeOutroMunicipio(@PathVariable String nomeMunicipio) {
        List<Municipio> result = repository.findMunicipiosDentroDeOutroMunicipio(nomeMunicipio);
        return result;
    }

    @GetMapping("/municipios/tocam/{nomeMunicipio}")
    public List<Municipio> getMunicipiosQueTocamOutroMunicipio(@PathVariable String nomeMunicipio) {
        List<Municipio> result = repository.findMunicipiosQueTocamOutroMunicipio(nomeMunicipio);
        return result;
    }

    @GetMapping("/municipios/intersectam/{nomeMunicipio}")
    public List<Municipio> getMunicipiosQueIntersectam(@PathVariable String nomeMunicipio) {
        List<Municipio> result = repository.findMunicipiosQueIntersectam(nomeMunicipio);
        return result;
    }
   
}