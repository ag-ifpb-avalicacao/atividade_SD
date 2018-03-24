/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao06.no1;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author juan
 */
public class No1 {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry reg = LocateRegistry.createRegistry(1099);
        reg.rebind("contract", new ContractImpl());
    }
}
