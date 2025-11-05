package Practica5.ejercicio2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class testeadorMain {
    public static void main(String[] args) throws ClassNotFoundException {
        try{
            String ruta = System.getProperty("user.dir") + File.separator;
            StringBuilder contenido = new StringBuilder();
            Class <?> testClass = Class.forName(args[0]); //esto devuevle un tipo class y por eso tengo q hacer el newInstance abajo (para acceder a los valores de los atributos)
            Object testObject = testClass.getConstructor().newInstance();
            if (testClass.isAnnotationPresent(Archivo.class)) {
                ruta += testClass.getAnnotation(Archivo.class).nombre();
                System.out.println("<NombreClase>" + testClass.getSimpleName() + "</NombreClase>");
                contenido.append("<NombreClase>")
                        .append(testClass.getSimpleName())
                        .append("</NombreClase>");
                for (Field m : testClass.getDeclaredFields()) {
                    if (m.isAnnotationPresent(AlmacenarAtributo.class)) {

                        System.out.println("<nombreAtributo>" + m.getName() + "</nombreAtributo>");
                        contenido.append("<nombreAtributo>")
                                .append(m.getName())
                                .append("</nombreAtributo>");

                        m.setAccessible(true); //permito q se acceda a los campos.

                        contenido.append("<nombreValor>")
                                .append(m.get(testObject))
                                .append("</nombreValor>");

                        System.out.println("<nombreValor>" + m.get(testObject) + "</nombreValor>");
                    }

                }
            }
            File archivo = new File(ruta);
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(contenido.toString());
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
