package Practica5.ejercicio3;

@Servidor(direccion = "127.0.0.10", puerto = "443", archivo = "logslogin.txt")
public class ServidorPrueba {
    private String nombre;

    @Invocar
    public void metodoInvocado(){
        System.out.println("Soy el método invocado");
    }

    public void noInvocado(){
        System.out.println("Soy el método no invocado");
    }


}
