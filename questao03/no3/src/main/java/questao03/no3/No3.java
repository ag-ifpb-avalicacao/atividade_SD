/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao03.no3;

import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import java.io.IOException;
import org.json.JSONObject;
import request.reply.Client;
import request.reply.Marshaller;
import request.reply.Message;
import request.reply.RemoteRef;
import request.reply.Server;

/**
 *
 * @author juan
 */
public class No3 {

    public static void main(String[] args) throws IOException, Base64DecodingException, ClassNotFoundException {
        while (true) {
            Server server = new Server(1024);
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
        if (reqMessage.getOperationId() == 1) {
            response = cli.doOperation(new RemoteRef("127.0.0.1", 1025), reqMessage, 2003);
        } else if (reqMessage.getOperationId() == 2) {
            response = cli.doOperation(new RemoteRef("127.0.0.1", 1026), reqMessage, 2003);
        }

        return response;
    }
}
