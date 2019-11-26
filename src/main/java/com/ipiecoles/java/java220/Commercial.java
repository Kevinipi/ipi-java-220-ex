package com.ipiecoles.java.java220;

//201 : Créer la classe Commercial et faire en sorte qu'elle hérite de la classe Employe

import org.joda.time.LocalDate;

import java.util.zip.DeflaterOutputStream;

public class Commercial extends Employe {

    //constantes

    //202 : Modifier la classe Commercial pour ajouter un attribut caAnnuel de type Double avec son getter et son setter

    //Attriubts
    private Double caAnnuel = 0d;

    //Récupération les valeurs d'un attributs

    public Double getCaAnnuel() {
        return this.caAnnuel;
    }

    //Envoie la valeur de l'attribut récupéré

    public void setCaAnnuel(Double caAnnuel) {
        this.caAnnuel = caAnnuel;
    }

   /* 203 : Modifier la méthode getPrimeAnnuelle précédemment générée par l'IDE pour que la prime
    soit égale à 5% du caAnnuel, avec un minimum de 500 € même en cas de chiffre d'affaire nul(l).*/

    @Override
    public Double getPrimeAnnuelle() {
        return Math.max(Math.ceil(this.caAnnuel * 0.05),500.0);
    }
}
