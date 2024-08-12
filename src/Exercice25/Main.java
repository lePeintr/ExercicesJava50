package Exercice25;

import java.util.Scanner;

/**
 * Cette classe Main représente ...
 *
 * @author Utilisateur
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] tableau = new int[10];
        for(int i=0;i<tableau.length;i++){
            System.out.println("saisir un entier");
            tableau[i]=sc.nextInt();
        }
        for (int j : tableau) {
            System.out.println(j);
        }

    }
}
