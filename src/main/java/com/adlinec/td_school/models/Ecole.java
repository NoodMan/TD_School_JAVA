package com.adlinec.td_school.models;

import java.util.ArrayList;

public class Ecole {

    protected String adresse;

    protected ArrayList<Etudiant>listeEtudiants = new ArrayList<>();

    public Ecole(String adresse) {
        this.adresse = adresse;
    }

//    public float moyenne(){
//        float somme = 0;
//        for(Etudiant etudiant : listeEtudiants) {
//            somme+= etudiant.getNoteGlobale();
//        }
//        return somme / listeEtudiants.size();
//    };

    public float moyenne(){
        float somme = 0;
        int countNote = 0;
        for(Etudiant etudiant : listeEtudiants) {
            for(Evaluation evaluation : etudiant.getListeEvaluation()){
                somme += evaluation.getNote();
                //countNote ++;
            }

            countNote += etudiant.getListeEvaluation().size();
        }
        return somme / countNote;
    }


    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public ArrayList<Etudiant> getListeEtudiants() {
        return listeEtudiants;
    }

    public void setListeEtudiants(ArrayList<Etudiant> listeEtudiants) {
        this.listeEtudiants = listeEtudiants;
    }
}
