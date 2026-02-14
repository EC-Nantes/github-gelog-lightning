/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.objet.WoE;

import java.util.Random;

/**
 *
 * @author Oussama
 */
public class Personnage {
    private String nom;
    private int ptVie;
    private int degAtt;
    private int ptPar;
    private int pageAtt;
    private int pagePar;
    private int distAttMax;
    private Point2D pos;
    
    public Personnage(String n, int pV, int dA, int pPar, int paAtt, int paPar, int dMax, Point2D p){
        this.nom = n;
        this.ptVie = pV;
        this.degAtt = dA;
        this.ptPar = pPar;
        this.pageAtt = paAtt;
        this.pagePar = paPar;
        this.distAttMax = dMax;
        this.pos = new Point2D(p);
    }
    public Personnage(Personnage perso){
        this(perso.nom, perso.ptVie, perso.degAtt, perso.ptPar, perso.pageAtt, perso.pagePar, perso.distAttMax, perso.pos);
    }
    
    public Personnage() {
        this("", 0, 0, 0, 0, 0, 0, new Point2D(0,0));
    }

    public String getNom() {
        return nom;
    }

    public int getPtVie() {
        return ptVie;
    }

    public int getDegAtt() {
        return degAtt;
    }

    public int getPtPar() {
        return ptPar;
    }

    public int getPageAtt() {
        return pageAtt;
    }

    public int getPagePar() {
        return pagePar;
    }

    public int getDistAttMax() {
        return distAttMax;
    }

    public Point2D getPos() {
        return pos;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPtVie(int ptVie) {
        this.ptVie = ptVie;
    }

    public void setDegAtt(int degAtt) {
        this.degAtt = degAtt;
    }

    public void setPtPar(int ptPar) {
        this.ptPar = ptPar;
    }

    public void setPageAtt(int pageAtt) {
        this.pageAtt = pageAtt;
    }

    public void setPagePar(int pagePar) {
        this.pagePar = pagePar;
    }

    public void setDistAttMax(int distAttMax) {
        this.distAttMax = distAttMax;
    }

    public void setPos(Point2D pos) {
        this.pos = pos;
    }
    
    public void deplace() {
        Random generateurAleatoire = new Random();
        int randomDx = generateurAleatoire.nextInt(200) - 100;
        int randomDy = generateurAleatoire.nextInt(200) - 100;
        this.pos.translate(randomDx, randomDy);
    }
    
    @Override
    public String toString(){
        return "Personnage nommé : " + nom +
               "\nPoints de vie : " + ptVie +
               "\nDégâts d'attaque : " + degAtt +
               "\nPoints de parade : " + ptPar +
               "\nPourcentage attaque : " + pageAtt +
               "\nPourcentage parade : " + pagePar +
               "\nDistance d'attaque max : " + distAttMax +
               "\nPosition : " + pos;
    }
    
    public void affiche(){
        System.out.println(this);
    }
}
