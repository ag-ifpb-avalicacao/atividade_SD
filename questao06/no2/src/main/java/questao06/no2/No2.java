/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao06.no2;

import java.io.File;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Date;
import questao06.shared.Contract;

/**
 *
 * @author juan
 */
public class No2 {
    
    public static Date lastModified = new Date();
    
    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry reg = LocateRegistry.getRegistry(1099);
        Contract stub = (Contract) reg.lookup("contract");
        while(true) {
            Date changed = checkUpdate();
            stub.updateObs(changed);
        }
    }
    
    public static Date checkUpdate() throws RemoteException {
        File file = new File("../disk.txt");
        lastModified = new Date(file.lastModified());
        System.out.println(lastModified);
        System.out.println(new Date(file.lastModified()));
        while (new Date(file.lastModified()).compareTo(lastModified) <= 0) {
            //lock
        }
        return new Date(file.lastModified());
    }
}
