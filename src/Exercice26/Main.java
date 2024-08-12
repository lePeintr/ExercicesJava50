package Exercice26;

import java.util.Scanner;

/**
 * Cette classe Main représente ...
 *
 * @author Utilisateur
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        float [] notes = new float[10];
        float moyenne = 0;
        float sommeDesNotes=0;
        for (int i=0;i<notes.length;i++){
            System.out.println("Saisir une note");
            Scanner sc = new Scanner(System.in);
            notes[i]=sc.nextInt();
            sommeDesNotes += notes[i];
        }

        System.out.println(sommeDesNotes);
        moyenne = sommeDesNotes/10;

        System.out.println("la moyenne des 10 notes entrée est : "+moyenne);
    }
}
