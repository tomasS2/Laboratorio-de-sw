package Practica3.ejercicio3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add("4");

        StringConverterSet stringConverterSet = new StringConverterSet(set);
        Iterator it = stringConverterSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getClass());
        }
    }
}
