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
    String nom;
    Boolean vivant;
    int nbAction;
    Color couleur;
    ArrayList<CartesTresors> cartesEnMain;
    
    public void Aventurier(String nom, Boolean vivant, int nbAction, Color couleur) {
        this.setNom(nom);
        this.setVivant(vivant);
        this.setNbAction(nbAction);
        this.setCouleur(couleur);
    }
    
    public void deplacement() {
        
    }

    public void assecher() {
        
    }
    
    //getJoueur()
    
    //getPosition()
    
    //obtenirCarte()

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return the vivant
     */
    public Boolean getVivant() {
        return vivant;
    }

    /**
     * @return the nbAction
     */
    public int getNbAction() {
        return nbAction;
    }

    /**
     * @return the couleur
     */
    public Color getCouleur() {
        return couleur;
    }

    /**
     * @return the cartesEnMain
     */
    public ArrayList<CartesTresors> getCartesEnMain() {
        return cartesEnMain;
    }

    /**
     * @param nom the nom to set
     */
    private void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @param vivant the vivant to set
     */
    private void setVivant(Boolean vivant) {
        this.vivant = vivant;
    }

    /**
     * @param nbAction the nbAction to set
     */
    private void setNbAction(int nbAction) {
        this.nbAction = nbAction;
    }

    /**
     * @param couleur the couleur to set
     */
    private void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    /**
     * @param cartesEnMain the cartesEnMain to set
     */
    private void setCartesEnMain(ArrayList<CartesTresors> cartesEnMain) {
        this.cartesEnMain = cartesEnMain;
    }
}
