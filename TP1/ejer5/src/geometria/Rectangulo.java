package geometria;

public class Rectangulo extends FiguraGeometrica {

    private int alto;
    private int ancho;

    public Rectangulo(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }
    public Rectangulo() {
    }

    @Override
    public void dibujar() {
        System.out.println("Se dibuja el rectangulo con alto = " + alto + ", ancho = " + ancho);
    }

    @Override
    public int area() {
        return this.alto * this.ancho;
    }
}
