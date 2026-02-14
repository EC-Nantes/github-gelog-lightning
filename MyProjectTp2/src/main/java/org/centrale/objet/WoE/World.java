/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.objet.WoE;

import java.util.*;

/**
 * Représente le monde du jeu. Contient les personnages, les monstres et les objets.
 * 
 * <p>La classe {@code World} permet de générer aléatoirement un ensemble d'entités 
 * (archers, guerriers, paysans, monstres, objets, etc.) sur une grille carrée. 
 * Elle gère également la détection de collisions, la génération de noms uniques 
 * et le déroulement d’un tour de jeu.</p>
 * 
 * @author Imane
 */
public class World {

    /** Taille de la grille par défaut (50x50). */
    public static final int TAILLE_PAR_DEFAUT = 50;

    /** Liste des personnages présents dans le monde. */
    protected ArrayList<Personnage> maListePers;

    /** Liste des monstres présents dans le monde. */
    protected ArrayList<Monstre> maListeMons;

    /** Liste des objets (armes, potions, etc.) présents dans le monde. */
    protected ArrayList<Objet> maListeobj;

    /** Ensemble des noms déjà utilisés pour éviter les doublons. */
    protected HashSet<String> nomsUtilises;

    /**
     * Constructeur par défaut. Initialise les listes et la structure du monde.
     */
    public World() {
        maListePers = new ArrayList<>();
        maListeMons = new ArrayList<>();
        maListeobj = new ArrayList<>();
        nomsUtilises = new HashSet<>();
    }

    /**
     * Crée un monde aléatoire avec un nombre défini de personnages, monstres et objets.
     *
     * @param nbArcher   nombre d'archers à générer
     * @param nbPaysan   nombre de paysans à générer
     * @param nbLapin    nombre de lapins (monstres) à générer
     * @param nbGuerrier nombre de guerriers à générer
     * @param nbLoup     nombre de loups (monstres) à générer
     * @param nbPotion   nombre de potions de soin à générer
     * @param nbEpee     nombre d'épées à générer
     */
    public void creerMondeAlea(int nbArcher, int nbPaysan, int nbLapin,
                               int nbGuerrier, int nbLoup, int nbPotion, int nbEpee) {
        Random rand = new Random();
        Point2D newpos;

        // Archers
        for (int i = 0; i < nbArcher; i++) {
            Archer a = new Archer();
            definirStatsAlea(a);
            do {
                newpos = new Point2D(rand.nextInt(TAILLE_PAR_DEFAUT), rand.nextInt(TAILLE_PAR_DEFAUT));
            } while (estOccupee(newpos));
            a.setPos(newpos);
            maListePers.add(a);
        }

        // Paysans
        for (int i = 0; i < nbPaysan; i++) {
            Paysan p = new Paysan();
            definirStatsAlea(p);
            do {
                newpos = new Point2D(rand.nextInt(TAILLE_PAR_DEFAUT), rand.nextInt(TAILLE_PAR_DEFAUT));
            } while (estOccupee(newpos));
            p.setPos(newpos);
            maListePers.add(p);
        }

        // Lapins
        for (int i = 0; i < nbLapin; i++) {
            Lapin l = new Lapin();
            definirStatsAlea(l);
            do {
                newpos = new Point2D(rand.nextInt(TAILLE_PAR_DEFAUT), rand.nextInt(TAILLE_PAR_DEFAUT));
            } while (estOccupee(newpos));
            l.setPos(newpos);
            maListeMons.add(l);
        }

        // Guerriers
        for (int i = 0; i < nbGuerrier; i++) {
            Guerrier g = new Guerrier();
            definirStatsAlea(g);
            do {
                newpos = new Point2D(rand.nextInt(TAILLE_PAR_DEFAUT), rand.nextInt(TAILLE_PAR_DEFAUT));
            } while (estOccupee(newpos));
            g.setPos(newpos);
            maListePers.add(g);
        }

        // Loups
        for (int i = 0; i < nbLoup; i++) {
            Loup l = new Loup();
            definirStatsAlea(l);
            do {
                newpos = new Point2D(rand.nextInt(TAILLE_PAR_DEFAUT), rand.nextInt(TAILLE_PAR_DEFAUT));
            } while (estOccupee(newpos));
            l.setPos(newpos);
            maListeMons.add(l);
        }

        // Potions
        for (int i = 0; i < nbPotion; i++) {
            String nomPotion = "Potion" + (i + 1);
            int ptVieRendus = 10 + rand.nextInt(41); // 10 à 50 PV
            do {
                newpos = new Point2D(rand.nextInt(TAILLE_PAR_DEFAUT), rand.nextInt(TAILLE_PAR_DEFAUT));
            } while (estOccupee(newpos));
            PotionSoin p = new PotionSoin(nomPotion, newpos, ptVieRendus);
            maListeobj.add(p);
        }

        // Épées
        for (int i = 0; i < nbEpee; i++) {
            String nomEpee = "Epée" + (i + 1);
            int bonusAtt = 5 + rand.nextInt(16); // 5 à 20
            do {
                newpos = new Point2D(rand.nextInt(TAILLE_PAR_DEFAUT), rand.nextInt(TAILLE_PAR_DEFAUT));
            } while (estOccupee(newpos));
            Epée e = new Epée(nomEpee, newpos, bonusAtt);
            maListeobj.add(e);
        }
    }

