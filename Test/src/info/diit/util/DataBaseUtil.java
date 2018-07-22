/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.diit.util;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class DataBaseUtil {
    private Connection con;
    private String user = "root";
    private String password = "123";
    private String url = "jdbc:mysql://localhost:3306/test";
    
   public DataBaseUtil() throws ClassNotFoundException{
       Class.forName("com.mysql.jdbc.Driver");
   }
   
   public Connection getCon() throws SQLException{
       con = (Connection) DriverManager.getConnection(url, user, password);
       return con;
   }
}
