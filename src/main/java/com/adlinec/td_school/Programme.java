package com.adlinec.td_school;

import com.adlinec.td_school.models.Ecole;
import com.adlinec.td_school.models.Etudiant;
import com.adlinec.td_school.models.Evaluation;

public class Programme {
    public static void main(String[] args) {

       Ecole ecole = new Ecole("1 000 Mission Street");

//        ecole.getListeEtudiants().add(new Etudiant("Riri", 12));
//        ecole.getListeEtudiants().add(new Etudiant("Fifi", 17));
//        ecole.getListeEtudiants().add(new Etudiant("Loulou", 5));

//        System.out.println(ecole.moyenne());


      Etudiant riri = new Etudiant("Riri");
      Etudiant fifi = new Etudiant("Fifi");
      Etudiant loulou = new Etudiant("Loulou");

        riri.getListeEvaluation().add(new Evaluation(4,"Anglais"));
        riri.getListeEvaluation().add(new Evaluation(8, "Maths"));

        fifi.getListeEvaluation().add(new Evaluation(9, "histoire/geographie"));
        fifi.getListeEvaluation().add(new Evaluation(11,"SVT"));

        loulou.getListeEvaluation().add(new Evaluation(19, "Art plastique"));
        loulou.getListeEvaluation().add(new Evaluation(18,"EPS"));

        ecole.getListeEtudiants().add(riri);
        ecole.getListeEtudiants().add(fifi);
        ecole.getListeEtudiants().add(loulou);

        System.out.println(ecole.moyenne());
    }
}
