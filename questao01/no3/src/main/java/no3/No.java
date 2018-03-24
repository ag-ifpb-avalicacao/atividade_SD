/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.ByteBuffer;

/**
 *
 * @author juan
 */
public class No {

    public static void main(String[] args) {
        try (DatagramSocket server = new DatagramSocket(667)) {
            byte[] buffer = new byte[1024];
            DatagramPacket pack = new DatagramPacket(buffer, buffer.length);
            System.out.println("aguardando pacotes");
            server.receive(pack);
            //
            ByteBuffer bff = ByteBuffer.wrap(pack.getData());
            int x = bff.getInt();
            int y = bff.getInt();
            //
            x *= x;
            y *= y;
            //
            bff = ByteBuffer.allocate(4);
            bff.putInt(x + y);
            DatagramPacket result = new DatagramPacket(bff.array(), bff.array().length, pack.getAddress(), pack.getPort());
            server.send(result);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
