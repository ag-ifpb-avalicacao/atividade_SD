/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package node02.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author juan
 */
public class ConnFactory {

    public static Connection getH2Connection() throws SQLException {
        return DriverManager.getConnection("jdbc:h2:mem:;"
                + "INIT=RUNSCRIPT FROM 'create_schema.sql'\\;", "sa", "");
    }

    public static Connection getPgConnection() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection("jdbc:postgresql://host-banco:5432/userdb", "postgres", "equinox");
    }

}
