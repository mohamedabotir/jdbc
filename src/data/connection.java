/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Threading
 */
public class connection {
    private int port;
    private String server,name,password,db;
    connection(){
    this.server="localhost";
    this.port=3307;
    this.db="t";
    this.password="Kampo";
    this.name="root";
  
    }
    Connection getConnection() throws SQLException{
    Properties data=new Properties();
    data.put("user",name);
    data.put("password", password);
    return DriverManager.getConnection("jdbc:mysql://"+server+":"+port+"/"+db, data);
    
    }
}
