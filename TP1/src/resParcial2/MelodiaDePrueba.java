package resParcial2;

@Melodia
public class MelodiaDePrueba {
    @Escala({"A", "B", "C"})
    private String nota;

    @Duracion({"w", "h", "q"})
    private String duracion;

    public MelodiaDePrueba(String nota, String duracion) {
        this.nota = nota;
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return this.nota + " " + this.duracion;
    }
}
