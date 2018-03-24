/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao02.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import questao02.shared.Contract;

/**
 *
 * @author juan
 */
public class Client {

    public static void main(String[] args) {
        try {
            Contract contract = (Contract) LocateRegistry.getRegistry(1099).lookup("rmi://no1");
            int result = contract.operation_2(2, 4);
            System.out.println(result);
        } catch (NotBoundException | RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
