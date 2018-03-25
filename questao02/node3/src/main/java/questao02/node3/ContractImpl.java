/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao02.node3;

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
        try {
            Contract contract = (Contract) LocateRegistry.getRegistry("no1", 1099).lookup("rmi://no1");
            return contract.operation_1(x, y);
        } catch (NotBoundException ex) {
            System.out.println("no1 falhou, tentar comunicacao com no2");
        }
        try {
            Contract contract = (Contract) LocateRegistry.getRegistry("no2", 1099).lookup("rmi://no2");
            return contract.operation_1(x, y);
        } catch (NotBoundException ex) {
            System.out.println("comunicacao com no2 tambem falhou");
        }
        throw new RemoteException();
    }

    @Override
    public int operation_2(int x, int y) throws RemoteException {
        return (2 * x) / y;
    }

}
