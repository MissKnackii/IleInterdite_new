/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import static Modele.Etat.Inondee;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author chaulaic
 */
public class Controleur {
    private int niveauEaux;
    private ArrayList<Aventurier> joueurs;
    private Grille grille;
    private ArrayList<Cartes> cartes;
    
    
    public void jouer() {
        
    }
    
    public Collection getTuileInondée(Grille g) {
        Collection<Tuiles> collecTuilesIn = new ArrayList();
        for (Tuiles t : g.getTuiles()) {
            if (t.getEtat() == Inondee) {
                collecTuilesIn.add(t);
            }        
        }
        return collecTuilesIn;
    }
    
    public void piocheCarte() {
        
    }   
   
    String listeTuile[]= {"","","LePontDesAbimes","LaPorteDeBronze","","",
                          "","LaCaverneDesOmbres","LaPorteDeFer","LaPorteDOr","LesFalaisesDeLOubli","",
                          "LePalaisDeCorail","LaPorteDArgent","LesDunesDeLIllusion","Heliport","LaPorteDeCuivre","LeJardinDesHurlements",
                          "LaForetPourpre","LeLagonPerdu","LeMaraisBrumeux","Observatoire","LeRocherFantome","LaCaverneDuBrasier",
                          "","LeTempleDuSoleil","LeTempleDeLaLune","LePalaisDesMarees","LeValDuCrepuscule","",
                          "","","LaTourDuGuet","LeJardinDesMurmures","",""};
    
    public void patata(){
        for (int l = 1; l<=6;l++) {
            if ((l=1 || l=2 ) || (l = 5 || l=6)) {
                for (int c =1; c<=6; c++) {
                if ((c=1 || c=2 ) || (c = 5 || c=6)) {
                    
                }
            }
            }
            
        }
    }
    
}
        
          
}
