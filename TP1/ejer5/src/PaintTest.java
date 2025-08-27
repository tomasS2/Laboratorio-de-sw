import geometria.Circulo;

public class PaintTest {
    public static void main(String[] args) {
        Paint paint = new Paint();

        paint.init();

        for (int i = 0; i < paint.getPaletas().length ; i++){
            if (paint.getPaletas()[i] instanceof Circulo){
                System.out.println(paint.getPaletas()[i].area());
            }
        }
        System.out.println("LALA");
    }
}