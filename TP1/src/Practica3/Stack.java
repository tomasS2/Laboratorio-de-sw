package Practica3;

import java.util.ArrayList;
import java.util.Iterator;

public class Stack implements Iterable{
    private java.util.ArrayList items;
    public Stack(){
        this.items = new ArrayList<>();
    }
    public void push(Object o){
        this.items.add(o);
    }

    public Object pop (){
        return this.items.removeLast();
    }

    public boolean isEmpty(){
        return this.items.isEmpty();
    }

    @Override
    public Iterator iterator() {
        return getIterador();
    }

    private StackIterator getIterador (){
        return new StackIterator();
    }

    private class StackIterator implements Iterator {
        private int indice = 0;
        @Override
        public boolean hasNext() {
            return this.indice < items.size();
        }

        @Override
        public Object next() {
            Object o = items.get(this.indice);
            this.indice++;
            return o;
        }
    }





}