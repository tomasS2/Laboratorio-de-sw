![img.png](img.png)

1_ El error surge porque la excepción ya está catcheada. Al "Exception2" ser hija de Exception1 cuando se catchee la Excepcion1 se va a catchear la Excepcion2
</br>
Así quedaria:

![img_3.png](img_3.png)

![img_2.png](img_2.png)

2_ Sin borrar los comentarios tira un error en compilación luego del "return 1" porque nunca se va a ejecutar lo que sigue después.

Cuando se borran los comentarios, se ejecutan los 2 println del "unMetodo()" y el main imprime 2.

![img_4.png](img_4.png)

3_ Imprime: 
</br>
"Test3"
</br>
"Primer try"
</br>
"Finally del 2º try"
</br>
"Se capturó la Excepción ex del 1º Primer try"
</br>
"Finally del 1º try"

![img_5.png](img_5.png)

4_ 