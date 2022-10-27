package com.football.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.football.entities.Partido;

import javax.servlet.http.Part;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface PartidoReposiroty extends JpaRepository<Partido, Long>{

    public List<Partido> findByDateMatch(LocalDate dateMatch);

    public List<Partido> findByDateMatchBefore(LocalDate dateMatch);

}
