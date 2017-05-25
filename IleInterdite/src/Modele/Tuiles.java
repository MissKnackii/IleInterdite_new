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
    String nom;
    Etat etat; 
    Color couleur;
    Tresor tresor;
    Aventurier departAventurier;
    ArrayList<Aventurier> possedeAventurier;
    Coordonnées coordonnée;
    
    public void tuiles(String nom, Etat etat, Color couleur, Tresor tresor) {
        this.setNom(nom);
        this.setEtat(etat);
        this.setCouleur(couleur);
        this.setTresor(tresor);
    }

    /**
     * @return the etat
     */
    public Etat getEtat() {
        return etat;
    }

    /**
     * @return the nom
     */
    String getNom() {
        return nom;
    }

    /**
     * @return the couleur
     */
    Color getCouleur() {
        return couleur;
    }

    /**
     * @return the tresor
     */
    Tresor getTresor() {
        return tresor;
    }

    /**
     * @return the departAventurier
     */
    Aventurier getDepartAventurier() {
        return departAventurier;
    }

    /**
     * @return the possedeAventurier
     */
    ArrayList<Aventurier> getPossedeAventurier() {
        return possedeAventurier;
    }

    /**
     * @return the coordonnée
     */
    Coordonnées getCoordonnée() {
        return coordonnée;
    }

    /**
     * @param nom the nom to set
     */
    void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @param etat the etat to set
     */
    void setEtat(Etat etat) {
        this.etat = etat;
    }

    /**
     * @param couleur the couleur to set
     */
    void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    /**
     * @param tresor the tresor to set
     */
    void setTresor(Tresor tresor) {
        this.tresor = tresor;
    }

    /**
     * @param departAventurier the departAventurier to set
     */
    void setDepartAventurier(Aventurier departAventurier) {
        this.departAventurier = departAventurier;
    }

    /**
     * @param possedeAventurier the possedeAventurier to set
     */
    void setPossedeAventurier(ArrayList<Aventurier> possedeAventurier) {
        this.possedeAventurier = possedeAventurier;
    }

    /**
     * @param coordonnée the coordonnée to set
     */
    void setCoordonnée(Coordonnées coordonnée) {
        this.coordonnée = coordonnée;
    }
    
}
