package Exercice38;

import java.util.Scanner;

/**
 * Main.java
 * <p>
 * Auteur: Administrateur
 */
public class Main {
    public static void main(String[] args) {
        while(true){
            Scanner sc = new Scanner(System.in);
            int [] tableau = new int[10];
            for(int i=0;i<tableau.length;i++){
                System.out.println("saisir un entier");
                tableau[i]=sc.nextInt();
            }
            int pair=0;
            int impair=0;
            for(int i=0;i< tableau.length;i++){
                if(tableau[i]%2==0){
                    pair ++;
                }
                else{
                    impair ++;
                }
            }
            System.out.println("le nombre d'elements pairs est: "+pair);
            System.out.println("le nombre d'elements impairs est: "+impair);
        }
    }
}
