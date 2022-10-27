package com.football.repository;


import com.football.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Long> {

    public List<Equipe> findByPays(String pays);

    public Equipe findByNom(String nomEquipe);

}
