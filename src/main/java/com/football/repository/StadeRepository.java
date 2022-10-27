package com.football.repository;


import com.football.entities.Partido;
import com.football.entities.Stade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface StadeRepository extends JpaRepository<Stade, Long> {

}