package Exercice19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un nombre");
        int n = sc.nextInt();
        int s=0;
        for(int i=1;i<=n;i++){
            s+=i;
        }
        System.out.println("s: "+s);
    }
}
