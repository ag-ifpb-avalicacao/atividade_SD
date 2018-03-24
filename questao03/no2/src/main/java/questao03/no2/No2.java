/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao03.no2;

import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import java.io.IOException;
import java.net.SocketException;
import org.json.JSONObject;
import request.reply.Marshaller;
import request.reply.Message;
import request.reply.Server;
import request.reply.Client;
import request.reply.RemoteRef;

/**
 *
 * @author juan
 */
public class No2 {

    public static void main(String[] args) throws IOException, SocketException, Base64DecodingException, ClassNotFoundException {
        while (true) {
            Server server = new Server(1025);
            byte[] request = server.getRequest();
            byte[] response = process(request);
            server.sendReply(response);
        }
    }

    private static byte[] process(byte[] request) throws Base64DecodingException {
        JSONObject object = new JSONObject(new String(request));
        Message reqMessage = Marshaller.unMarshal(object);
        Client cli = new Client();
        byte[] response = null;
        if (reqMessage.getOperationId() == 2) {
            response = cli.doOperation(new RemoteRef("127.0.0.1", 1024), reqMessage, 2002);
        } else if (reqMessage.getOperationId() == 1) {
            response = cli.doOperation(new RemoteRef("127.0.0.1", 1026), reqMessage, 2002);
        }

        return response;
    }

}
