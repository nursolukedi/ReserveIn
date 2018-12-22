/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Servan
 */
import java.sql.*;
import javax.swing.*;

public class javaconnec {
    
    Connection conn = null;
    
    public static Connection ConnecrDb(){
        
        try{
            Class.forName("org.sqlite.JDBC");//com.mysql.jdbc.Driver
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Servan\\Desktop\\NetBeansWorkSpace\\Project123\\project123.sqlite");
            //jdbc:mysql://localhost/(databasefile),"username","password"
            //JOptionPane.showMessageDialog(null, "Database bağlantısı başarılı");
            
            return conn;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
