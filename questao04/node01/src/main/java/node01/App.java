package node01;

import helma.xmlrpc.XmlRpcClient;
import helma.xmlrpc.XmlRpcException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Vector;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) throws MalformedURLException, XmlRpcException, IOException {
        XmlRpcClient client = new XmlRpcClient("http://data-server:8080/RPC2");
        Vector params = new Vector(2);
        params.add(12);
        params.add("some text");
        Integer resultTag = (Integer) client.execute("manager.persist", params);
        System.out.println(resultTag);
    }
}
