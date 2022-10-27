package com.football.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.football.repository.ArbitreRepository;
import com.football.entities.Arbitre;
import java.util.List;
import java.util.Optional;

@Service
public class ArbitreService {


    @Autowired
    ArbitreRepository arbitreRepository;


    public List<Arbitre> getAllArbitres(){
        
        return arbitreRepository.findAll();
    }

    public Arbitre addArbitre(Arbitre arbitre){
        
        return arbitreRepository.save(arbitre);
    }

    public void deleteArbitre(Long id){

        arbitreRepository.deleteById(id);
    }
    public Optional<Arbitre> getArbitreById(Long id) {

        return      arbitreRepository.findById(id);
    }
    public Arbitre updateArbitre(Arbitre arbitre){

        return       arbitreRepository.save(arbitre);
    }
}