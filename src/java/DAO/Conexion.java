/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Migue
 */
public class Conexion {
   
   private String Url;
    private String Driver;
    private String User;
    private String Pass;
    private Connection conexion;
    
    
    public Conexion(){
        this.Url = "jdbc:mysql://localhost:3306/soporte";
        this.Driver = "com.mysql.jdbc.Driver";
        this.User = "root";
        this.Pass = "";
        this.conexion = null;
    }
    
    public Boolean conectar() throws SQLException, ClassNotFoundException{
        boolean Conexion;
      try{
        Class.forName(this.Driver);
        this.conexion = DriverManager.getConnection(this.Url, this.User, this.Pass);
        Conexion = true;
      
      }catch(SQLException e){
          System.out.println("Error Al conectar");
          Conexion = false;
          
      
      }
      return Conexion;
    }
    
    public void desconectar() throws SQLException  {
          
            this.conexion.close();
       }
    
    public Connection getConexion() {
        return this.conexion; 
    }
    
    
}
