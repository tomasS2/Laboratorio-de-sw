package Practica3.ejercicio3;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

public class StringConverterSet extends AbstractSet {

    private Set set;

    public StringConverterSet(Set set) {
        this.set = set;
    }

    @Override
    public Iterator iterator() {
        return new IteratorStringAdapter(this.set.iterator());
    }

    @Override
    public int size() {
        return this.set.size();
    }

    class IteratorStringAdapter implements Iterator {

        private Iterator i;

        public IteratorStringAdapter(Iterator iterator) {
            this.i = iterator;
        }


        @Override
        public boolean hasNext() {
            return this.i.hasNext();
        }

        @Override
        public Object next() {
            return String.valueOf(this.i.next());
        }
    }
}
