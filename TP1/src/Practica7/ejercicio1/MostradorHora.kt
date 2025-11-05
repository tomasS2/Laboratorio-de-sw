package Practica7.ejercicio1

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.lang.Thread.sleep
import java.time.LocalTime
import java.util.concurrent.Executors
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

    fun formaCorrutina() = runBlocking {
        launch {
            while (true) {
                println(LocalTime.now().toString().substringBefore("."))
                delay(1000L);
            }
        }
    }
}