package com.professor.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProfessor;
    private String nom;
    private String prenom;
    private Date dateEntree;
    private String matiere;

    @ManyToOne
    private Universite universite;

    public Professor() {
        super();
    }

    public Professor(String nom, String prenom, Date dateEntree, String matiere) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.dateEntree = dateEntree;
        this.matiere = matiere;
    }

    public Long getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(Long idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(Date dateEntree) {
        this.dateEntree = dateEntree;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public Universite getUniversite() {
        return universite;
    }

    public void setUniversite(Universite universite) {
        this.universite = universite;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "idProfessor=" + idProfessor +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateEntree=" + dateEntree +
                ", matiere='" + matiere + '\'' +
                ", universite=" + universite +
                '}';
    }
}

