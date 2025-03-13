package treeSet;

import clases.Alumno;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {

    public static void main(String[] args) {

        //en los Set, no se pueden repetir elementos, aunque se intente agregar un elemento repetido, no se agregará
        Set<Alumno> sa = new TreeSet<>();

        sa.add(new Alumno("Victor", 10));
        sa.add(new Alumno("Enrique", 6));
        sa.add(new Alumno("Lucia", 9));
        sa.add(new Alumno("Lucas", 2));
        sa.add(new Alumno("Zeus", 2));

        System.out.println(sa);


    }
}
