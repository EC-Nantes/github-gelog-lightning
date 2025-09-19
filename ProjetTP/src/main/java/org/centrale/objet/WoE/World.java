/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.objet.WoE;

/**
 *
 * @author user
 */
public class World {
    public Archer robin;
    public Paysan peon;
    public Lapin bugs;
    
    public World(){
     this.robin= new Archer();
      this.peon= new Archer();
       this.bugs= new Archer();
    }
    public void CreeMondeAlea(){
        
    }
}

