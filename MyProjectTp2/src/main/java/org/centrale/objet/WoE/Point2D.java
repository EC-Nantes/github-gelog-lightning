/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.centrale.objet.WoE;


/**
 * @author user
 */
public class Point2D{
    private int x;
    private int y;


    public Point2D(){
    this.x=0;
    this.y=0;
}
    
    public Point2D(int x, int y){
        this.x=x;
        this.y=y;
    }
    public Point2D(Point2D p){
        this.x=p.x;
        this.y=p.y;
    }
     public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setPosition(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void translate(int dx, int dy){
        this.x+=dx;
        this.y+=dy;
    }
    public double distance(Point2D p){
        double resx=this.x-p.x;
        double resy=this.y-p.y;
        return Math.sqrt(resx*resx+resy*resy);
    }
    @Override
    public String toString(){
        return "l'abscise de ce point est "+x+
                "  le deuxieme coordonnee est "+y;
    }
    public void affiche(){
        System.out.println(this);
    }
    
}
            
    





























