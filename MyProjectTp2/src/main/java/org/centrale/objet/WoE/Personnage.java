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
public class Personnage {
    private String nom;
    private int ptVie;
    private int degAtt;
    private int ptPar;
    private int pageAtt;
    private int pagePar;
    private int distAttMax;
    private Point2D pos;
    
    public Personnage(){
    }
    
    public Personnage(String n, int pV, int dA, int pPar, int paAtt, int paPar, int dMax, Point2D p){
        this.nom = n;
        this.ptVie = pV;
        this.degAtt = dA;
        this.ptPar = pPar;
        this.pageAtt = paAtt;
        this.pagePar = paPar;
        this.distAttMax = dMax;
        this.pos= new Point2D(p.getX(),p.getY());  
    }
    
    public Personnage(Personnage perso){
    this.nom = perso.nom;
    this.ptVie = perso.ptVie;
    this.degAtt = perso.degAtt;
    this.ptPar = perso.ptPar;
    this.pageAtt = perso.pageAtt;
    this.pagePar = perso.pagePar;
    this.distAttMax = perso.distAttMax;
    this.pos = new Point2D(perso.pos.getX(),perso.pos.getY());
    }

    public int getPtVie() {
        return ptVie;
    }

    public void setPtVie(int ptVie) {
        this.ptVie = ptVie;
    }

    public int getDegAtt() {
        return degAtt;
    }

    public void setDegAtt(int degAtt) {
        this.degAtt = degAtt;
    }

    public int getPtPar() {
        return ptPar;
    }

    public void setPtPar(int ptPar) {
        this.ptPar = ptPar;
    }

    public int getPageAtt() {
        return pageAtt;
    }

    public void setPageAtt(int pageAtt) {
        this.pageAtt = pageAtt;
    }

    public int getPagePar() {
        return pagePar;
    }

    public void setPagePar(int pagePar) {
        this.pagePar = pagePar;
    }

    public int getDistAttMax() {
        return distAttMax;
    }

    public void setDistAttMax(int distAttMax) {
        this.distAttMax = distAttMax;
    }

    public Point2D getPos() {
        return pos;
    }

    public void setPos(Point2D pos) {
        this.pos = pos;
    }
    
    public void setNom(String n){
        this.nom=n;
    }

    public String getNom() {
        return nom;
    }
    
    public void deplace(){
        Random rand =new Random();
        this.pos.setPosition(rand.nextInt(100),rand.nextInt(100));
    }
   public void affiche(){
        System.out.println("Nom : " + nom);
    System.out.println("Points de vie : " + ptVie);
    System.out.println("Dégâts : " + degAtt);
    System.out.println("Points de parade : " + ptPar);
    System.out.println("Points d'attaque : " + pageAtt);
    System.out.println("Points de parade spéciale : " + pagePar);
    System.out.println("Distance d'attaque max : " + distAttMax);
        }
   
    @Override
    public String toString(){
        String res="Nom: "+nom+"\n"+
                  "Points de vie: "+ptVie+"\n"+
                    "Dégâts : " + degAtt + "\n" +
               "Points de parade : " + ptPar + "\n" +
               "Points d'attaque : " + pageAtt + "\n" +
               "Points de parade spéciale : " + pagePar + "\n" +
               "Distance d'attaque max : " + distAttMax + "\n" +
               "Position : " + pos;
       return res;
        }
    
    /*public void main(String[]args){
    Point2D Position=new Point2D(50,30);
    Personnage p= new Personnage("persoRobin",100,20,10,5,3,position);
    System.out.println(p);
    }*/
}


