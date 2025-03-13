package treeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {

    public static void main(String[] args) {

        Set<String> treeSet = new TreeSet<>(Comparator.reverseOrder());

        treeSet.add("primero");
        treeSet.add("segundo");
        treeSet.add("tercero");
        treeSet.add("cuarto");
        treeSet.add("quinto");
        treeSet.add("sexto");
        treeSet.add("septimo");
        treeSet.add("octavo");
        treeSet.add("noveno");

        System.out.println("Tree Set");

        System.out.println(treeSet); //lo ordena de forma alfabetica

        Set<Integer> numeros = new TreeSet<>();

        numeros.add(1);
        numeros.add(5);
        numeros.add(4);
        numeros.add(8);
        numeros.add(2);

        System.out.println("numeros");

        System.out.println(numeros);
    }
}
