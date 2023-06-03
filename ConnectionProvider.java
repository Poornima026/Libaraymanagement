/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libs.Project;
import java.sql.*;
/**
 *
 * @author Poornima
 */
public class ConnectionProvider {
    public static Connection getCon()
            
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lll","root","Poornima@26");
        return con;
        
    }
    catch(Exception e)
    {
        System.out.println(e);
        return null;
    }
} 
}
