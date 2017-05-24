/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author chaulaic
 */
public class Tuiles {
    private String nom;
    private int etat; 
    private Color couleur;
    private Tresor tresor;
    private Aventurier departAventurier;
    private ArrayList<Aventurier> possedeAventurier;
    private Coordonnées coordonnée;
    
    public void tuiles(String nom, int etat, Color couleur, Tresor tresor) {
        this.nom = nom;
        this.etat = etat;
        this.couleur = couleur;
        this.tresor = tresor;
    }

    /**
     * @return the etat
     */
    public int getEtat() {
        return etat;
    }
    
}
