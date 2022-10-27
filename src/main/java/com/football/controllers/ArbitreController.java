package com.football.controllers;


import java.util.List;
import java.util.Optional;

import com.football.entities.Arbitre;
import com.football.services.ArbitreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ArbitreController {

    @Autowired
    ArbitreService arbitreService;

    @GetMapping("Arbitres")
    public List<Arbitre> getAllArbitres(){

        return arbitreService.getAllArbitres();
    }
    @GetMapping("Arbitres/{id}")
    public Optional<Arbitre> getArbitreById(@PathVariable Long id){

        return arbitreService.getArbitreById(id);
    }
    @PostMapping("Arbitres")
    public Arbitre addArbitre(@RequestBody Arbitre arbitre){

        return arbitreService.addArbitre(arbitre);
    }
    @DeleteMapping("Arbitres/{id}")
    public void deleteAllArbitre(@PathVariable Long id){

        arbitreService.deleteArbitre(id);
    }
    @PutMapping("Arbitres")
    public Arbitre updateArbitre(@RequestBody Arbitre arbitre){

        return arbitreService.updateArbitre(arbitre);
    }
}
