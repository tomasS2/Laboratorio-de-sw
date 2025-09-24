package Practica3.ejercicio8;

public class TestPiano {
    public static void main(String[] args) {
        Piano piano = new Piano();
        Notas notaDo = Notas.DO;
        FrecuenciasDeLA frecuenciaDeLA = FrecuenciasDeLA.PRIMERA;
        piano.hacerSonar(notaDo, 10);
        piano.afinar(frecuenciaDeLA);

        //ejercicio 8)e)
        System.out.println("----------------------------------");
        FitoPaez fito = FitoPaez.INSTANCE;
        Notas[] notas = {Notas.DO, Notas.SOL, Notas.DO, Notas.RE};
        int[] tiempos = {10, 20, 30, 40};
        fito.tocarCancion(notas, tiempos);


    }

}
