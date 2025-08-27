package laboratorio;
import java.io.File;
public class MiArchivo extends File {
    public MiArchivo() {
        super("Un archivo");
        System.out.println("Mi Archivo instanciado") ;
    }
}