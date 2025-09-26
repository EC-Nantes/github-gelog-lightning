/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.objet.WoE;

/**
 * 
 * @author user
 */
public class TestWoE {
    public static void main (String[]args){
        Point2D p1=new Point2D(3,4);
        Point2D p2=new Point2D(3,4);
        p1.setPosition(2,5);
        p1.translate(1,-1);
        p1.affiche();
        float d=p1.distance(p2);
        System.out.println("Distance entre p1 et p2 = " + d);
    }
}
