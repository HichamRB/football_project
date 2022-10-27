package com.football.services;


import com.football.entities.Stade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.football.repository.StadeRepository;
import com.football.entities.Arbitre;
import java.util.List;
import java.util.Optional;

@Service
public class StadeService {


    @Autowired
    StadeRepository stadeRepository;


    public List<Stade> getAllStades(){

        return stadeRepository.findAll();
    }

    public Stade addStade(Stade stade){

        return stadeRepository.save(stade);
    }

    public void deleteStade(Long id){

        stadeRepository.deleteById(id);
    }
    public Optional<Stade> getStadeById(Long id) {

        return   stadeRepository.findById(id);
    }
    public Stade updateStade(Stade stade){

        return    stadeRepository.save(stade);
    }
    public Optional<Stade> findById(Long id) {
        return stadeRepository.findById(id);
    }
}



