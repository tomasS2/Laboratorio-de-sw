package Practica3.ejercicio2;

public class Main {
    public static void main(String [] args){
        InnerStatic inner = new InnerStatic();

        InnerStatic.Circulo.getArea();
        InnerStatic.Circulo.getLongitudCircunferencia();

        //A
        InnerStatic.Circulo.ingresarRadio();
        InnerStatic.Circulo.getArea();
        System.out.println("---------");
        InnerTest.mainInnerTest();
        InnerTest.mainInnerTest();
        InnerTest.mainInnerTest();
        InnerTest.mainInnerTest();
    }
}