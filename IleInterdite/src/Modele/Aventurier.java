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
public class Aventurier {
    private String nom;
    private Boolean vivant;
    private int nbAction;
    private Color couleur;
    private ArrayList<CartesTresors> cartesEnMain;
    
    public void Aventurier(String nom, Boolean vivant, int nbAction, Color couleur) {
        this.nom = nom;
        this.vivant = vivant;
        this.nbAction = nbAction;
        this.couleur = couleur;
    }
    
    public void deplacement() {
        
    }

    public void assecher() {
        
    }
    
    //getJoueur()
    
    //getPosition()
    
    //obtenirCarte()
}
