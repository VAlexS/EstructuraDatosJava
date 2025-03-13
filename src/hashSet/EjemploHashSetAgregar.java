package hashSet;

import java.util.*;

public class EjemploHashSetAgregar {

    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        hashSet.add("primero");
        hashSet.add("segundo");
        hashSet.add("tercero");
        hashSet.add("cuarto");
        hashSet.add("quinto");
        hashSet.add("sexto");
        hashSet.add("septimo");
        hashSet.add("octavo");
        hashSet.add("noveno");

        System.out.println(hashSet);

        hashSet.add("octavo");


        System.out.println("_____________________________");

        List<String> lista = new ArrayList<>();
        lista.add("primero");
        lista.add("segundo");
        lista.add("tercero");
        lista.add("cuarto");
        lista.add("quinto");
        lista.add("sexto");
        lista.add("septimo");
        lista.add("octavo");
        lista.add("noveno");





    }

}