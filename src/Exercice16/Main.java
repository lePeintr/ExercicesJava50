package Exercice16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un nombre");
        int n = sc.nextInt();
        int i = 1;
        int S= 0;
        while (i<=n){
            S += i;
            i++;
        }
        System.out.println("S = "+S);
    }
}
