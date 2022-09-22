package com.adlinec.td_school.models;

import java.util.ArrayList;

public class Evaluation {
    protected int note;

    protected String matiere;

    protected ArrayList<Evaluation>listeEvaluation = new ArrayList<>();

    public ArrayList<Evaluation> getListeEvaluation() {
        return listeEvaluation;
    }

    public void setListeEvaluation(ArrayList<Evaluation> listeEvaluation) {
        this.listeEvaluation = listeEvaluation;
    }

    public Evaluation(int note, String matiere) {
        this.note = note;
        this.matiere = matiere;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }
}
