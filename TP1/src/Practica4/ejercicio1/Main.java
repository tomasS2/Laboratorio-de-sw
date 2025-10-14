package Practica4.ejercicio1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Materia materia = new Materia("Matemática");

        materia.agregaAlumno(new Alumno("1","jose", "martin", "1"));
        materia.agregaAlumno(new Alumno("2","martin", "martin", "2"));
        materia.agregaAlumno(new Alumno("3","lolo", "martin", "3"));
        materia.agregaAlumno(new Alumno("4","lalo", "martin", "4"));
        materia.agregaAlumno(new Alumno("5","lelo", "martin", "5"));
        materia.agregaAlumno(new Alumno("6","pipo", "martin", "6"));
        materia.agregaAlumno(new Alumno("7","pepe", "martin", "7"));
        materia.agregaAlumno(new Alumno("11","nano", "martin", "8"));
        materia.agregaAlumno(new Alumno("9","nino", "martin", "9"));
        materia.agregaAlumno(new Alumno("10","jose", "martin", "123"));

        System.out.println(materia.getAlumnos()); //el orden se da en base al hash code (en hashset)


        materia.getAlumnos().stream().sorted(Materia.ordenarNombreApellido).forEach(System.out::println);
        System.out.println("-----------------");
        materia.getAlumnos().stream().sorted(Materia.ordenarDni).forEach(System.out::println);


        //nomina gral
        materia.agregaAlgo(new Materia("QUEEE???"));
        materia.agregaAlgo(new Alumno("9","nino", "martin", "9"));

        System.out.println(materia.getNominaGeneral());


    }
}
