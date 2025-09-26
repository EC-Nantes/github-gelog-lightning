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
public class World {
   public Archer robin;
   public Paysan peon;
   public Lapin bugs;
   
   public World(){
       robin= new Archer();
       peon= new Paysan();
       bugs=new Lapin();
   }
  
   public void creerMondeAlea(){//methode pour positionner les 3 protagonistes
      Random rand = new Random();
      Point2D p1,p2,p3;
      do{
          p1=new Point2D(rand.nextInt(100),rand.nextInt(100));
          p2=new Point2D(rand.nextInt(100),rand.nextInt(100));
          p3=new Point2D(rand.nextInt(100),rand.nextInt(100));
      }
      while(p1.equals(p2) ||  p2.equals(p3) || p3.equals(p1) );
   
      robin.setPos(p1);
      peon.setPos(p2);
      bugs.setPos(p3);
}
}