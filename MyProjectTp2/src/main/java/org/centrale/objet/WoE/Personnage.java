/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.objet.WoE;
import java.util.Random;

/**
 *
 * @author user
 */ 
public class Personnage extends Creature{
    private String nom;
    private int distAttMax;


public Personnage(){
    super();
    this.nom="";
    this.distAttMax = 0;}

public Personnage(String n, int pV, int dA, int pPar, int paAtt, int paPar, int dMax, Point2D p){
   super(pV, dA, pPar, paAtt, paPar, p);
    this.nom = n;
    this.distAttMax = dMax;
}
public Personnage (Personnage perso){
    super(perso);
    this.nom=perso.nom;
    this.distAttMax = perso.distAttMax;
}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDistAttMax() {
        return distAttMax;
    }

    public void setDistAttMax(int distAttMax) {
        this.distAttMax = distAttMax;
    }
    
    public String toString() {
    return "Personnage{" +
           "nom='" + nom + '\'' +
           ", distAttMax=" + distAttMax +
           ", " + super.toString() + // ajoute les infos de Creature
           '}';
}
    public void affiche(){
        System.out.println(this);
    }
    
    public void deplace(World monde) {
        super.deplace(monde);
        monde.deplaceCreature(this);
    }
}



     
       




