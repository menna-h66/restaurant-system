/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfproject;
import classSelfProject.classAdmin;
import guiSelfProject.G_Admin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.sql.*;

/**
 *
 * @author Allewaa
 */
public class Admin  {
   
     public static Connection connect() {
         try {
        String url="jdbc:sqlserver://localhost\\DESKTOP-E5A6RQ2\\SQLEXPRESS:1433;databaseName=SelfProject";
        String username="NewPro";
        String password="123123";
        Connection con= DriverManager.getConnection(url,username,password);
        return con;
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "cannot connect");
         }
         return null;
         
     
    
}}
