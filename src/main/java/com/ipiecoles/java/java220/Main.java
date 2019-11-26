package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenue !");
        System.out.println("le salaire de base est " + Entreprise.SALAIRE_BASE);
        Entreprise e = new Entreprise();

        Employe emp = new Employe();
        Employe emp2 = new Employe("Pose", "Kevin", "71816", LocalDate.now(), Entreprise.SALAIRE_BASE);

            System.out.println(emp.getNom());
            System.out.println(emp2.getNom());
            System.out.println(emp2.getPrenom());
            emp2.setPrenom("Kevin");
            System.out.println(emp2.getPrenom());
    }
}
