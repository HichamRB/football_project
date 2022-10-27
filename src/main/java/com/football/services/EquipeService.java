package com.football.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.football.entities.Equipe;
import com.football.repository.EquipeRepository;
import java.util.List;
import java.util.Optional;

@Service
public class EquipeService {


    @Autowired
    EquipeRepository equipeService;

    public List<Equipe> getAllEquipes(){

            return equipeService.findAll();
    }

            public Equipe addEquipe(Equipe equipe) {

        return equipeService.save(equipe);
    }

    public Optional<Equipe> getEquipeById(Long id) {

        return equipeService.findById(id);
    }
    public void deleteEquipe(Long id) {

        equipeService.deleteById(id);
    }
    public Equipe updateEquipe(Equipe equipe) {

        return equipeService.save(equipe);
    }

    public List<Equipe> findByPays(String pays) {
        return equipeService.findByPays(pays);
    }

    public Equipe findByNomEquipe(String nomEquipe) {

        return equipeService.findByNomEquipe(nomEquipe);
    }

}