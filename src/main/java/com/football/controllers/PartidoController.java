package com.football.controllers;


import java.util.List;
import java.util.Optional;

import com.football.entities.Partido;
import com.football.services.PartidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PartidoController {

    @Autowired
    PartidoService partidoService;

    @GetMapping("Partidos")
    public List<Partido> getAllPartidos(){

        return partidoService.getAllPartidos();
    }
    @GetMapping("Partidos/{id}")
    public Optional<Partido> getPartidoById(@PathVariable Long id){

        return partidoService.getPartidoById(id);
    }
    @PostMapping("Partidos")
    public Partido addPartido(@RequestBody Partido partido){

        return partidoService.addPartido(partido);
    }
    @DeleteMapping("Partidos/{id}")
    public void deleteAllPartido(@PathVariable Long id){

        partidoService.deletePartido(id);
    }
    @PutMapping("Partidos")
    public Partido updatePartido(@RequestBody Partido partido){

        return partidoService.updatePartido(partido);
    }
}

