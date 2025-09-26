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
public class Monstre {
    private int ptVie;
    private int degAtt;
    private int ptPar;
    private int pageAtt;
    private int pagePar;
    private Point2D pos;
    
    public Monstre(){
    }
    
    public Monstre(int pV, int dA, int pPar, int paAtt, int paPar, Point2D p){
        this.ptVie = pV;
        this.degAtt = dA;
        this.ptPar = pPar;
        this.pageAtt = paAtt;
        this.pagePar = paPar;
        this.pos= new Point2D(p.getX(),p.getY());
    }
    
    public Monstre(Monstre m){
    this.ptVie = m.ptVie;
    this.degAtt = m.degAtt;
    this.ptPar = m.ptPar;
    this.pageAtt = m.pageAtt;
    this.pagePar = m.pagePar;
    this.pos= new Point2D(m.pos.getX(),m.pos.getY());
    }
    
    public int getPtVie(){
        return this.ptVie;
    }
    
    public void setPtVie(int pv){
        this.ptVie=pv;
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
        pos.setPosition(rand.nextInt(100),rand.nextInt(100));
    }
    
    public String toString(){
        String res="le point de vie: "+ptVie+"\n"+
               "Dégâts : " + degAtt + "\n" +
               "Points de parade : " + ptPar + "\n" +
               "Points d'attaque : " + pageAtt + "\n" +
               "Points de parade spéciale : " + pagePar + "\n" +
               "Position : " + pos;
        return res;
    }
    
}

