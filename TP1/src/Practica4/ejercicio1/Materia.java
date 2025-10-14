package Practica4.ejercicio1;

import java.util.*;

public class Materia {
    private String nombre;
    private Set<Alumno> alumnos = new HashSet<>();
    private Set<Object> nominaGeneral = new HashSet<>();


    public Materia(String nombre) {
        this.nombre = nombre;
    }


    public void agregaAlumno (Alumno a){
        alumnos.add(a);
    }

    public void agregaAlgo (Object o){
        this.nominaGeneral.add(o);
    }

    public Set<Alumno> getAlumnos (){
        return this.alumnos;
    }


    public Set<Object> getNominaGeneral (){
        return this.nominaGeneral;
    }

    public static Comparator<Alumno> ordenarNombreApellido = new Comparator<Alumno>() {

        @Override
        public int compare(Alumno o1, Alumno o2) {
            return Comparator.comparing(Alumno::getNombre).thenComparing(Alumno::getApellido).compare(o1, o2);

        }
    };
    public static Comparator<Alumno> ordenarDni = new Comparator<Alumno>() {

        @Override
        public int compare(Alumno o1, Alumno o2) {
            return Integer.parseInt(o1.getDni()) - Integer.parseInt(o2.getDni());

        }
    };

}



