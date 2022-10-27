package com.football.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

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


    @JsonManagedReference
    @OneToMany(mappedBy = "equipe", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Joueur> joueurs;

    @ManyToMany(mappedBy= "equipes", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Partido> partidos;

}
