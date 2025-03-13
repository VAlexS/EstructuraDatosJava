package list.arrayList;

import clases.Alumno;

import java.util.*;

public class EjemploListComparableComparator {

    public static void main(String[] args) {

        List<Alumno> alumnos = new ArrayList<>();


        //agregame alumnos
        alumnos.add(new Alumno("Victor", 10));
        alumnos.add(new Alumno("Enrique", 6));
        alumnos.add(new Alumno("Lucia", 9));
        alumnos.add(new Alumno("Lucas", 2));

        //Collections.sort(alumnos);

        //ordenar por nombre
        //alumnos.sort((a, b) -> a.getNombre().compareTo(b.getNombre()));
        alumnos.sort(Comparator.comparing(Alumno::getNombre).reversed());

        System.out.println(alumnos);

        System.out.println("Iterando con un foreach");

        // Iterando con un foreach
        alumnos.forEach(System.out::println);



    }
}
