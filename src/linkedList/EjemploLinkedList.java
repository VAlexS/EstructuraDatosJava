package linkedList;

import clases.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EjemploLinkedList {

    public static void main(String[] args) {

        LinkedList<Alumno> enlazadaAlumnos = new LinkedList<>();

        //agregame alumnos
        enlazadaAlumnos.add(new Alumno("Victor", 10));
        enlazadaAlumnos.add(new Alumno("Enrique", 6));
        enlazadaAlumnos.add(new Alumno("Lucia", 9));
        enlazadaAlumnos.add(new Alumno("Lucas", 2));
        enlazadaAlumnos.add(new Alumno("Jano", 3));


        System.out.println("Tamaño de la lista: " + enlazadaAlumnos.size());

        enlazadaAlumnos.addFirst(new Alumno("Zeus", 5));
        enlazadaAlumnos.addLast(new Alumno("Atenea", 6));

        System.out.println("Tamaño de la lista tras añadir 2 elementos: " + enlazadaAlumnos.size());

        System.out.println("Primer elemento: "+enlazadaAlumnos.getFirst());
        System.out.println("Ultimo elemento: "+enlazadaAlumnos.getLast());

        System.out.println("Elemento en la posicion 3: "+enlazadaAlumnos.get(3));

        System.out.println("Peaks");

        Alumno primerAlumno = enlazadaAlumnos.peekFirst();

        System.out.println(primerAlumno);

        Alumno ultimoAlumno = enlazadaAlumnos.peekLast();

        System.out.println(ultimoAlumno);

        //remove

        enlazadaAlumnos.poll();

        enlazadaAlumnos.pollFirst();

        enlazadaAlumnos.pollLast();

        enlazadaAlumnos.pop();

        enlazadaAlumnos.push(new Alumno("Pablo", 8));

        enlazadaAlumnos.removeFirst();

        enlazadaAlumnos.removeLast();

        //meteme nuevos alumnos
        enlazadaAlumnos.add(new Alumno("Victor", 10));
        enlazadaAlumnos.add(new Alumno("Enrique", 6));
        enlazadaAlumnos.add(new Alumno("Lucia", 9));
        enlazadaAlumnos.add(new Alumno("Lucas", 2));
        enlazadaAlumnos.add(new Alumno("Jano", 3));

        enlazadaAlumnos.push(new Alumno("Pedro", 0));
        enlazadaAlumnos.push(new Alumno("Santiago", 10));


        System.out.println("Alumnos con list iterator");
        System.out.println("______________________________________");
        //iteraciones
        ListIterator<Alumno> li = enlazadaAlumnos.listIterator();

        while (li.hasNext()){
            Alumno alumno = li.next();
            System.out.println(alumno);
        }

        System.out.println("Alumnos con list iterator hacia atras");
        System.out.println("______________________________________");

        while (li.hasPrevious()){
            Alumno alumno = li.previous();
            System.out.println(alumno);
        }







    }
}
