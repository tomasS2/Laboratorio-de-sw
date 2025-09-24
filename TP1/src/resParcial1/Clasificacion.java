package resParcial1;

public enum Clasificacion {
    ATP (0,"Apto para todo público"),
    _13 (13, "Para mayores de 13"),
    _16 (16, "Para mayores de 16"),
    _18 (18, "Para mayores de 18");

    private String descripcion;
    private Integer edad;
    Clasificacion(Integer edad, String descripcion) {
        this.edad = edad;
        this.descripcion = descripcion;
    }

    public Integer getEdad() {
        return edad;
    }
}
