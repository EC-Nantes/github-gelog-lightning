/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
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
    
    Creature [] creatures;
    
    Epée sif;
    PotionSoin diamond;
    Objet[] objets;
            
    public World(){
        robin= new Archer();
        peon= new Paysan();
        bugs= new Lapin();
        bugs2= new Lapin();
        guillaumeT= new Archer(robin);
        grosBill= new Guerrier();
        wolfie= new Loup();
        sif=new Epée();
        diamond= new PotionSoin();
        objets = new Objet[]{sif, diamond};
        creatures = new Creature[]{robin, peon, bugs, bugs2, guillaumeT, grosBill,wolfie};
    }
        public void creerMondeAlea(){
        Point2D p1, p2,p3,p4,p5,p6,p7,p8,p9;
        Random rand =new Random();
        do{
            p1=new Point2D(rand.nextInt(100),rand.nextInt(100));
            p2=new Point2D(rand.nextInt(100),rand.nextInt(100));
            p3=new Point2D(rand.nextInt(100),rand.nextInt(100));
            p4=new Point2D(rand.nextInt(100),rand.nextInt(100));
            p5=new Point2D(rand.nextInt(100),rand.nextInt(100));
            p6=new Point2D(rand.nextInt(100),rand.nextInt(100));
            p7=new Point2D(rand.nextInt(100),rand.nextInt(100));
            p8=new Point2D(rand.nextInt(100),rand.nextInt(100));
            p9=new Point2D(rand.nextInt(100),rand.nextInt(100));
        }while(p1.equals(p2) || p2.equals(p3) ||  p3.equals(p4) ||  p4.equals(p5) ||  p5.equals(p6) ||  p6.equals(p7) ||  p7.equals(p8)  ||  p8.equals(p9) ||  p9.equals(p1) );
        
        robin.setPos(p1);
        peon.setPos(p2);
        bugs.setPos(p3);
        bugs2.setPos(p4);
        guillaumeT.setPos(p5);
        grosBill.setPos(p6);
        wolfie.setPos(p7);
        sif.setPosition(p8);
        diamond.setPosition(p8);
    }
    public boolean estOccupee(Point2D p){
    if(robin.getPos().equals(p) || peon.getPos().equals(p) || bugs.getPos().equals(p) || bugs2.getPos().equals(p) || guillaumeT.getPos().equals(p) || grosBill.getPos().equals(p) || wolfie.getPos().equals(p)) 
    {return true;}
    else 
    {return false;}
    }    
   
    public void deplaceCreature(Creature c) {
    c.deplace();
    for (Objet o : objets) {
        if (o.getPosition().equals(c.getPos())) {
            o.utiliserObjet(c);
            
        }
    }
    }
    
       public void tourDeJeu(){
        for(Creature c: creatures){
            c.deplace(this);
}
    for(int i=0;i<3;i++){
       for(int j=0;j<3;j++){
           if(i!=j){
         Creature c=creatures[i];
         Creature c2=creatures[j];
         if (c instanceof Archer) ((Archer) c).combattre(c2);
         if (c instanceof Guerrier) ((Archer) c).combattre(c2);
         if (c instanceof Loup) ((Archer) c).combattre(c2);
           }
         
    }}}
    
    public void affiche(){
        /*int monmonde[][]=new int[50][50];
        for (int row=0; row<monmonde.length; row++){
            for(int col=0; col< monmonde[row].length; col++){
                if(monmonde[row][col]==)*/
    System.out.println("=== Créatures ===");
    System.out.println("Archer Robin : " + robin.getPos());
    System.out.println("Paysan Peon : " + peon.getPos());
    System.out.println("Lapin Bugs : " + bugs.getPos());
    System.out.println("Lapin Bugs2 : " + bugs2.getPos());
    System.out.println("Archer GuillaumeT : " + guillaumeT.getPos());
    System.out.println("Guerrier GrosBill : " + grosBill.getPos());
    System.out.println("Loup Wolfie : " + wolfie.getPos());

    System.out.println("=== Objets ===");
    for (Objet o : objets) {
        System.out.println(o.getNom() + " : " + o.getPosition());
    }
}        
            }
    

    

































