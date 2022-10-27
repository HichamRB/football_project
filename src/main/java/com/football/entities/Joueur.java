package com.football.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data @AllArgsConstructor
@NoArgsConstructor
@Entity
public class Joueur {
    @Id
    long id;
    @Column
    String nomJoueur;
    @Column
    String poste;

    @JsonIgnore
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "equipe_id")
    private Equipe equipe;

}