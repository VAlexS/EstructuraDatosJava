package map.treeMap;

import java.util.TreeMap;

public class EjemploTreeMap {

    public static void main(String[] args) {

        TreeMap<String, Object> persona = new TreeMap<>();

        System.out.println("esta vacio: "+persona.isEmpty());


        persona.put("Nombre", "Victor");
        persona.put("Apellido", "Sanz");
        persona.put("Email", "vsanzcarrasc@gmail.com");
        persona.put("Edad", 24);
        persona.put("DNI", "12345678A");

        System.out.println(persona);

        persona.remove("Email");

        System.out.println(persona);

        System.out.println("esta vacio: "+persona.isEmpty());


    }
}
