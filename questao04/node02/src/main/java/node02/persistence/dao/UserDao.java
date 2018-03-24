/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package node02.persistence.dao;

import java.io.Serializable;
import java.sql.SQLException;

/**
 *
 * @author juan
 */
public interface UserDao extends Serializable{
    public int persist(int code, String text) throws SQLException;
}
