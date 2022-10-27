package com.football.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data @AllArgsConstructor
@NoArgsConstructor
@Entity
public class Partido {
    @Id
    long id;
    @Column
    String dateMatch;
    @Column
    String heureMatch;

    @JsonIgnore
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "arbitre_id")
        private Arbitre arbitre;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "stade_id")
    private Stade stade;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "partido_equipe", joinColumns = {@JoinColumn(name = "partido_id")}, inverseJoinColumns = {@JoinColumn(name = "equipe_id")})
    private List<Equipe> equipes;

}