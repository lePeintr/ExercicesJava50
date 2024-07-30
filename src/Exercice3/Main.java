package Exercice3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.println("Entrer un premier entier A");
       int A = sc.nextInt();
        System.out.println("Entrer un deuxieme entier B");
        int B = sc.nextInt();
        int C =A;
        A=B;
        B=C;
        System.out.println("la valeur de A est "+A + " et B est "+B);
    }
}
