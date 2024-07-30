package Exercice2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("saisir un premier nombre");
        float a= scanner.nextFloat();
        System.out.println("saisir un deuxieme nombre");
        float b= scanner.nextFloat();
        System.out.println("le produit des deux nombres est "+(a*b) );
    }
}
