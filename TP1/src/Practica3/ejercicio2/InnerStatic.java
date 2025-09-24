package Practica3.ejercicio2;
import java.util.Scanner;

import static java.lang.Math.pow;

public class InnerStatic {
    static double PI = 3.1416;

    static class Circulo {
        static double radio = 2;

        static void ingresarRadio(){
            System.out.println("Ingrese el radio");
            radio = new Scanner(System.in).nextDouble();
        }

        static double getArea(){
            //double a = PI * Math.pow(radio, 2);
            double a = PI * pow(radio, 2);
            System.out.println("El área es: " + a);
            return a;
        }
        static double getLongitudCircunferencia(){
            double l = 2 * PI * radio;
            System.out.println("La longitud es: " + l);
            return l;
        }
    }

}
