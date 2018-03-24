package node02;

import helma.xmlrpc.WebServer;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) throws IOException {
        WebServer server = new WebServer(8080);
        server.addHandler("manager", new Manager());
    }
}
