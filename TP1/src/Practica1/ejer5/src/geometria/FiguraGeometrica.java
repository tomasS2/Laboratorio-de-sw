package geometria;

import java.io.Serializable;


//ejercicio 4 pr2:
//a_dsp hacer

public abstract class FiguraGeometrica implements Serializable {
    private String color;

    private static final long serialVersionUID = 1L;

    public FiguraGeometrica() {
    }

    public abstract void dibujar();

    public abstract Integer  area();

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }

}
