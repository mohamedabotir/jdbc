/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Threading
 */
public class Data {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        connection db=new connection();
        Connection con=db.getConnection();
    }
    
}
