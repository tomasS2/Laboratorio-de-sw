package resParcial2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreadorDeMelodias {

    public static <T> List<T> crearNotasYDuraciones(Class<T> elClass, int cant) {
        List<T> notas = new ArrayList<T>();

        if (!elClass.isAnnotationPresent(Melodia.class)) {
            throw new IllegalArgumentException("El tipo de melodia no es valido");
        }
        try{
            for (int i = 0; i < cant; i++) {
                Escala escala = null;
                Duracion duracion = null;
                for (Field field : elClass.getDeclaredFields()) {
                    field.setAccessible(true);
                    if (field.isAnnotationPresent(Duracion.class)) {
                        duracion = field.getAnnotation(Duracion.class);
                    } else {
                        if (field.isAnnotationPresent(Escala.class)) {
                            escala = field.getAnnotation(Escala.class);
                        } else {
                            throw new IllegalArgumentException("El tipo de melodia no es valido");
                        }
                    }
                }

                T instancia = elClass.getDeclaredConstructor(String.class, String.class)
                        .newInstance(devolverRandom(duracion.value()), devolverRandom(escala.value()));
                System.out.println(instancia);
                notas.add(instancia);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(notas);
        return notas;
    }

    private static String devolverRandom(String[] valores){
        Random randomNumbers = new Random();
        return valores[randomNumbers.nextInt(valores.length)];
    }

}
