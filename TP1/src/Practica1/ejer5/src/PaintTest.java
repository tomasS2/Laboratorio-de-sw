import geometria.Circulo;
import geometria.FiguraGeometrica;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class PaintTest {
    public static void main(String[] args) throws IOException {
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


        //ejer 3 pr 2 (falta completar algo para entenderlo bien)

        Circulo c = new Circulo();
        FileOutputStream fileOutputStream = new FileOutputStream("archivoprueba.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(c);
        objectOutputStream.close();
    }
}