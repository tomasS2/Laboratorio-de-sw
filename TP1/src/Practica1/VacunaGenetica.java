package Practica1;

public class VacunaGenetica extends Vacuna {
    private String temperaturaMinima;
    private String temperaturaMaxima;

    public VacunaGenetica(String marca, String paisOrigen, String enfermedadPreviene, int cantidadDosis, String temperaturaMinima, String temperaturaMaxima) {
        super(marca, paisOrigen, enfermedadPreviene, cantidadDosis);
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public String getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(String temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public String getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(String temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    @Override
    public String toString() {
        return "Practica1.VacunaGenetica{" +
                "temperaturaMinima='" + temperaturaMinima + '\'' +
                ", temperaturaMaxima='" + temperaturaMaxima + '\'' +
                "} " + super.toString();
    }
}
