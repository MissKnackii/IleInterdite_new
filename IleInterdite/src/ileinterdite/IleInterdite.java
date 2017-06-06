/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ileinterdite;

import View.Observeur;
import View.VueDebutJeu;
import View.VueRules;

/**
 *
 * @author chaulaic
 */
public class IleInterdite implements Observeur{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }

    @Override
    public void letBegin(boolean begin) {
    }

    @Override
    public void letRules(boolean begin) {
        if (begin){
            VueRules rules = new VueRules();
            System.out.println("lancement de l'ihm");
        }
    }

    @Override
    public void letMenu(boolean begin) {
    }

    @Override
    public void menu(boolean b) {
        VueDebutJeu debut = new VueDebutJeu(this);
    }
    
}
