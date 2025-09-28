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
       
        
        World worldtest = new World();
       
        worldtest.robin.affiche();
        worldtest.peon.affiche();
        worldtest.bugs.affiche();
        System.out.println("affichage de wolfie");
        worldtest.wolfie.affiche();
        
        
        worldtest.peon.deplace();
        worldtest.peon.affiche();
        worldtest.bugs.deplace();
        worldtest.bugs.affiche();
        System.out.println("voila deplacement de robin");
        worldtest.robin.deplace();
        worldtest.robin.affiche();
        System.out.println("voila deplacement de guillaumeT");
        worldtest.guillaumeT.deplace();
        worldtest.guillaumeT.affiche();
        
        
        /*worldtest.robin.deplace();
        worldtest.peon.deplace();
        worldtest.bugs.deplace();
        
        
        
        System.out.println("apres");
        
        worldtest.robin.affiche();
        worldtest.peon.affiche();
        worldtest.bugs.affiche();
        
        System.out.println( "copie objet");
         worldtest.robin.affiche();
        worldtest.guillaumeT.affiche();
        
        worldtest.robin.deplace();
        worldtest.guillaumeT.deplace();
        
        worldtest.guillaumeT = new Archer (worldtest.robin);
        worldtest.robin.deplace(); 
        worldtest.robin.affiche();
        
        worldtest.guillaumeT.affiche();*/
    }
}
