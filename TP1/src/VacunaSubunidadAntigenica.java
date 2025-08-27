public class VacunaSubunidadAntigenica extends Vacuna{
    private int cantidadAntigenos;
    private String tipoProceso;

    public VacunaSubunidadAntigenica(String marca, String paisOrigen, String enfermedadPreviene, int cantidadDosis, int cantidadAntigenos, String tipoProceso) {
        super(marca, paisOrigen, enfermedadPreviene, cantidadDosis);
        this.cantidadAntigenos = cantidadAntigenos;
        this.tipoProceso = tipoProceso;
    }

    public int getCantidadAntigenos() {
        return cantidadAntigenos;
    }

    public void setCantidadAntigenos(int cantidadAntigenos) {
        this.cantidadAntigenos = cantidadAntigenos;
    }

    public String getTipoProceso() {
        return tipoProceso;
    }

    public void setTipoProceso(String tipoProceso) {
        this.tipoProceso = tipoProceso;
    }

    @Override
    public String toString() {
        return "VacunaSubunidadAntigenica{" +
                "cantidadAntigenos=" + cantidadAntigenos +
                ", tipoProceso='" + tipoProceso + '\'' +
                "} " + super.toString();
    }
}
