package com.football.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;


@Data @AllArgsConstructor
@NoArgsConstructor
@Entity
public class Arbitre {
    @Id
    long id;
    @Column
    String nom;
    @Column
    String Nationalite;

    @JsonIgnore
    @JsonManagedReference
    @OneToMany(mappedBy = "arbitre")
    private List<Partido> partidos;

}







