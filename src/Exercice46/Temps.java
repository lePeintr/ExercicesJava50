package Exercice46;

/**
 * Temps.java
 * <p>
 * Auteur: Administrateur
 */
public class Temps {
    int heures,minutes,secondes;

    public Temps() {
        this.heures=0;
        this.minutes=0;
        this.secondes=0;
    }

    public Temps(int heures, int minutes, int secondes) {
        this.heures = heures;
        this.minutes = minutes;
        this.secondes = secondes;
    }
    public void afficher(int heures,int minutes,int secondes){
        System.out.println(heures+"h "+ minutes +"min "+ secondes+"s");
    }

    public int getHeures() {
        return heures;
    }


    public int getMinutes() {
        return minutes;
    }

    public int getSecondes() {
        return secondes;
    }

    public void ajouterTemps(Temps t1, Temps t2){

        int heuresTotale =t1.getHeures()+t2.getHeures();
        int minuteTotale = t1.getMinutes()+t2.getMinutes();
        int secondeTotale=t1.getSecondes()+ t2.getSecondes();
        Temps tempsTotal = new Temps(heuresTotale,minuteTotale,secondeTotale);
        afficher(heuresTotale,minuteTotale,secondeTotale);

    }

    public static void main(String[] args) {
        Temps t1= new Temps();
        Temps t2= new Temps(17,20,50);
        Temps t3 = new Temps(1,1,1);
        t1.afficher(t1.getHeures(),t1.getMinutes(),t1.getSecondes());
        t2.afficher(t2.getHeures(),t2.getMinutes(),t2.getSecondes());
        t1.ajouterTemps(t2,t3);

    }
}
