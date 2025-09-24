package Practica2.ejercicio1b;
import Practica3.ejercicio8.FrecuenciasDeLA;
import Practica3.ejercicio8.Notas;

public interface InstrumentoMusical {
    void hacerSonar();
    String queEs();

    //se lo pone en default para evitar conflictos
    default void afinar(){}

    default void hacerSonar(Notas n, int duracion){}
    default void afinar(FrecuenciasDeLA f){}
}
