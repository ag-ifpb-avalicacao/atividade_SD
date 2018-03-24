/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao06.shared;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

/**
 *
 * @author juan
 */
public interface Contract extends Remote {
//    String checkUpdate() throws RemoteException;
    void updateObs(Date date) throws RemoteException;
}
