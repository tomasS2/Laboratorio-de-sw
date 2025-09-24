package Practica3.ejercicio8;

import Practica2.ejercicio1b.InstrumentoMusical;

public class Piano implements InstrumentoMusical {

    @Override
    public void hacerSonar() {
    }

    @Override
    public String queEs() {
        return "";
    }

    @Override
    public void hacerSonar(Notas notas, int duracion) {

        //no se justifica hacer un switch en este caso porque es solo imprimir lo mismo siempre. En caso que de acuerdo a la nota, se haga
        //algo en especial, ahí sí se justificaría

        switch (notas) {
            case DO:{
                System.out.println(notas +" "+ duracion + " " +notas.getCifradoAmericano());
                break;
            }
            case RE:{
                System.out.println(notas +" "+ duracion+ " " +notas.getCifradoAmericano());
                break;

            }
            case MI:{
                System.out.println(notas +" "+ duracion+ " " +notas.getCifradoAmericano());
                break;

            }
            case FA:{
                System.out.println(notas +" "+ duracion+ " " +notas.getCifradoAmericano());
                break;

            }
            case SOL:{
                System.out.println(notas +" "+ duracion+ " " +notas.getCifradoAmericano());
                break;

            }
            case LA:{
                System.out.println(notas +" "+ duracion+ " " +notas.getCifradoAmericano());
                break;

            }
            case SI:{
                System.out.println(notas +" "+ duracion+ " " +notas.getCifradoAmericano());
                break;

            }



        }
    }

    @Override
    public void afinar(FrecuenciasDeLA frecuencia) {
        System.out.println(frecuencia);

    }


}
