/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package node02.persistence.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import node02.persistence.ConnFactory;

/**
 *
 * @author juan
 */
public class H2UserDaoImpl implements UserDao {

    private final Connection connection;

    public H2UserDaoImpl() throws SQLException {
        this.connection = ConnFactory.getH2Connection();
    }

    public int persist(int code, String text) throws SQLException {
        PreparedStatement pstmt = connection.prepareStatement("insert into tb_user values(?,?);");
        pstmt.setInt(1, code);
        pstmt.setString(2, text);
        int vrf = pstmt.executeUpdate();
        pstmt.close();
        return vrf;
    }

}
