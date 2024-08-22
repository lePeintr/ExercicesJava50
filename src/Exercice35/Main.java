package Exercice35;

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
            System.out.println("entrer un entier");
            int n = sc.nextInt();
            String val = String.valueOf(n);
            char [] chars= val.toCharArray();
            System.out.println(val);
            System.out.println(chars.length);

            int i=1;
            while(n/10 !=0){
                n=n/10;
                i++;
            }
            System.out.println("i: "+i);
        }
    }


}
