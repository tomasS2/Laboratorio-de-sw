package Practica3.ejercicio5;

import java.util.ArrayList;
import java.util.Iterator;

public class Stack implements Iterable{
    private ArrayList items;
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


    //es útil definir una clase anónima cuando se necesita una clase simple de uso único y para un propósito breve.
    @Override
    public Iterator iterator() {
        return new Iterator() {
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
        };
    }

}