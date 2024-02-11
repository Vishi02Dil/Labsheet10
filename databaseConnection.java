package stmanagementsystem;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
/**
 *
 * @author vishi
 */
public class databaseConnection {
    final static String JDBC_Driver ="com.mysql.cj.jdbc.Driver";
    final static String DB_URL="jdbc:mysql://localhost:3306/stmanagementsystem";
    final static String USER ="root";
    final static String PASS="Vishi@2002";
    
    public static Connection connection(){
        try{
            Class.forName(JDBC_Driver);
            Connection conn=  DriverManager.getConnection(DB_URL,USER,PASS);
            return conn;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}

