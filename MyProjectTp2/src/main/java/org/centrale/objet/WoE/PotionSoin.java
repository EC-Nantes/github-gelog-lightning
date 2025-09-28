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
    
    public PotionSoin(){
        super();
        this.ptVieRendus=0;
    }
    
    public PotionSoin(String nom, Point2D position,int ptVieRendusin) {
        super(nom, position);
        this.ptVieRendus = ptVieRendus;
    }
    public PotionSoin(PotionSoin pS){
        super(pS);
        this.ptVieRendus=pS.ptVieRendus;
    }

    public int getSoin() {
        return ptVieRendus;
    }
    
    public void utiliserObjet(Creature c){
        c.setPtVie(c.getPtVie()+ptVieRendus);
    }

    public void setPtVieRendus(int ptVieRendus) {
        this.ptVieRendus = ptVieRendus;
    }
    
}
