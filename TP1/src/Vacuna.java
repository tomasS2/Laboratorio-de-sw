


public class Vacuna {
    private String marca;
    private String paisOrigen;
    private String enfermedadPreviene;
    private int cantidadDosis;

    public Vacuna(String marca, String paisOrigen, String enfermedadPreviene, int cantidadDosis) {
        this.marca = marca;
        this.paisOrigen = paisOrigen;
        this.enfermedadPreviene = enfermedadPreviene;
        this.cantidadDosis = cantidadDosis;
    }


    public String getPaisOrigen() {
        return paisOrigen;
    }

    public String getEnfermedadPreviene() {
        return enfermedadPreviene;
    }

    public String getMarca() {
        return marca;
    }

    public int getCantidadDosis() {
        return cantidadDosis;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public void setEnfermedadPreviene(String enfermedadPreviene) {
        this.enfermedadPreviene = enfermedadPreviene;
    }

    public void setCantidadDosis(int cantidadDosis) {
        this.cantidadDosis = cantidadDosis;
    }

    @Override
    public String toString() {
        String StringBuffer = this.getMarca() + " " + this.getPaisOrigen() + " " + this.getEnfermedadPreviene() + " " + this.getCantidadDosis();
        return StringBuffer;
    }
}
