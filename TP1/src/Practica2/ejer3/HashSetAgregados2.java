package Practica2.ejer3;

import java.util.Collection;
import java.util.HashSet;

public class HashSetAgregados2<E> extends OtroSet {
    private int cantidadAgregados = 0;
    public HashSetAgregados2() {
        super(new HashSet<>());
    }

    @Override
    public boolean addAll(Collection c) {
        this.cantidadAgregados += c.size();
        return super.addAll(c);
    }
    public int getCantidadAgregados() {
        return cantidadAgregados;
    }
}
