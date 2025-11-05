package Practica5.ejercicio3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Main{
    public static void main(String[] args) {
        Contenedor contenedor = new Contenedor();
        contenedor.iniciarServidor(new ServidorPrueba());
    }
}

