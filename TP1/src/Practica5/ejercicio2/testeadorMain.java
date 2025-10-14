package Practica5.ejercicio2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class testeadorMain {
    public static void main(String[] args) throws ClassNotFoundException {
        try{

            Class <?> testClass = Class.forName(args[0]); //esto devuevle un tipo class y por eso tengo q hacer el newInstance abajo (para acceder a los valores de los atributos)
            Object testObject = testClass.getConstructor().newInstance();
            if (testClass.isAnnotationPresent(Archivo.class)) {
                System.out.println("<NombreClase>" + testClass.getSimpleName() + "</NombreClase>");

                for (Field m : testClass.getDeclaredFields()) {
                    if (m.isAnnotationPresent(AlmacenarAtributo.class)) {
                        System.out.println("<nombreAtributo>" + m.getName() + "</nombreAtributo>");
                        m.setAccessible(true); //permito q se acceda a los campos.
                        System.out.println("<nombreValor>" + m.get(testObject) + "</nombreValor>");
                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
