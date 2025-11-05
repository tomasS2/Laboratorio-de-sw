package resParcial2;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SCM {
    private static List list;


    private static class MyHandler implements HttpHandler {

        public void handle(HttpExchange t) throws IOException {
            InputStream is = t.getRequestBody();
            is.read();
            String response = list.toString();
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }

    public void iniciar() {
        list = CreadorDeMelodias.crearNotasYDuraciones(MelodiaDePrueba.class,5);

        try {
            HttpServer server = HttpServer.create(new InetSocketAddress(8000),0);
            server.createContext("/", new MyHandler());
            server.setExecutor(Executors.newFixedThreadPool(10));
            server.start();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
