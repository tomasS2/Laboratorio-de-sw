package Practica5.ejercicio3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Servidor {
    String direccion();
    String puerto();
    String archivo();

}
