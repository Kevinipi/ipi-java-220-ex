package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

/**
 * Created by pjvilloud on 21/09/17.
 */
public class Employe {
    //constantes

    //Attriubts
        private String nom;
        private  String prenom;
        private String matricule;
        private LocalDate dateEmbauche;
        private Double salaire;

    //Constructeurs
        public Employe() {
    }

    public Employe(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.dateEmbauche = dateEmbauche;
        this.salaire = salaire;
    }
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
    public void setDateEmbauche(LocalDate dateEmbauche) throws Exception {
        this.dateEmbauche = dateEmbauche;
        if (dateEmbauche.isAfter(LocalDate.now())) {
            throw new Exception("La date d'embauche ne peut être postérieure à la date courante");
        }else{
            this.dateEmbauche = dateEmbauche;
        }
        }
        //Methode qui fonctionne ci-dessous pour gerer l'exception
    /*    try {
            if (dateEmbauche.isAfter(LocalDate.now())) {
            }else{
                this.dateEmbauche = dateEmbauche;
            }
        }
        catch(Exception erreurdate ){
            System.out.println("La date d'embauche ne peut être postérieure à la date courante");
        }
    }*/

    //106 : Redéfinir la méthode toString (héritée d'Object) pour afficher un employé de la manière suivante

    public void setSalaire (Double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", matricule='" + matricule + '\'' +
                ", dateEmbauche=" + dateEmbauche +
                ", salaire=" + salaire +
                '}';
     }

     //109 : Coder la méthode augmenterSalaire prenant en paramètre un pourcentage d'augmentation
    // de type Double et augmentant l'attribut salaire du pourcentage passé en paramètre :

    public void augmenterSalaire (Double augmentation) {
        this.salaire = this.salaire*augmentation + this.salaire;
    }

    //Fin des getters et setters

    /*Exercice 103 : Développer et déclarer une méthode GetNombreAnneeAncienneté, calculer le nombre d'année
    d'ancienneté' d un employés
    */

    //Méthodes
    public final Integer getNombreAnneeAnciennete (){
            return LocalDate.now().getYear() - this.dateEmbauche.getYear();
    }

    //110 : Déclarer dans la classe Employe une méthode getPrimeAnnuelle retournant la prime annuelle
    // de base définie dans la classe Entreprise

    public Double getPrimeAnnuelle() {
        return Entreprise.primeAnnuelleBase();
    }
}
