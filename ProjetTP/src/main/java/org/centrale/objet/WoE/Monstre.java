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
    
public Monstre(int pV, int dA, int pPar, int paAtt, int paPar, Point2D p){
    ptVie=pV;
    degAtt=dA;
    pPar=ptPar;
    paAtt=pageAtt;
    paPar=pagePar;
    pos =new Point2D(p);
}

public Monstre (Monstre m){
this(m.ptVie, m.degAtt, m.ptPar, m.pageAtt, m.pagePar, m.pos);
}

public Monstre()
{this(0,0,0,0,0,new Point2D(0,0));}

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

    public Point2D getPos() {
        return pos;
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

    public void setPos(Point2D pos) {
        this.pos = pos;
    }



public void deplace() {
    Random rd =new Random();
        int dx = rd.nextInt(100)-200; 
        int dy = rd.nextInt(100)-200;
        this.pos.translate(dx, dy);
    }

public String toString(){
 String res= "pt de vie est "+ptVie+"2eme var est: "+degAtt;
 return res;
}

void affiche(){
    System.out.println(this);// println(objet) chercher son toString
           }
}


