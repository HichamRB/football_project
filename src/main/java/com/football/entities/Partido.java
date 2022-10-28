package com.football.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Data @AllArgsConstructor
@NoArgsConstructor
@Entity
public class Partido {
    @Id
    long id;
    @Column
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dateMatch;
    @Column
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalTime heureMatch;


    @ManyToOne
    @JsonBackReference
    @JsonIgnore
    @JoinColumn(name = "arbitre_id")
        private Arbitre arbitre;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonBackReference
    @JoinColumn(name = "stade_id")
    private Stade stade;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "partido_equipe", joinColumns = {@JoinColumn(name = "partido_id")}, inverseJoinColumns = {@JoinColumn(name = "equipe_id")})
    private List<Equipe> equipes;

}