package com.football.controllers;


import java.util.List;
import java.util.Optional;

import com.football.entities.Equipe;
import com.football.services.EquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EquipeController {

    @Autowired
    EquipeService equipeService;

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
}

