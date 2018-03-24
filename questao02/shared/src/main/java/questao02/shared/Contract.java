/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao02.shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author juan
 */
public interface Contract extends Remote{
    int operation_1(int x, int y) throws RemoteException;
    int operation_2(int x, int y) throws RemoteException;
}
