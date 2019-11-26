package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

/**
 * Created by pjvilloud on 21/09/17.
 */
public class Employe {
    private String nom;
    private  String prenom;
    private String matricule;
    private LocalDate dateEmbauche;
    private Double salaire;

    //Récupération les valeurs d'un attributs

    public String getNom() {
        return this.nom;
    }
    public String getPrenom() {
        return this.prenom;
    }
    public String getMatricule() {
        return this.matricule;
    }
    public LocalDate getDateEmbauche() {
        return this.dateEmbauche;
    }
    public Double getSalaire () {
        return this.salaire;
    }
    //Envoie la valeur de l'attribut récupéré

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    public void setDateEmbauche(LocalDate dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }
    public void setSalaire (Double salaire) {
        this.salaire = salaire;
    }
    
}
