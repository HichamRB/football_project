package com.football.controllers;


import java.util.List;
import java.util.Optional;

import com.football.entities.Stade;
import com.football.services.StadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StadeController {

    @Autowired
    StadeService stadeService;

    @GetMapping("Stades")
    public List<Stade> getAllStades(){

        return stadeService.getAllStades();
    }
    @GetMapping("Stades/{id}")
    public Optional<Stade> getStadeById(@PathVariable Long id){

        return stadeService.getStadeById(id);
    }

    @PostMapping("Stades")
    public Stade addStade(@RequestBody Stade stade){

        return stadeService.addStade(stade);
    }
    @DeleteMapping("Stades/{id}")
    public void deleteAllStade(@PathVariable Long id){

        stadeService.deleteStade(id);
    }
    @PutMapping("Stades")
    public Stade updateStade(@RequestBody Stade stade){

        return stadeService.updateStade(stade);
    }
}
