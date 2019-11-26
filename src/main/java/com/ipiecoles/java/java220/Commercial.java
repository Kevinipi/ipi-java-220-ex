package com.ipiecoles.java.java220;

//201 : Créer la classe Commercial et faire en sorte qu'elle hérite de la classe Employe

import org.joda.time.LocalDate;

public class Commercial extends Employe {

    //constantes

    //202 : Modifier la classe Commercial pour ajouter un attribut caAnnuel de type Double avec son getter et son setter

    //Attriubts
    private Double caAnnuel;

    //Récupération les valeurs d'un attributs

    public Double getCaAnnuel() {
        return this.caAnnuel;
    }

    //Envoie la valeur de l'attribut récupéré

    public void setCaAnnuel(Double caAnnuel) {
        this.caAnnuel = caAnnuel;
    }
}
