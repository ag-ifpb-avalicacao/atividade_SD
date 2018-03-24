/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao02.node2;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import questao02.shared.Contract;

/**
 *
 * @author juan
 */
public class ContractImpl extends UnicastRemoteObject implements Contract {

    public ContractImpl() throws RemoteException {
        super();
    }

    @Override
    public int operation_1(int x, int y) throws RemoteException {
        return 2 * y * x;
    }

    @Override
    public int operation_2(int x, int y) throws RemoteException {
        try {
            Contract contract = (Contract) LocateRegistry.getRegistry(2001).lookup("rmi://no3");
            return contract.operation_2(x, y);
        } catch (NotBoundException ex) {
            ex.printStackTrace();
        }
        throw new RemoteException();
    }

}
