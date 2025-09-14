import geometria.Circulo;

import java.util.Arrays;

public class PaintTest {
    public static void main(String[] args) {
        Paint paint = new Paint();

        paint.init();

        for (int i = 0; i < paint.getPaletas().length ; i++){
            if (paint.getPaletas()[i] instanceof Circulo){
                System.out.println(paint.getPaletas()[i].area());
            }
        }



        //ejer 2 práctica 2

        for (int i = 0; i < paint.getPaletas().length ; i++){
            System.out.println(paint.getPaletas()[i]);
            System.out.println(paint.getPaletas()[i].area());
        }

        Arrays.sort(paint.getPaletas(), (a, b) -> a.area().compareTo(b.area()));
        System.out.println(Arrays.toString(paint.getPaletas()));


        //ejer 3 pr 2


    }
}