package com.football.repository;


import com.football.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Long> {

}