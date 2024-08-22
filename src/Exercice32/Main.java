package Exercice32;

import java.util.Scanner;

/**
 * Main.java
 * <p>
 *     Écrire  un programme en Java qui permet de calculer la somme d'entiers
 *     impaires de 1 jusqu'à un entier N saisi par l'utilisateur.
 *     Exemple N=8   Somme = 1 +3+5+7= 16
 * Auteur: Administrateur
 */
public class Main {
    public static void main(String[] args) {
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Entrer un nombre ");
            int n=sc.nextInt();
            int s = 0;
            for(int i=1;i<=n;i++){
                if(i%2 != 0){
                    s += i;
                }
            }
            System.out.println("La somme des nombres impairs est: "+s);
        }
        
    }
}
