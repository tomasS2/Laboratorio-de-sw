class FutbolException extends Exception{}
class Falta extends FutbolException{}
class EquipoIncompleto extends
        FutbolException{}
class ClimaException extends Exception{}
class Lluvia extends ClimaException{}
class Mano extends Falta{}
class Partido {
    Partido() throws FutbolException{}
    void eventoPartido() throws FutbolException{} //le cambio el nombre a este metodo para que no hay un conflicto de nombres con el de la interface que implementa Encuentro()
    void jugada() throws EquipoIncompleto,
            Falta{}
    void penal() throws Mano {} //se agrega el throws Mano para que la subclase no tenga el conflicto que indica que la superclase no hace un throws de "Mano" en el metodo
}

interface Tormenta {
void evento() throws Lluvia;
void diluvio() throws Lluvia;
}

public class Encuentro extends Partido
        implements Tormenta {
    Encuentro() throws Lluvia,
            FutbolException {}

    Encuentro(String fecha) throws Falta,
            FutbolException {}


    void penal() throws Mano {}

    public void evento() throws Lluvia {} //aca dice que hay un conflicto de nombres y java no sabe cuál usar, si el de la superclase o el de la inferface. Al sobreescribir un metodo solo se tiene en cuenta la firma y los parametros. Ademasm dice que el metodo de la superclase no throwea "lluvia".

    public void diluvio() throws Lluvia {}

    //public void evento() {} //este se elimina porque para sobrecargar un metodo solo basta con el nombre y los parámetros, el throws no entra y, por lo tanto, lo estaria duplicando.

    void jugada() throws Mano {}
}

public void main(String[] args) {
    try {
        Encuentro enc = new Encuentro();
        enc.jugada();
    } catch(Mano e) {
    } catch(Lluvia e) {
    } catch(FutbolException e) {
        try {
            Partido par = new Encuentro();
            par.jugada();



            /*
            * Se cambia el nombre de la variable "e" porque ya fue definida en este contexto (este try catch esta contenido dentro de un catch)*/
            } catch(EquipoIncompleto e2) {//habia un EquipoIncompleto e
            } catch(Falta e2) {//habia un Falta e
            } catch(Lluvia e2) {//habia un Lluvia e
            } catch(FutbolException e2) {//habia un FutbolException e
        }
    }
}




