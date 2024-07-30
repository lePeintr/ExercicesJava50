package Exercice11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nombre de photocopie");
        float nbrePhotocopie = sc.nextFloat();
        if(nbrePhotocopie>0 && nbrePhotocopie<=10){
            System.out.println("La facture est : "+(nbrePhotocopie * 0.25));
        }
        if(nbrePhotocopie>10 && nbrePhotocopie<=30){
            System.out.println("La facture est : "+(nbrePhotocopie * 0.20));
        }
        if(nbrePhotocopie>30){
            System.out.println("La facture est : "+(nbrePhotocopie * 0.10));
        }
    }

    }
