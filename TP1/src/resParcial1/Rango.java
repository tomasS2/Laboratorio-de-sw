package resParcial1;

public class Rango {
    private int limiteInferior, limiteSuperior;

    public Rango(int limiteInferior, int limiteSuperior) {
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
    }

    public int getLimiteInferior() {
        return limiteInferior;
    }
    public int getLimiteSuperior() {
        return limiteSuperior;
    }

    public Boolean dentroDe(int valor) {
        return (valor > this.limiteInferior && valor < this.limiteSuperior);
    }



}
