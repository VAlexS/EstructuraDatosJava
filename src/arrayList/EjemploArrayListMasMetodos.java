package arrayList;

import clases.Alumno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class EjemploArrayListMasMetodos {

    public static void main(String[] args) {

        List<Alumno> arrayListAlumnos = new ArrayList<>();

        System.out.println("Tamaño de la lista: " + arrayListAlumnos.size());
        System.out.println("¿Está vacía? " + arrayListAlumnos.isEmpty());
        //agregame alumnos
        arrayListAlumnos.add(new Alumno("Victor", 10));
        arrayListAlumnos.add(new Alumno("Enrique", 6));
        arrayListAlumnos.add(new Alumno("Lucia", 9));
        arrayListAlumnos.add(new Alumno("Lucas", 2));

        for (Alumno alumno : arrayListAlumnos) {
            System.out.println(alumno);
        }

        //en la posicion 2, se modifica el alumno
        arrayListAlumnos.set(1, new Alumno("Lucas", 2));

        System.out.println("Después de modificar la posicion 2");
        for (Alumno alumno : arrayListAlumnos) {
            System.out.println(alumno);
        }

        //elimino un elemento de la lista
        boolean eliminado = arrayListAlumnos.remove(new Alumno("Lucia", 9));

        Alumno alumnoEliminado = arrayListAlumnos.remove(0);

        /*System.out.println("Después de eliminar a Lucia");
        for (Alumno alumno : arrayListAlumnos) {
            System.out.println(alumno);
        }*/

        System.out.println("Tras eliminar el primer elemento");
        for (Alumno alumno : arrayListAlumnos) {
            System.out.println(alumno);
        }

        System.out.println("Tamaño de la lista: " + arrayListAlumnos.size());

        System.out.println("¿Está vacía? " + arrayListAlumnos.isEmpty());

        Object a[] = arrayListAlumnos.toArray();

        System.out.println("Array");
        for (Object o : a) {
            System.out.println(o);
        }



    }
}
