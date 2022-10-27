package com.football.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data @AllArgsConstructor
@NoArgsConstructor
@Entity
public class Equipe {
    @Id
    long id;
    @Column
    String nomEquipe;
    @Column
    String pays;

    @JsonIgnore
    @JsonManagedReference
    @OneToMany(mappedBy = "equipe", fetch = FetchType.EAGER)
    private List<Joueur> joueurs;

    @ManyToMany(mappedBy= "equipes", cascade = CascadeType.ALL)
    private List<Partido> partidos;

}