    /**
     * Définit aléatoirement les statistiques de base d'une créature.
     *
     * @param c la créature à initialiser
     */
    private void definirStatsAlea(Creature c) {
        Random rand = new Random();
        c.setPtVie(50 + rand.nextInt(51));
        c.setDegAtt(10 + rand.nextInt(21));
        c.setPtPar(5 + rand.nextInt(16));
        c.setPageAtt(5 + rand.nextInt(16));
        c.setPagePar(5 + rand.nextInt(16));

        if (c instanceof Personnage) {
            ((Personnage) c).setDistAttMax(1 + rand.nextInt(10));
            ((Personnage) c).setNom(genererNomUnique());
        }
    }

    /**
     * Génère un nom unique composé de lettres aléatoires.
     *
     * @return un nom non encore utilisé
     */
    private String genererNomUnique() {
        Random rand = new Random();
        String nom;
        do {
            int longueur = 3 + rand.nextInt(5);
            StringBuilder nomBuilder = new StringBuilder();
            for (int i = 0; i < longueur; i++) {
                char lettre = (char) ('a' + rand.nextInt(26));
                nomBuilder.append(lettre);
            }
            nom = nomBuilder.toString();
        } while (nomsUtilises.contains(nom));
        nomsUtilises.add(nom);
        return nom;
    }

    /**
     * Vérifie si une position donnée est déjà occupée par une entité (personnage ou monstre).
     *
     * @param p la position à tester
     * @return true si la case est occupée, false sinon
     */
    public boolean estOccupee(Point2D p) {
        for (Personnage pers : maListePers) {
            if (pers.getPos().equals(p)) return true;
        }
        for (Monstre mon : maListeMons) {
            if (mon.getPos().equals(p)) return true;
        }
        return false;
    }

    /**
     * Permet à une créature de chercher et utiliser un objet présent sur sa position.
     *
     * @param c la créature concernée
     */
    public void chercherObjet(Creature c) {
    for (Objet o : maListeobj) { // Boucle for-each
        if (o.getPosition().equals(c.getPos())) {
            o.utiliserObjet(c);
            System.out.println(o.getNom()+ " a ramassé ");
            maListeobj.remove(o); 
        }
    }
}


    /**
     * Effectue un tour de jeu :
     * <ul>
     *   <li>Déplace les personnages et monstres.</li>
     *   <li>Déclenche les combats entre entités proches.</li>
     * </ul>
     */
    public void tourDeJeu() {
        for (Personnage p : maListePers) {
            p.deplace(this);
        }

        for (Monstre m : maListeMons) {
            m.deplace(this);
        }

        // Combats entre personnages (simplifié)
        for (int i = 0; i < maListePers.size(); i++) {
            Personnage p1 = maListePers.get(i);
            for (int j = 0; j < maListePers.size(); j++) {
                if (j != i) {
                    Personnage p2 = maListePers.get(j);
                    if (p1 instanceof Archer) {
                        ((Archer) p1).combattre(p2);
                    } else if (p1 instanceof Guerrier) {
                        ((Guerrier) p1).combattre(p2);
                    }
                }
            }
        }
    }

    /**
     * Affiche les informations de toutes les entités du monde :
     * personnages, monstres et objets.
     */
    public void affiche() {
        for (Personnage p : maListePers) {
            p.affiche();
        }
        for (Monstre m : maListeMons) {
            m.affiche();
        }
        for (Objet o : maListeobj) {
            o.affiche();
        }
    }
}
