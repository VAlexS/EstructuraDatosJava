package hashSet;

import clases.Alumno;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterarHashSet {

    public static void main(String[] args) {

        Set<Alumno> sa = new HashSet<>();

        //agregame alumnos
        sa.add(new Alumno("Victor", 10));
        sa.add(new Alumno("Enrique", 6));
        sa.add(new Alumno("Lucia", 9));
        sa.add(new Alumno("Lucas", 2));

        System.out.println(sa);

        System.out.println("Iterando con un foreach");

        for (Alumno a : sa) {
            System.out.println(a);
        }

        System.out.println("Iteranco con while y un iterator");

        Iterator<Alumno> it = sa.iterator();
        while (it.hasNext()){
            Alumno a = it.next();
            System.out.println(a);
        }

    }
}
