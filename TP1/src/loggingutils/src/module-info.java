//un módulo es una colección de paquetes de java que pueden ser exportados y accedidos desde código externo.
module loggingutils{
    requires java.logging; //aca se indica qué requiere este módulo para funcionar
    exports loggingutils; //y aca qué se exporta
}
