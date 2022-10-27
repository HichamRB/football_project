package com.football.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

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




    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "stade_id")
    private Stade stade;

}