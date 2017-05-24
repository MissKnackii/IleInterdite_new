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
    private int colonne;
    private int ligne;
    private Tuiles tuile;
    
    public void Coordonnées(int colonne, int ligne, Tuiles tuile) {
        this.colonne = colonne;
        this.ligne = ligne;
        this.tuile = tuile;
    }
}
