/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.centrale.objet.WoE;

/**
 * @author user
 */
public class Point2D {
 private int x;
    private int y;
    
    public Point2D(){
        }
    
    public Point2D(int x, int y){
    this.x=x;
    this.y=y;
    }
    
    public Point2D(Point2D p){
        this.x=p.x;
        this.y=p.y;
    }
    
    public void setX(int x){
        this.x=x;
    }
    
    public void setY(int y){
        this.y=y;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public void setPosition(int x, int y){
        this.x=x;
        this.y=y;
                }
    
    public void translate(int dx, int dy){
        this.x+=dx;
        this.y+=dy;
                }
    
    public void affiche(){
       System.out.println("labscisse est: "+x+" et lordonne est: "+y);
                }
    
    public float distance(Point2D p){
        float resx=this.x-p.x;
        float resy=this.y-p.y;
       return  (float) Math.sqrt(resx*resx+resy*resy);
    }
    
}
