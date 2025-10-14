package Practica4.ejercicio4;

import java.util.List;

public class Alumno {
    private String legajo, apellido, nombre, dni, materia;
    private int edad, nota;


    public Alumno(String legajo, String apellido, String nombre, String dni, String materia, int edad, int nota) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.materia = materia;
        this.edad = edad;
        this.nota = nota;
    }

    public int getNota(){
        return nota;
    }
    public String getMateria(){
        return materia;
    }

    public boolean cumpleCondicionNombre(){
        return this.nombre.length() <= 6 && this.nombre.charAt(0) == 'P';
    }
}
