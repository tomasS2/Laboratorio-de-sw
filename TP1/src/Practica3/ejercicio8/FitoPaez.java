package Practica3.ejercicio8;

public enum FitoPaez {
    INSTANCE;

    private Piano piano;

    FitoPaez() {
        this.piano = new Piano();
    }

    public Piano getPiano() {
        return piano;
    }

    public void tocarCancion(Notas[] notas, int[] tiempos) {
        for (int i = 0; i < notas.length; i++) {
            this.piano.hacerSonar(notas[i], tiempos[i]);
        }
    }

}
