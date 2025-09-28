/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.objet.WoE;

/**
 *
 * @author user
 */
public abstract class Objet {
    private String nom;
    private Point2D position;

    public Objet() {
        this.nom = "Objet";
        this.position = new Point2D();
    }

    public Objet(String nom, Point2D position) {
        this.nom = nom;
        this.position = position;
    }
    
    public Objet(Objet objt) {
        this.nom = objt.nom;
        this.position = objt.position;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Point2D getPosition() {
        return position;
    }

    public void setPosition(Point2D position) {
        this.position = position;
    }

    public abstract void utiliserObjet(Creature c);

    @Override
    public String toString() {
        return "Objet{" +
                "nom='" + nom + '\'' +
                ", position=" + position +
                '}';
    }
}
