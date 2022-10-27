package com.football.repository;


import com.football.entities.Stade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StadeRepository extends JpaRepository<Stade, Long> {


}