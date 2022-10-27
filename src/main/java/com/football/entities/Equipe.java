package com.football.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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

}
