/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Migue
 */
public class DAO_tipo {
    
    
     private Conexion Conectar;
     private ResultSet Resultado;

    public DAO_tipo() {
        this.Conectar = new Conexion();
        this.Resultado = null;
    }
    
    public ResultSet Listar_Tipo(){
    
       String mSql = "SELECT * FROM tipo";
        
            try {
            this.Conectar.conectar();
            PreparedStatement st = (PreparedStatement) this.Conectar.getConexion().prepareStatement(mSql);
            this.Resultado = st.executeQuery();
            
         
            
                                
            } catch (SQLException | ClassNotFoundException ex) {
        }
               
    
        
    
   return this.Resultado;
    
    
    
    
    }
    
    
    public void Cerrar_Conexion() throws SQLException{
    
    Conectar.desconectar();
    
    
    
    }
   
    
    
    
}
