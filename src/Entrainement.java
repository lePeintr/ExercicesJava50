import java.util.*;
import java.util.stream.Stream;

/**
 * Cette classe Entrainement représente les definitions importantes à savoir en java
 *
 * @author Utilisateur
 * @version 1.0
 */
public class Entrainement {
    //Toute les classes par defaut herites de la classe Object de java et peuvent implementer toutes les methodes
    //de la classe Objet(toString,equals,hashCode,Clone...)

    Object o = new Object();
    ArrayList<Object>=new ArrayList<>();
    Collections c = new Collection<>();
    Collection collection= new Collection() {
    }
    Collection cc = new HashSet<>();
    Collection cc = new TreeSet();
    String  string = new String(); //les objets de la classe String sont immutables donc iune fois une instance de la classe String
    //est cree elle ne peut plus etre mofifie

    StringBuilder stringBuilder = new StringBuilder();//permet de modifier et manipuler String

    Stream // interface utilse utilser pour manipuler et faire des operations facile sur les Collections d'objet ou alors
    // c'est un flux de donnee aux quels on peut appliquer les operation de filtre(filter),
    // trie(sorted),des map , mapToDoublepar exemple, et les operations d'aggregation(sum,count)

    //Genericite (classe Geneique)= les classes ecrites pour fonctionner avecc n' importe quel type d'objet;
    //Il s'agit defini dont le type d'objet qui utilisera la classe est inconnu est l'avance et variable';
    //une classe generique ne contint que les methodes generiques

    //Difference entre une copie par valeur et une copie par reference (que se passe t'il rellement quand on fait un getX)

    int i;
    Integer ii;
    List<int> liste = new ArrayList<>();//Cela ne se fait pas car int n'est pas un objet et n'herite pas de la classe objet
    //D'ou java à cree les classes heritant de la classe qui representes ces types primitfs
    List<Integer> list = new ArrayList<>();
     long l;
    Long ll;


    char c;
    Character cc;

    short s;
    Short ss;

    double d;
    Double dd;

    float f;
    Float ff;

    boolean b;
    Boolean bb;

    byte bt;
    Byte btt;
}
