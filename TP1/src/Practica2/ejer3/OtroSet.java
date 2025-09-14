package Practica2.ejer3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class OtroSet implements Set {
    private final Set set;
    private int removidos = 0;

    public OtroSet(Set set) {
        this.set = set;
    }

    public int getRemovidos() {
        return removidos;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return this.set.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return this.set.iterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return this.set.add(o);
    }

    @Override
    public boolean remove(Object o) {
        this.removidos ++;
        return this.set.remove(o);
    }

    @Override
    public boolean addAll(Collection c) {
        return this.set.addAll(c);
    }

    @Override
    public void clear() {
        this.removidos = this.set.size();
        this.set.clear();
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
