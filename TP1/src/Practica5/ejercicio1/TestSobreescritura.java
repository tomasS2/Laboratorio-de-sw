package Practica5.ejercicio1;

public class TestSobreescritura{
    //@Override el override no va porque la clase padre de TestSobreescritura es Object y no tiene un método "tostring" (sí tiene un método "toString")
    public String totring() {
        return super.toString() + " Testeando: 'Override'";
    }
}
