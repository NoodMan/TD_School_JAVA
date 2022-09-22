package com.adlinec.td_school.models;

import java.util.ArrayList;

public class Etudiant extends Personne {

    protected ArrayList<Evaluation>listeEvaluation = new ArrayList<>();

    public Etudiant(String nom) {
        super(nom);
    }

    public ArrayList<Evaluation> getListeEvaluation() {
        return listeEvaluation;
    }

    public void setListeEvaluation(ArrayList<Evaluation> listeEvaluation) {
        this.listeEvaluation = listeEvaluation;
    }













    //    protected int noteGlobale;
//
//    public Etudiant(String nom, int noteGlobale) {
//        super(nom);
//        this.noteGlobale = noteGlobale;
//    }

//    public int getNoteGlobale() {
//        return noteGlobale;
//    }

//    public void setNoteGlobale(int noteGlobale) {
//        this.noteGlobale = noteGlobale;
//    }

}
