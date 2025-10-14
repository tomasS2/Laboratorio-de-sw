package Practica5.ejercicio3;


import java.lang.reflect.Field;

public class Contenedor {
    public static void procesarClase(Object o) {
        try{
            Class <?> testClass = o.getClass();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {


    }
}
