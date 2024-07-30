package Exercice7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entrer un premier nombre");
        int m = sc.nextInt();
        System.out.println("entrer un deuxieme nombre");
        int n = sc.nextInt();
        int produit = m*n;

        if(produit == 0){
            System.out.println("Le produit des nombres entré est nul");
        }
        else if(produit<0){
            System.out.println("le produit est negatif");
        }
        else {
            System.out.println("Le produit est positif");
        }
    }
}
