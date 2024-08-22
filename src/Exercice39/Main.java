package Exercice39;

import java.util.Scanner;

/**
 * Main.java
 * <p>
 * Auteur: Administrateur
 */
public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            boolean premier = false;
            System.out.println("entrer un entier");
            int n = sc.nextInt();
            int i=2;
                while(n%i!=0 && i<n){
                  i=i+1;
                }

            if(i==n)
                System.out.println("premier");
            else
                System.out.println("Non premier");

        }
    }
}
