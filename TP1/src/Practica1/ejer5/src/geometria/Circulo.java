package geometria;

public class Circulo extends FiguraGeometrica{

    private int radio;
    public Circulo() {
    }

    @Override
    public void dibujar() {
        System.out.println();
    }

    @Override
    public Integer area(){
        return this.radio * this.radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }


}
