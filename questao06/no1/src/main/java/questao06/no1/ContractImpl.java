/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao06.no1;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.SimpleDateFormat;
import java.util.Date;
import questao06.shared.Contract;

/**
 *
 * @author juan
 */
public class ContractImpl extends UnicastRemoteObject implements Contract{

    public ContractImpl() throws RemoteException {
        super();
    }
    
    @Override
    public void updateObs(Date changed) throws RemoteException {
        System.out.println("the file was changed ... " + new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(changed));
    }
    
}
