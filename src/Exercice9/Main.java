package Exercice9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un premier nombre");
        float a=sc.nextFloat();
        System.out.println("Entrer un deuxieme nombre");
        float b=sc.nextFloat();
        System.out.println("Entrer un troisieme nombre");
        float c=sc.nextFloat();
        float moyenne = ((a+b+c)/3);
        System.out.println("La moyenne des 3 nombres saisis est "+ moyenne);

    }
}
