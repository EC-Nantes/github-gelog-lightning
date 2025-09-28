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
public class Guerrier extends Personnage {

    public Guerrier() {
        super();
    }

    public Guerrier(String n, int pV, int dA, int pPar, int paAtt, int paPar, int dMax, Point2D p) {
        super(n, pV, dA, pPar, paAtt, paPar, dMax, p);
    }

    public Guerrier(Guerrier g) {
        super(g);
    }
    
    public void combattre(Creature c) {
    Random rand = new Random();
    int degatsSubis =0;
    // Jet d'attaque
    int jetAttaque = rand.nextInt(100) + 1; // entre 1 et 100
    if (jetAttaque > this.getPageAtt()) {
        System.out.println("Attaque ratee");
    } else {
        System.out.println("Attaque reussie");
        // Jet de défense
        int jetParade = rand.nextInt(100) + 1;
        if (jetParade > c.getPagePar()) {
            // Défenseur rate sa parade
            degatsSubis = this.getDegAtt();
        } else {
            // Défenseur réussit sa parade
            degatsSubis = this.getDegAtt() - c.getPtPar();
        }

        // Appliquer les dégâts (sans négatifs) si l’attaquant a degAtt = 10 et le défenseur ptPar = 20, ça donne 10 - 20 = -10.
        degatsSubis = Math.max(0, degatsSubis);
        c.setPtVie(c.getPtVie() - degatsSubis);

        System.out.println("Dégâts sur le defenseur : " + degatsSubis);
        System.out.println("PV restants du défenseur : " + c.getPtVie());
    }}
}