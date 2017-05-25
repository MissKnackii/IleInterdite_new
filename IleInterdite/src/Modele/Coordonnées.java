/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author chaulaic
 */
public class Coordonnées {
    public int colonne;
    public int ligne;
    public Tuiles tuile;
    
    public void Coordonnées(int colonne, int ligne, Tuiles tuile) {
        this.setColonne(colonne);
        this.setLigne(ligne);
        this.tuile = tuile;
    }

    public int getColonne() {
        return colonne;
    }

    public int getLigne() {
        return ligne;
    }

    public Tuiles getTuile() {
        return tuile;
    }

    private void setColonne(int colonne) {
        this.colonne = colonne;
    }

    private void setLigne(int ligne) {
        
        this.ligne = ligne;
    }
}
