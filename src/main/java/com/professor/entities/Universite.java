package com.professor.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUni;
    private String nom;
    private String pays;

    @JsonIgnore
    @OneToMany(mappedBy = "universite")
    private List<Professor> professors;

    public Universite(String nom, String pays, List<Professor> professors) {
        super();
        this.nom = nom;
        this.pays = pays;
        this.professors = professors;
    }

}


