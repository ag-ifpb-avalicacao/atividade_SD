/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao02.node3;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author juan
 */
public class Server_3 {
    public static void main(String[] args) throws NotBoundException {
        try {
            Registry reg = LocateRegistry.createRegistry(1099);
            reg.rebind("rmi://no3", new ContractImpl());
        } catch (RemoteException ex) {
            System.out.println("erro ao dar get no registrador global : 3");
        }
    }
    
}
