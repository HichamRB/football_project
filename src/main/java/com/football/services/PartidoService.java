package com.football.services;



import com.football.repository.PartidoReposiroty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.football.entities.Partido;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class PartidoService {


    @Autowired
    PartidoReposiroty partidoRepository;


    public List<Partido> getAllPartidos(){

        return partidoRepository.findAll();
    }

    public Partido addPartido(Partido partido){

        return partidoRepository.save(partido);
    }

    public void deletePartido(Long id){

        partidoRepository.deleteById(id);
    }
    public Optional<Partido> getPartidoById(Long id) {

        return      partidoRepository.findById(id);
    }
    public Partido updatePartido(Partido partido){

        return      partidoRepository.save(partido);
    }
    public List<Partido> findByDateMatch(LocalDate dateMatch) {
        return partidoRepository.findByDateMatch(dateMatch);
    }

    public List<Partido> findByDateMatchBefore(LocalDate dateMatch) {
        return partidoRepository.findByDateMatchBefore(dateMatch);
    }

}
