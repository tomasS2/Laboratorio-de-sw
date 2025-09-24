package Practica2.ejercicio1b;

import Practica3.ejercicio8.FrecuenciasDeLA;
import Practica3.ejercicio8.Notas;

public class InstrumentoDeCuerda implements InstrumentoMusical {
     public void hacerSonar(){
        System.out.println("Sonar Cuerdas");
    }

    public String queEs() {
        return "Instrumento de Cuerda";
    }

    @Override
    public void afinar() {

    }

    @Override
    public void hacerSonar(Notas n, int duracion) {

    }

    @Override
    public void afinar(FrecuenciasDeLA f) {

    }

}