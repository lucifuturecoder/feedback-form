/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package feedback_form;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author lucifuturecoder
 */
public class sqlite_connection {

         Connection conn=null;
         public static Connection dbConnector()
         {
             
             try{
                 Class.forName("org.sqlite.JDBC");
                 Connection conn=DriverManager.getConnection("jdbc:sqlite:/home/lucifuturecoder/NetBeansProjects/ff/feedback");
                 //JOptionPane.showMessageDialog(null,"Connection Successful");
                 return conn;         
        
                 
             }catch(Exception e)
             {
                 JOptionPane.showMessageDialog(null,e);
                 
                 return null;
             }
         }
    
}
