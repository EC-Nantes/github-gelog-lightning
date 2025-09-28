/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.objet.WoE;

/**
 *
 * @author user
 */

/* si lobjet ramassé est potionnqui augmente le ptVie */
public class PotionSoin extends Objet{
    private int ptVieRendus; // nb de PtVie rendus
    
    public PotionSoin(int ptVieRendusin) {
        super()
        this.ptVieRendus = ptVieRendus;
    }

    public int getSoin() {
        return ptVieRendus;
    }
    
    public void utiliserObjet(Creature c){
        c.setPtVie(getPtVie()+ptVieRendus);
    }
    
    
}
