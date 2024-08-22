package Exercice30;

import java.util.Scanner;

/**
 * Main.java
 * <p>
 * Auteur: Administrateur
 */
public class Main {
    public static void main(String[] args) {
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("entrer un nombre");
            int n=sc.nextInt();
            int s=1;
            for(int i=1;i<=n;i++){
                s =s*i;
            }
            System.out.println("le factoriel de "+n+ " est : "+ s);
        }

    }

}
