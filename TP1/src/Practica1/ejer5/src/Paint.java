import geometria.Circulo;
import geometria.FiguraGeometrica;
import geometria.Rectangulo;

public class Paint {
    private FiguraGeometrica[] paletas;

    public Paint() {
    }
    public FiguraGeometrica[] getPaletas() {
        return this.paletas;
    }
    public void setPaletas(FiguraGeometrica[] paletas) {
        this.paletas = paletas;
    }

    public void init(){
        Circulo circulo1 = new Circulo();
        circulo1.setRadio(2);
        circulo1.setColor("azul");

        Circulo circulo2 = new Circulo();
        circulo2.setRadio(3);
        circulo2.setColor("amarillo");

        Rectangulo rectangulo1 = new Rectangulo(2, 3);
        rectangulo1.setColor("verde");

        Rectangulo rectangulo2 = new Rectangulo(4, 10);
        rectangulo2.setColor("rojo");

        FiguraGeometrica[] aux = {circulo1, circulo2, rectangulo1, rectangulo2};
        this.setPaletas(aux);


    }

}
