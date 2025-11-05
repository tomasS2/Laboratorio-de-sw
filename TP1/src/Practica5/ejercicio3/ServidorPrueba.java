package Practica5.ejercicio3;

@Servidor(direccion = "127.0.0.1", puerto = "8080", archivo = "logslogin.txt")
public class ServidorPrueba {
    private String nombre;

    @Invocar
    public void metodoInvocado(){
        System.out.println("Soy el método invocado que llamó el cliente cuando se conectó al sv");
    }

    public void noInvocado(){
        System.out.println("Soy el método no invocado");
    }


}
