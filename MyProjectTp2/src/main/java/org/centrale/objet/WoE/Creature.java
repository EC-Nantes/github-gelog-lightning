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
public class Creature {
    private int ptVie;
    private int degAtt;
    private int ptPar;
    private int pageAtt;
    private int pagePar;
    private Point2D pos;


public Creature(){
    this.ptVie=0;
    this.degAtt=0;
    this.ptPar=0;
    this.pageAtt=0;
    this.pagePar=0;
    this.pos= new Point2D();
}

public Creature(int pV, int dA, int pPar, int paAtt, int paPar, Point2D p){
    this.ptVie=pV;
    this.degAtt = dA;
    this.ptPar = pPar;
    this.pageAtt = paAtt;
    this.pagePar = paPar;
    this.pos=new Point2D(p);
}

public Creature(Creature c){
     this.ptVie=c.ptVie;
    this.degAtt =c.degAtt;
    this.ptPar = c.ptPar;
    this.pageAtt =c.pageAtt;
    this.pagePar = c.pagePar;
    this.pos=new Point2D(c.pos);
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

    public Point2D getPos() {
        return pos;
    }

    public void setPos(Point2D pos) {
        this.pos = pos;
    }
    public void deplace(){
        Random rand = new Random();
        this.pos.setPosition(rand.nextInt(100), rand.nextInt(100));
    }
    public void deplace(World monde){
        Random rand =new Random();
        Point2D newpos=new Point2D(rand.nextInt(100),rand.nextInt(100));
        if(!monde.estOccupee(newpos)){
        this.pos=newpos;}
        else{
                System.out.println("Case deja occupe");
                }}
    
    public void deplaceNextCase() {
    Random rand = new Random();
    int dx = rand.nextInt(3) - 1; 
    int dy = rand.nextInt(3) - 1;
    this.getPos().translate(dx, dy);
}    
    
    @Override
    public String toString(){
        String res="le point de vie est "+this.ptVie+"\n"+
                 "Dégâts : " + this.degAtt + "\n" +
               "Points de parade : " + this.ptPar + "\n" +
               "Points d'attaque : " + this.pageAtt + "\n" +
               "Points de parade spéciale : " + this.pagePar + "\n" +
                "la position du monstre est ["+this.pos.getX()+" , "+this.pos.getY()+"]";
        return res;
    }
    public void affiche(){
        System.out.println(this);
    }}


    
