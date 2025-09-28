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
public class Monstre extends Creature{
    private int ptVie;
    private int degAtt;
    private int ptPar;
    private int pageAtt;
    private int pagePar;
    private Point2D pos;


public Monstre(){
    super(); 
}
public Monstre(int pV, int dA, int pPar, int paAtt, int paPar, Point2D p){
    super(pV, dA, pPar, paAtt, paPar, p);
}
public Monstre(Monstre m){
    super(m);
}
}




























