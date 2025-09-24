package resParcial1;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Buscador {
    private List<Pelicula> peliculas;
    private static Buscador instance;


    public static final Comparator<Pelicula> comparadorTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getTitulo().compareTo(o2.getTitulo());
        }
    };

    public static final Comparator<Pelicula> comparadorAnio = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getAnio().compareTo(o2.getAnio());
        }
    };

    public static final Comparator<Pelicula> comparadorEdad = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getClasificacion().getEdad().compareTo(o2.getClasificacion().getEdad());
        }
    };

    public static final Comparator<Pelicula> comparadorClasificacion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getAnio().compareTo(o2.getAnio());
        }
    };

    public static final Comparator<Pelicula> comparadorValoracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getAnio().compareTo(o2.getAnio());
        }
    };


    public static final Comparator<Pelicula> comparadorEdad2 = new ComparadorEdad();

    //se evita que otras clases puedan instanciar el buscador (singleton)
    private Buscador() {
        peliculas = new ArrayList<>();
    }

    public static Buscador getInstance() {
        if (instance == null) {
            return new Buscador();
        }
        return instance;
    }

    public void addPelicula(Pelicula p) {
        this.peliculas.add(p);
    }

    public List<Pelicula> seleccionar (){
        return this.peliculas.stream().sorted(comparadorTitulo).collect(Collectors.toList());
    }
    public List<Pelicula> seleccionar (Comparator<Pelicula> comp){
        return this.peliculas.stream().sorted(comp).collect(Collectors.toList());
    }
    public List<Pelicula> seleccionar (Genero g, Clasificacion ce, Rango valoracion, Rango reproduccion){
        return this.peliculas.stream()
                .filter(p -> p.getClasificacion().equals(ce))
                .filter(p -> p.getGeneros().contains(g))
                .filter(p -> valoracion.dentroDe(p.getValoracion()))
                .filter(p -> reproduccion.dentroDe(p.getReproducciones()))
                .collect(Collectors.toList());
    }


    //otra forma
    private static class ComparadorEdad implements Comparator<Pelicula> {

        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getClasificacion().getEdad().compareTo(o2.getClasificacion().getEdad());
        }
    }



}
