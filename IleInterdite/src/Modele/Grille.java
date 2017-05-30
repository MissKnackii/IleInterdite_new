/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author chaulaic
 */
public class Grille {
    private HashMap<Integer,Tuiles>aze = new HashMap<Integer,Tuiles>();
    private ArrayList<Tuiles> tuiles;

    /**
     * @return the tuiles
     */
    public ArrayList<Tuiles> getTuiles() {
        return tuiles;
    }

    /**
     * @param tuiles the tuiles to set
     */
    public void setTuiles(ArrayList<Tuiles> tuiles) {
        this.tuiles = tuiles;
    }
    
    public void addTuiles(Integer i,Tuiles t) {
        aze.put(i, t);
    }
}
