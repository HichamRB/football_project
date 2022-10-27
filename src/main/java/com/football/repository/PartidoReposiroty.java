package com.football.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.football.entities.Partido;

@Repository
public interface PartidoReposiroty extends JpaRepository<Partido, Long>{

}
