package clases;

public class Alumno implements Comparable<Alumno> {

    private String nombre;

    private double nota;

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota < 0)
            nota = 0;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}';
    }


    @Override
    public int compareTo(Alumno a) {
        /*if (nombre == null)
            return 0;
        return nombre.compareTo(a.nombre);*/
        if (nota == a.nota)
            return 0;
        else if (nota > a.nota)
            return 1;
        else
            return -1;

    }
}
