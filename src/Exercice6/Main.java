package Exercice6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entrer une note comprise entre 0 et 20");
        float note = sc.nextFloat();
        if(note<0 || note>20){
            System.out.println("la note entrée est doit etre entre 0 et 20");

        }
        else if(note>=10){
            System.out.println("Vous avez validé");
        }
        else{
            System.out.println("matiere non validé");
        }

    }
}
