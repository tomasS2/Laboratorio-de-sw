package Practica3.ejercicio6;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Estudiante[] estudiantes = {
                new Estudiante("felipa", "gomez", 2, "3232", 0),
                new Estudiante("martin", "lopez", 20, "545", 32),
                new Estudiante("jose", "ortizabal", 15, "51", 22),
                new Estudiante("pepe", "mamour", 66, "3", 3)
        };

        System.out.println("POR MATERIAS APROBADAS (asc)");

        Arrays.sort(estudiantes, new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante o1, Estudiante o2) {
                return o1.getMateriasAprobadas() - o2.getMateriasAprobadas();
            }
        });

        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getNombre()+ " " + estudiante.getMateriasAprobadas());
        }

        System.out.println("---------------");

        System.out.println("POR EDAD (desc)");

        Arrays.sort(estudiantes, new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante o1, Estudiante o2) {
                return o2.getEdad() - o1.getEdad();
            }
        });

        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getNombre()+ " " + estudiante.getEdad());
        }

        System.out.println("---------------");

        System.out.println("POR LEGAJO (asc)");

        Arrays.sort(estudiantes, new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante o1, Estudiante o2) {
                return Integer.parseInt(o1.getLegajo()) - Integer.parseInt(o2.getLegajo());
            }
        });

        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getNombre()+ " " + estudiante.getLegajo());
        }

        System.out.println("---------------");

        System.out.println("POR NOMBRE Y APELLIDO (desc)");

        Arrays.sort(estudiantes, new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante o1, Estudiante o2) {
                return Comparator.comparing(Estudiante::getNombre).thenComparing(Estudiante::getApellido).compare(o1, o2);
            }
        });

        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getNombre()+ " " + estudiante.getApellido());
        }


    }
}
