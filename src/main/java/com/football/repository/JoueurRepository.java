package com.football.repository;


import com.football.entities.Equipe;
import com.football.entities.Joueur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface JoueurRepository extends JpaRepository<Joueur, Long> {
    List<Joueur> findByPosteAndEquipe(String poste, Equipe equipe);

}
