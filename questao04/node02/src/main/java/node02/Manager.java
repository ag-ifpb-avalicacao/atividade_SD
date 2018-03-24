/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package node02;

import java.io.Serializable;
import java.sql.SQLException;
import node02.persistence.dao.UserDao;
import node02.persistence.dao.H2UserDaoImpl;
import node02.persistence.dao.PgUserDaoImpl;

/**
 *
 * @author juan
 */
public class Manager implements Serializable{
    private UserDao daoH2, daoPg;
    
    public Manager() {
        try {
            daoH2 = new H2UserDaoImpl();
            daoPg = new PgUserDaoImpl();
        } catch (SQLException ex) {
            System.out.println("has occured an problem in instantiate the dao objects");
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            System.out.println("class not found");
        }
    }
    
    public int persist(int code, String text) {
        try {
            int vrfH2 = daoH2.persist(code, text);
            int vrfPg = daoPg.persist(code, text);
            return vrfH2 + vrfPg;
        } catch (SQLException ex) {
            System.out.println("has occured a error trying persist the data");
        }
        return -2;
    }
}
