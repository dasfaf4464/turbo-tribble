package server;

import java.io.IOException;
import java.net.ServerSocket;

public class htmlServer {
    private static final int PORT = 8082;
    private ServerSocket serverSocket;

    public htmlServer() {
        try {
            serverSocket = new ServerSocket(htmlServer.PORT);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void listen() {

    }

}
