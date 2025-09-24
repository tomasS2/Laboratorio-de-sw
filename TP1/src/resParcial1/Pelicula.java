package resParcial1;

import java.util.List;

public class Pelicula {
    private String titulo, anio;
    private List<Genero> generos;
    private Clasificacion clasificacion;
    private int reproducciones, valoracion;

    public Pelicula(String titulo, String anio, List<Genero> generos, Clasificacion clasificacion, int valoracion, int reproducciones) {
        this.titulo = titulo;
        this.anio = anio;
        this.generos = generos;
        this.clasificacion = clasificacion;
        this.valoracion = valoracion;
        this.reproducciones = reproducciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAnio() {
        return anio;
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public int getValoracion() {
        return valoracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", anio='" + anio + '\'' +
                ", generos=" + generos +
                ", clasificacion=" + clasificacion +
                ", reproducciones=" + reproducciones +
                ", valoracion=" + valoracion +
                '}';
    }
}
