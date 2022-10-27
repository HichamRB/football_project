package com.football.controllers;


import java.util.List;
import java.util.Optional;

import com.football.entities.Equipe;
import com.football.entities.Partido;
import com.football.services.EquipeService;
import com.football.services.PartidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class EquipeController {

    @Autowired
    EquipeService equipeService;

    @Autowired
    PartidoService partidoService;

    @GetMapping("Equipes")
    public List<Equipe> getAllEquipes(){

        return equipeService.getAllEquipes();
    }
    @GetMapping("Equipes/{id}")
    public Optional<Equipe> getEquipeById(@PathVariable Long id){

        return equipeService.getEquipeById(id);
    }
    @PostMapping("Equipes")
    public Equipe addEquipe(@RequestBody Equipe equipe){

        return equipeService.addEquipe(equipe);
    }
    @DeleteMapping("Equipes/{id}")
    public void deleteAllEquipe(@PathVariable Long id){

        equipeService.deleteEquipe(id);
    }
    @PutMapping("Equipes")
    public Equipe updateEquipe(@RequestBody Equipe equipe){

        return equipeService.updateEquipe(equipe);
    }
    @GetMapping("pays/{pays}")
    public List<Equipe> findByPays(@PathVariable String pays){

        return equipeService.findByPays(pays);
    }

    @GetMapping("nomEquipe/{nomEquipe}")
    public Equipe findByNomEquipe(@PathVariable String nomEquipe){

        return equipeService.findByNomEquipe(nomEquipe);
    }

    @GetMapping("deuxequipe")
    public List<Equipe> finddeuxequipe(){

        Partido partido = partidoService.findById(3L);
        List<Equipe> equipes = partido.getEquipes();
        return equipes;
    }


    }

