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
    public static void main(String[] args) {
        // Default constructor
        Point2D p0 = new Point2D();
        System.out.print("p0 = "); 
        p0.affiche();

        // Constructor with parameters
        Point2D p1 = new Point2D(2, 5);
        System.out.print("p1 = "); 
        p1.affiche();

        // Copy constructor
        Point2D p2 = new Point2D(p1);
        System.out.print("p2 (copy of p1) = "); 
        p2.affiche();

        // Setters and setPosition
        p2.setX(10);
        p2.setY(-3);
        System.out.print("p2 modified = "); 
        p2.affiche();

        p2.setPosition(7, 7);
        System.out.print("p2 repositioned = "); 
        p2.affiche();

        // translate
        p2.translate(-2, 4);
        System.out.print("p2 translated = "); 
        p2.affiche();
        
        // getters
        System.out.println("With Getters p2.x = " + p2.getX());
        System.out.println("With Getters p2.y = " + p2.getY());

        // distance
        double d = p1.distance(p2);
        System.out.println("distance(p1, p2) = " + d);
        

    }
}
 
