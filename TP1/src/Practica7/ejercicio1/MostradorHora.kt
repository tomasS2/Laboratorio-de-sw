package Practica7.ejercicio1

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.lang.Thread.sleep
import java.time.LocalTime
import java.util.concurrent.Callable
import java.util.concurrent.Executors
import java.util.concurrent.Future
import kotlin.concurrent.thread

class MostradorHora {

    fun formaThread() {
        thread() {
            try {
                while (true) {
                    println(LocalTime.now().toString().substringBefore("."))
                    sleep(1000);
                }
            } catch (e: Exception) {
                println("se rompe")
            }
        }
    }

    fun formaClaseExtiendeThread() {
        val e = Executors.newFixedThreadPool(1);
        e.submit(ThreadExtendido())
    }

    fun formaExecutorImplementado() {
        val e = Executors.newFixedThreadPool(1);
        e.execute {
            while (true) {
                println(LocalTime.now().toString().substringBefore("."))
                Thread.sleep(1000);
            }
        }
    }

    //no cumple con el enunciado pero es solo para ver como funciona
    fun formaPromesa() {

        val e = Executors.newFixedThreadPool(1)
        val future: Future<String> = e.submit(Callable {
            print("Haciendo algo")
            sleep(1000)
            "Terminé"
        })
        while (!future.isDone) {
            println("todavia no terminó")
        }
        println(future.get())
        e.shutdown()
    }

    fun formaCorrutina() = runBlocking {
        launch {
            while (true) {
                println(LocalTime.now().toString().substringBefore("."))
                delay(1000L);
            }
        }
    }
}