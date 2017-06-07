/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ileinterdite;

import Modele.Controleur;
import Utile.Message;
import View.VueMenu;
import View.VueRules;

/**
 *
 * @author chaulaic
 */
public class IleInterdite{
    
    static Controleur controleur = null;
    private static Message message;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //controleur.jouer();
        
        VueMenu menu = new VueMenu();
        menu.setVisible(true);
        
        
        VueRules rules = new VueRules();
        
        message = controleur.Listen();
        
        switch(message){
            case RULES : rules.setVisible(true);
                         menu.setVisible(false);
                         break;
            
        }
        
        
        

    }


    
}
