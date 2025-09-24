package Practica3.ejercicio8;

public enum FrecuenciasDeLA {
    PRIMERA("440HZ","Organización Internacional de Estandarización ISO 16." ),
    SEGUNDA("444HZ", "Afinación de cámara."),
    TERCERA("446HZ", "Renacimiento."),
    CUARTA("480HZ", "Órganos alemanes que tocaba Bach.");

    private String frecuencia;
    private String descripcion;

    FrecuenciasDeLA(String frecuencia, String descipcion) {
        this.frecuencia = frecuencia;
        this.descripcion = descipcion;
    }

    public String getFrecuencia() {
        return this.frecuencia;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
}
