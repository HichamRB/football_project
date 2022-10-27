package com.football.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.football.repository.JoueurRepository;
import com.football.entities.Joueur;
import java.util.List;
import java.util.Optional;

@Service
public class JoueurService {


    @Autowired
    JoueurRepository joueurRepository;

    public List<Joueur> getAllJoueurs(){

        return joueurRepository.findAll();
    }

    public Joueur addJoueur(Joueur joueur){

        return joueurRepository.save(joueur);
    }

    public void deleteJoueur(Long id){

        joueurRepository.deleteById(id);
    }
    public Optional<Joueur> getJoueurById(Long id) {
        return
                joueurRepository.findById(id);
    }
    public Joueur updateJoueur(Joueur joueur){
        return
                joueurRepository.save(joueur);
    }
}
