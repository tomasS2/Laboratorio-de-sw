package Practica7.ejercicio1

import java.time.LocalTime


class ThreadExtendido : Thread() {
    override fun run() {
        try {
            while (true) {
                println(LocalTime.now());
                sleep(1000);
            }
        } catch (e: Exception) {
            System.out.println("se rompe")
        }
    }
}