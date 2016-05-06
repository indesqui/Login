/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import clases.registro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Migue
 */
public class DAO_usuario {
    

    private Conexion Conectar;
    private ResultSet Resultado;
    
    
    public DAO_usuario(){
       this.Conectar = new Conexion();
       this.Resultado = null;
   }
    
    
    public boolean Insertar_usuario(registro usuario){
    boolean ok = false;
        
        String mSql = "INSERT INTO usuario(email,tipo_usuario,usuario,contrasena,sexo) values (?, ?, ?, ?, ?)";
        
        try {
           this.Conectar.conectar();
            PreparedStatement st = (PreparedStatement) this.Conectar.getConexion().prepareStatement(mSql);
            st.setString(1, usuario.getEmail());
             st.setInt(2, usuario.getTipo_usuario());
            st.setString(3, usuario.getUsuario());
            st.setString(4, usuario.getContrasena());
            st.setString(5, usuario.getSexo());
           
            
            System.out.println(usuario.getEmail() + usuario.getContrasena() + usuario.getUsuario() + usuario.getSexo());
            
            st.executeUpdate();
            ok = true;
            this.Conectar.desconectar();
            
        } catch (SQLException | ClassNotFoundException ex) {
        }
             
    return ok;
    
    }
    
    public Boolean Usuario_valido(registro usuario) throws SQLException{
    
       
        
         String mSql = "SELECT * FROM usuario WHERE email='" + usuario.getEmail() + "' OR usuario = '" + usuario.getEmail()+"'";
        
            try {
            this.Conectar.conectar();
            PreparedStatement st = (PreparedStatement) this.Conectar.getConexion().prepareStatement(mSql);
            this.Resultado = st.executeQuery();
            
         
            
                                
            } catch (SQLException | ClassNotFoundException ex) {
        }
               
      
        
    return this.Resultado.next();
    }
    
    
    public Boolean Usuario_Correcto(String U,String P) throws SQLException{
    
    String mSql = "SELECT * FROM usuario WHERE email='" + U + "' AND contrasena='"+P+"'";
    try {
            this.Conectar.conectar();
            PreparedStatement st = (PreparedStatement) this.Conectar.getConexion().prepareStatement(mSql);
            this.Resultado = st.executeQuery();
            
         
            
                                
            } catch (SQLException | ClassNotFoundException ex) {
        }
    return this.Resultado.next();
    }
    
    
    public ResultSet Select_Usuario(String U,String P) throws SQLException{
    
    String mSql = "SELECT * FROM usuario WHERE email='"+U+"' AND contrasena='"+P+"'";
    try{
    this.Conectar.conectar();
    PreparedStatement st = (PreparedStatement) this.Conectar.getConexion().prepareStatement(mSql);
    this.Resultado = st.executeQuery();
    
    }catch (SQLException | ClassNotFoundException ex){
    
    }
    
    
    return this.Resultado;
    
    
    }
    
    
    
    
   
   }

