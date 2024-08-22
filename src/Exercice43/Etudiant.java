package Exercice43;

import java.util.Scanner;

/**
 * Main.java
 * <p>
 * Auteur: Administrateur
 */
public class Etudiant {
String nom;
float note1,note2;

    public Etudiant(String nom, float note2, float note1) {
        this.nom = nom;
        this.note2 = note2;
        this.note1 = note1;
    }

    public float calculMoyenne(){
        return (note1+note2)/2f;
    }
    public void afficher(){
        System.out.println("nom: "+nom+", moyenne = "+ calculMoyenne());
    }

    public static void main(String[] args) {
        int n1,n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un nom");
        String nom = sc.next();
        System.out.println("Entrer un nombre");
        n1 = sc.nextInt();
        System.out.println("Entrer un autre nombre");
        n2 = sc.nextInt();

        Etudiant et = new Etudiant(nom,n1,n2);
        et.afficher();
    }
}
