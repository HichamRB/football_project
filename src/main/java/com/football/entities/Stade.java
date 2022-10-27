package com.football.entities;


import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data @AllArgsConstructor
@NoArgsConstructor
@Entity
public class Stade {
    @Id
    long id;
    @Column
    String nomStade;
    @Column
    String ville ;

    @JsonManagedReference
    @OneToMany(mappedBy = "stade")
    @JsonIgnore
    private List<Partido> partidos;

}