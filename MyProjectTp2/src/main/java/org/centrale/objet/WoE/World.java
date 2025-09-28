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
public class World{
    Archer robin;
    Paysan peon;
    Lapin bugs;
    Lapin bugs2;
    Archer guillaumeT;
    Guerrier grosBill;
    Loup wolfie;
            
    public World(){
        robin= new Archer();
        peon= new Paysan();
        bugs= new Lapin();
        bugs2= new Lapin();
        guillaumeT= new Archer(robin);
        grosBill= new Guerrier();
        wolfie= new Loup();
    }
    public void creerMondeAlea(){
        Point2D p1, p2,p3,p4,p5,p6,p7;
        Random rand =new Random();
        do{
            p1=new Point2D(rand.nextInt(100),rand.nextInt(100));
            p2=new Point2D(rand.nextInt(100),rand.nextInt(100));
            p3=new Point2D(rand.nextInt(100),rand.nextInt(100));
            p4=new Point2D(rand.nextInt(100),rand.nextInt(100));
            p5=new Point2D(rand.nextInt(100),rand.nextInt(100));
            p6=new Point2D(rand.nextInt(100),rand.nextInt(100));
            p7=new Point2D(rand.nextInt(100),rand.nextInt(100));
        }while(p1.equals(p2) || p2.equals(p3) ||  p3.equals(p1) ||  p4.equals(p1) ||  p5.equals(p1) ||  p6.equals(p1) ||  p7.equals(p1) );
        
        robin.setPos(p1);
        peon.setPos(p2);
        bugs.setPos(p3);
        bugs2.setPos(p4);
        guillaumeT.setPos(p5);
        grosBill.setPos(p6);
        wolfie.setPos(p7);
    }
    public boolean estOccupee(Point2D p){
    if(robin.getPos().equals(p) || peon.getPos().equals(p) || bugs.getPos().equals(p)) 
    {return true;}
    else 
    {return false;}
    }    
}
































