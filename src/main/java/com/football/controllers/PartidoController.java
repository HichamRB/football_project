package com.football.controllers;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.football.entities.Equipe;
import com.football.entities.Joueur;
import com.football.entities.Partido;
import com.football.entities.Stade;
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

    @GetMapping("DateMatch")
    public List<Partido> findByDateMatch(){

        return partidoService.findByDateMatch(LocalDate.parse("2021-02-28"));
    }

    @DeleteMapping("delete")
    public void findByDateMatchBefore(){
        List<Partido> matchFoots = partidoService.findByDateMatchBefore(LocalDate.now());
        matchFoots.forEach((matchFound) -> {
            partidoService.deleteById(matchFound.getId());
        });
        System.out.println(partidoService.findAll());
    }
}

