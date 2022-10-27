package com.football.controllers;


import java.util.List;
import java.util.Optional;

import com.football.entities.Equipe;
import com.football.entities.Joueur;
import com.football.services.EquipeService;
import com.football.services.JoueurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class JoueurController {

    @Autowired
    JoueurService joueurService;

    @Autowired
    EquipeService equipeService;

    @GetMapping("Joueurs")
    public List<Joueur> getAllJoueurs() {

        return joueurService.getAllJoueurs();
    }

    @GetMapping("Joueurs/{id}")
    public Optional<Joueur> getJoueurById(@PathVariable Long id) {

        return joueurService.getJoueurById(id);
    }

    @PostMapping("Joueurs")
    public Joueur addJoueur(@RequestBody Joueur joueur) {

        return joueurService.addJoueur(joueur);
    }

    @DeleteMapping("Joueurs/{id}")
    public void deleteAllJoueur(@PathVariable Long id) {

        joueurService.deleteJoueur(id);
    }

    @PutMapping("Joueurs")
    public Joueur updateJoueur(@RequestBody Joueur joueur) {

        return joueurService.updateJoueur(joueur);
    }

    @GetMapping("ATLMADRID")
    public List<Joueur> findByNomEquipe(){
        Equipe equipe = equipeService.findByNomEquipe("ATLMADRID");
        return equipe.getJoueurs();
    }
    @GetMapping("attaquant")
    public List<Joueur> findByPosteAndEquipe(){
        Equipe equipe1 = equipeService.findByNomEquipe("PSG");
        return joueurService.findByPosteAndEquipe("attaquant", equipe1);
    }


}
