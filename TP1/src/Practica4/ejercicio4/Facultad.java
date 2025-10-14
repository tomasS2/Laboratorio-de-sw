package Practica4.ejercicio4;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Facultad {
    List<Alumno> estudiantes = new ArrayList<>();

    public void agregarEstudiante(Alumno a){
        this.estudiantes.add(a);
    }

    public Alumno getEstudianteMayorNota(){
        return this.estudiantes.stream().max((a1, a2) -> a2.getNota()-a1.getNota()).orElse(null);
    }

    public void getImprimirDosAlumnos(){
        this.estudiantes.stream().limit(2).forEach(System.out::println);

    }

    public Alumno getAlumnoTomoCursoLaboSW(){
        return this.estudiantes.stream().filter(a -> a.getMateria().equals("Laboratorio de Software")).findFirst().orElse(null);
    }


    /*
        Obtener los alumnos, cuyo nombre empiece con
        el carácter "P" y la longitud de su nombre sea
        menor o igual a 6.
    */
    public List<Alumno> getAlumnosNombreCumplaCondicion(){
        return this.estudiantes.stream().filter(Alumno::cumpleCondicionNombre).collect(Collectors.toList());
    }


    public void ordenarPorNota(){
        this.estudiantes.sort((Comparator.comparingInt(Alumno::getNota)));
    }

}
