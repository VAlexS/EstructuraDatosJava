package map.hashMap;

import java.util.HashMap;
import java.util.Map;


public class EjemploHashMap {



    public static void main(String[] args) {

        Map<String, Object> persona = new HashMap<>();

        if (persona.isEmpty())
            System.out.println("El mapa esta vacio");
        else
            System.out.println("El mapa tiene contenido");

        persona.put("Nombre", "Victor");
        persona.put("Apellido", "Sanz");
        persona.put("Email", "vsanzcarrasc@gmail.com");
        persona.put("Edad", 24);
        persona.put(null, 57);
        persona.put("Anulable", null);
        persona.put("DNI", "12345678A");

        if (persona.isEmpty())
            System.out.println("El mapa esta vacio");
        else
            System.out.println("El mapa tiene contenido");

        System.out.println(persona);

        String nombre = (String) persona.get("Nombre");

        System.out.println("nombre = " + nombre);

        String apellido = (String) persona.get("Apellido");

        System.out.println("apellido = " + apellido);

        String email = (String) persona.get("Email");

        System.out.println("email = " + email);

        int edad = (int) persona.get("Edad");

        System.out.println("edad = " + edad);

        System.out.println("Contiene clave Nombre: " + persona.containsKey("Nombre"));

        System.out.println("Contiene direccion: " + persona.containsKey("direccion"));

        System.out.println("Contiene valor 24: " + persona.containsValue(24));

        System.out.println("Contiene valor 57: " + persona.containsValue(57));


        System.out.println("EntrySet");
        System.out.println("__________________________");
        System.out.println(persona.entrySet());


        String prueba = (String) persona.get("fecha");

        prueba = (String) persona.getOrDefault("fecha", "No existe");

        String pruebaApellido = (String) persona.getOrDefault("Apellido", "No existe");

        System.out.println("Tamaño: = " + persona.size());

        persona.remove(null);

        System.out.println(persona);

        persona.remove("Anulable");


        System.out.println(persona.values());








    }
}
