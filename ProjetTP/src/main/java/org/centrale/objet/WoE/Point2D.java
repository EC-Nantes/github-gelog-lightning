/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.objet.WoE;

/**
 *
 * @author Oussama
 */
public class Point2D {
    
    int x;
    int y;
    
    Point2D(){
        x=0;
        y=0;
    }
    Point2D(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    Point2D(Point2D pt){
        x = pt.x;
        y = pt.y;
    }
    
    void setX(int x){
        this.x=x;
    }
    
    void setY(int y){
        this.y=y;
    }
    
    int getX() {
        return x; 
    }
    
    int getY() {
        return y; 
    }
    
    void setPosition(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    void translate(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }
    
    void affiche(){
        System.out.println("[" + x + " , " + y + "]");
    }
    
    double distance(Point2D p){
        int distX = this.x - p.x;
        int distY = this.y - p.y;
        return Math.sqrt(distX*distX + distY*distY);
    }
}

