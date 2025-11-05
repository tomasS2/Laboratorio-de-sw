package Practica7.ejercicio3

import java.util.concurrent.Callable
import java.util.concurrent.ExecutionException
import java.util.concurrent.Executors
import java.util.concurrent.Future
import kotlin.concurrent.thread
import kotlin.random.Random

fun main(args: Array<String>) {




    //3
//    for(i in 1 .. 5) {
//        thread() {
//            var metros = 0
//            while (metros < 10) { //son 100
//                metros += 1
//                System.out.println("Recorrió $metros metros el corredor ${Thread.currentThread().threadId()} ")
//            }
//            System.out.println("Llegó al final el corredor ${Thread.currentThread().threadId()}")
//        }
//    }

//    //3)a)
//    val e = Executors.newFixedThreadPool(5)
//    for(i in 1 .. 5) {
//        e.execute{
//            var metros = 0
//            while (metros < 10) { //son 100
//                metros += 1
//                System.out.println("Recorrió $metros metros el corredor ${Thread.currentThread().threadId()} ")
//            }
//            System.out.println("Llegó al final el corredor ${Thread.currentThread().threadId()}")
//        }
//    }
//    e.shutdown();



    //3 con clase corredor
    val c1 = Corredor("Tomás")
    val c2 = Corredor("Franco")
    val c3 = Corredor("Jeremías")
    val c4 = Corredor("Aramis")
    val c5 = Corredor("Quimey")
    val corredores = ArrayList<Corredor>()

    corredores.add(c1)
    corredores.add(c2)
    corredores.add(c3)
    corredores.add(c4)
    corredores.add(c5)

    //3
//    for(corredor in corredores) {
//        thread() {
//            while (corredor.metrosRecorridos < 10) {//son 100
//                corredor.avanzo()
//                System.out.println("Recorrió ${corredor.metrosRecorridos} metros el corredor ${corredor.nombre} ")
//            }
//            System.out.println("Llegó al final el corredor ${corredor.nombre}")
//        }
//    }
    //3_a
//    val e = Executors.newFixedThreadPool(5)
//    for (corredor in corredores) {
//        e.execute {
//            while (corredor.metrosRecorridos < 10) {//son 100
//                corredor.avanzo()
//                System.out.println("Recorrió ${corredor.metrosRecorridos} metros el corredor ${corredor.nombre} ")
//            }
//            System.out.println("Llegó al final el corredor ${corredor.nombre}")
//        }
//    }
//    e.shutdown()

    //3_b callables
    val executor = Executors.newFixedThreadPool(5)

    val corredor = Callable<String> {
        var metros = 0
        while (metros < 10) {
            metros += Random.nextInt(1, 10)
        }
        "Corredor terminó la carrera!"
    }

    val future: Future<String> = executor.submit(corredor)

    try {
        val resultado = future.get()
        println(resultado)
    } catch (e: ExecutionException) {
        println("Ocurrió un problema: ${e.cause?.message}")
    } catch (e: InterruptedException) {
        println("Ejecución interrumpida.")
    } finally {
        executor.shutdown()
    }

}
