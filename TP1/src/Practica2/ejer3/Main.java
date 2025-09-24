package Practica2.ejer3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


//punto a) no tiene el funcionamiento adecuado porque al hacer addall() en HashSetAgregados se suman todos los elementos
//de la colección enviada en cantAgregados (hasta ahí bien) pero después dentro del addall() se llama al super.addall() que lo que hace
//es usar el método implementado en la superclase y ese método hace un recorrido de todos los elementos de la colección enviada y hace un add().
//El tema es que ese add que hace en la superclase, primero lo busca en la subclase y como en la subclase está difinido lo usa. Al usarlo se vuelve a incrementar
//el cantAgregados por lo que termina duplicando el valor total en cantidadAgregados


public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();

        lista.add("A");
        lista.add("b");
        lista.add("c");
        lista.add("d");

        HashSetAgregados h = new HashSetAgregados();
        h.addAll(lista);


        System.out.println(h.getCantidadAgregados());
//---------------------------------------------------------------
        //b y c

        List<String> lista2 = new ArrayList<>();

        lista2.add("hola");
        lista2.add("chau");
        lista2.add("saludos");
        lista2.add("buenas");


        //otra cosa (trabajando directametne con set. Para el enunciado no sería lo mismo porque me interesa conocer los removidos y por lo tanto necesito implementar funcionalidad extra)
//        Set s = new HashSet(lista2);
//        s.size();
//        s.iterator().forEachRemaining(System.out::println);

        //OtroSet h2 = new HashSetAgregados2<>(); // al hacerlo así no se tiene acceso a los métodos propios de HashSetAgregados2
        HashSetAgregados2<Object> h2 = new HashSetAgregados2<>();
        h2.addAll(lista2);
        h2.remove(lista2.get(0));
        h2.remove(lista2.get(1));
        System.out.println(h2.getCantidadAgregados());
        System.out.println(h2.getRemovidos());
    }
}
