/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point_of_systems;

import java.sql.Connection;

import java.sql.*;
import javax.swing.*;

public class MySqlConnect {
   
    Connection conn = null;
    
    public static Connection ConnectDB() {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");                                    
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Pointofsales","root","");
                                                                                          //DatabaseName
            return connection;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
        
    }
    
    
    public static void main(String[] args) {
        //DicUI zDicUI=new DicUI();
        //zDicUI.show();
    }
}
