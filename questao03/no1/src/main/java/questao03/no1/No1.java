/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao03.no1;

import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.json.JSONObject;
import request.reply.Client;
import request.reply.Marshaller;
import request.reply.Message;
import request.reply.RemoteRef;

/**
 *
 * @author juan
 */
public class No1 {

    public static void main(String[] args) throws IOException, Base64DecodingException {
        Client cli = new Client();

        int x = 5;
        int y = 6;

        int op = 2;

        ByteBuffer arg = ByteBuffer.allocate(8);
        arg.putInt(x);
        arg.putInt(y);

        Message message = new Message(0, 12, op, arg.array());

        byte[] response = null;
        if (op == 1) {
            //no3
            response = cli.doOperation(new RemoteRef("127.0.0.1", 1024), message, 2001);
        } else if (op == 2) {
            //no2
            response = cli.doOperation(new RemoteRef("127.0.0.1", 1025), message, 2001);
        }
        
        JSONObject object = new JSONObject(new String(response));
        Message resMessage = Marshaller.unMarshal(object);
        
        ByteBuffer argBff = ByteBuffer.wrap(resMessage.getArguments());
        System.out.println(argBff.getInt());
        
    }

}
