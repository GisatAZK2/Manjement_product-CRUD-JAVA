/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

/**
 *
 * @author Administrator
 */
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConfigDB {
    private static Connection mysqlconnection;
    public static Connection mydatabaseconnection(){
    try{
    String DBUrl ="jdbc:mysql://localhost:3306/db_manajemen";
    String DBUser="root";
    String DBpass="";
    mysqlconnection=(Connection)DriverManager.getConnection(DBUrl,DBUser,DBpass);
 
    }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Connection Error");
         System.exit(0);
    }
    return mysqlconnection;
    }
}
