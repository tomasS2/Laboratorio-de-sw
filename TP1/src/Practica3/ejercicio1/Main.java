package Practica3.ejercicio1;

import java.util.Iterator;

public class Main {
    public static void main(String [] args){
        Stack stack = new Stack();
        stack.push("H");
        stack.push("o");
        stack.push("l");
        stack.push("a");

        Iterator it = stack.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        for (int i = 0; i < 5; i++){
            if (!stack.isEmpty()){
                System.out.println(stack.pop());
            }
        }


    }
}