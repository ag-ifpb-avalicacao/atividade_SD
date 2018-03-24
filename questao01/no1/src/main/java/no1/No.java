/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.util.Scanner;

/**
 *
 * @author juan
 */
public class No {

    public static void main(String[] args) {
        try (DatagramSocket client = new DatagramSocket(666)) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Informe o primeiro número");
            int x = scan.nextInt();
            System.out.println("Informe o segundo número");
            int y = scan.nextInt();
            //
            InetAddress target = InetAddress.getByName("no2");
            //
            ByteBuffer bff = ByteBuffer.allocate(8);
            bff.putInt(x);
            bff.putInt(y);
            //
            DatagramPacket pacote = new DatagramPacket(bff.array(), bff.array().length, target, 666);
            client.send(pacote);
            //
            byte[] pack = new byte[1024];
            DatagramPacket responsePack = new DatagramPacket(pack, pack.length);
            client.receive(responsePack);
            System.out.println("aguardando pacotes");
            //
            bff = ByteBuffer.wrap(responsePack.getData());
            System.out.println(bff.getInt());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
