/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfproject;

import guiSelfProject.G_Admin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Allewaa
 */
public class SelfProject {
    
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        G_Admin g=new G_Admin();
        g.setVisible(true);
    }
    
}
