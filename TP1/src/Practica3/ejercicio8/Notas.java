package Practica3.ejercicio8;

public enum Notas {
    DO("C"),
    RE("D"),
    MI("E"),
    FA("F"),
    SOL("G"),
    LA("A"),
    SI("B");

    private String cifradoAmericano;

    Notas(String cifradoAmericano) {
        this.cifradoAmericano = cifradoAmericano;
    }

    public String getCifradoAmericano() {
        return cifradoAmericano;
    }
}
