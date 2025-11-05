package Practica5.ejercicio3;

import java.io.*;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.lang.Integer.parseInt;

public class Contenedor {
    private String ruta;

    public void iniciarServidor(Object instancia) {

        try{
            Class <?> testClass = instancia.getClass();
            if (!testClass.isAnnotationPresent(Servidor.class)) {
                throw new ClassNotFoundException("La clase no tiene la anotación @Servidor");
            }
            Servidor configServidor = testClass.getAnnotation(Servidor.class);
            ServerSocket serverSocket = new ServerSocket(parseInt(configServidor.puerto()));
            while (true){
                Socket socket = serverSocket.accept();
                String ipCliente = socket.getInetAddress().getHostAddress();
                loguearConexion(configServidor.archivo(), ipCliente);
                OutputStream out = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(out, true);
                writer.println("HTTP/1.1 200 OK");
                writer.println("Content-Type: text/plain");
                writer.println();
                writer.println("Conexión recibida desde " + ipCliente);
                writer.flush();
                for (Method m: testClass.getDeclaredMethods()){
                    if (m.isAnnotationPresent(Invocar.class)){
                        m.setAccessible(true);
                        m.invoke(instancia);

                    }
                }
                socket.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void loguearConexion(String archivo, String ip) {
        try (FileWriter fw = new FileWriter(archivo, true)) {
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            fw.write("[" + timestamp + "] Conexión desde IP: " + ip + "\n");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo de log");
            e.printStackTrace();
        }
    }
}
