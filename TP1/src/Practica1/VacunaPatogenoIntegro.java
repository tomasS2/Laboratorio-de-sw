package Practica1;

public class VacunaPatogenoIntegro extends Vacuna {
    private String virusPatogeno;


    public VacunaPatogenoIntegro(String marca, String paisOrigen, String enfermedadPreviene, int cantidadDosis, String virusPatogeno) {
        super(marca, paisOrigen, enfermedadPreviene, cantidadDosis);
        this.virusPatogeno = virusPatogeno;
    }

    public String getVirusPatogeno() {
        return virusPatogeno;
    }

    public void setVirusPatogeno(String virusPatogeno) {
        this.virusPatogeno = virusPatogeno;
    }

    @Override
    public String toString() {
        return "Practica1.VacunaPatogenoIntegro{" +
                "virusPatogeno='" + virusPatogeno + '\'' +
                "} " + super.toString();
    }
}
