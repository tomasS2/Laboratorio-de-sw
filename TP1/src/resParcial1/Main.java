package resParcial1;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args){
        Buscador buscador = Buscador.getInstance();
        List<Genero> lista = new ArrayList<>();
        lista.add(Genero.ROMANCE);

        buscador.addPelicula(new Pelicula("Titanic", "1950", List.of(Genero.ROMANCE),Clasificacion._16,10, 2));
        buscador.addPelicula(new Pelicula("Avengers", "1960", List.of(Genero.ACCION),Clasificacion._16,3, 565));
        buscador.addPelicula(new Pelicula("El padrino 1", "1977", lista,Clasificacion._13,5, 140));
        buscador.addPelicula(new Pelicula("El padrino 2", "1989", List.of(Genero.MUSICAL),Clasificacion.ATP,6, 222));
        buscador.addPelicula(new Pelicula("Good Fellas", "2000", List.of(Genero.ROMANCE),Clasificacion._18,4, 432));
        buscador.addPelicula(new Pelicula("Metegol", "2005", List.of(Genero.FANTASIA),Clasificacion._18,4, 423));
        buscador.addPelicula(new Pelicula("Cars", "2008", List.of(Genero.DRAMA),Clasificacion._18,7, 66));
        buscador.addPelicula(new Pelicula("Esperando a la carroza", "2018", List.of(Genero.SUSPENSO),Clasificacion._13,10, 76));
        buscador.addPelicula(new Pelicula("Wolverine", "2022", List.of(Genero.ROMANCE),Clasificacion._13,8, 12112));
        buscador.addPelicula(new Pelicula("Hombre lobo??", "2025", List.of(Genero.SUSPENSO),Clasificacion.ATP,9, 33333));

        System.out.println(buscador.seleccionar(Buscador.comparadorTitulo));


    }
}
