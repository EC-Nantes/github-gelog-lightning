/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.objet.WoE;

/**
 *
 * @author user
 */
/*
Epée : pourrait augmenter les dégâts d'attaque d'une creature.
 */
public class Epée extends Objet {
    private int bonusAtt;
    
    public Epée(){
        super();
        this.bonusAtt=0;   
                }

    public Epée(String nom, Point2D position, int bonusAtt) {
        super(nom, position);
        this.bonusAtt = bonusAtt;
    }
    
    public Epée(Epée e) {
        super(e);
        this.bonusAtt = e.bonusAtt;
    }
    
    public void setBonusAtt(int bonusAtt) {
        this.bonusAtt=bonusAtt;
    }
    
    public int getBonusAtt() {
        return bonusAtt;
    }
    
    public void utiliserObjet(Creature c){
        c.setDegAtt(c.getDegAtt()+bonusAtt);
    }
}
