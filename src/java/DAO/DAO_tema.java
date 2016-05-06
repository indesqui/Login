/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import clases.temas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Migue
 */
public class DAO_tema {
    
     private Conexion Conectar;
     private ResultSet Resultado;

    public DAO_tema() {
        this.Conectar = new Conexion();
        this.Resultado = null;
    }
    
    
    public ResultSet seleccionar_tema(){
   
   
           String mSql = "SELECT * FROM tema ORDER BY fecha DESC";
        
            try {
            this.Conectar.conectar();
            PreparedStatement st = (PreparedStatement) this.Conectar.getConexion().prepareStatement(mSql);
            this.Resultado = st.executeQuery();
            
         
            
                                
            } catch (SQLException | ClassNotFoundException ex) {
        }
               
    
        
    
   return this.Resultado;
    
    }
    
    
    
    
    public ResultSet Solo_hardware(){
    String mSql = "SELECT * FROM tema WHERE id_tipo = '2' ORDER BY fecha DESC;  ";
    try{
    this.Conectar.conectar();
    PreparedStatement st = (PreparedStatement) this.Conectar.getConexion().prepareStatement(mSql);
    this.Resultado = st.executeQuery();
    
    }catch (SQLException | ClassNotFoundException ex){
    
    }
    
    
    return this.Resultado;
    }
    
    public ResultSet Solo_software(){
    
    String mSql = "SELECT * FROM tema WHERE id_tipo = '3' ORDER BY fecha DESC;  ";
    try{
    this.Conectar.conectar();
    PreparedStatement st = (PreparedStatement) this.Conectar.getConexion().prepareStatement(mSql);
    this.Resultado = st.executeQuery();
    
    }catch (SQLException | ClassNotFoundException ex){
    
    }
    
    
    return this.Resultado;
    
    
    
    }
    
public ResultSet Solo_diseno(){

String mSql = "SELECT * FROM tema WHERE id_tipo = '4' ORDER BY fecha DESC;  ";
    try{
    this.Conectar.conectar();
    PreparedStatement st = (PreparedStatement) this.Conectar.getConexion().prepareStatement(mSql);
    this.Resultado = st.executeQuery();
    
    }catch (SQLException | ClassNotFoundException ex){
    
    }
    
    
    return this.Resultado;


}
    
    
    
    
    
    
    public void Cerrar_Conexion()throws  SQLException, ClassNotFoundException{
    
    Conectar.desconectar();
    
    
    }
    
    
    
    public Boolean Ingresar_Tema(temas T){
    
    boolean ok = false;
        
       
    
        String mSql = "INSERT INTO tema(detalle_tema,descripcion,dificultad,fecha,id_tipo,id_autor) values (?, ?, ?, ?, ?, ?)";
        
        try {
           this.Conectar.conectar();
            PreparedStatement st = (PreparedStatement) this.Conectar.getConexion().prepareStatement(mSql);
           
              Calendar DateTime = new GregorianCalendar();
            
            
                   String HH = String.valueOf(DateTime.get(Calendar.HOUR_OF_DAY));
                   String MM = String.valueOf(DateTime.get(Calendar.MINUTE));
                   String SS = String.valueOf(DateTime.get(Calendar.SECOND));
        
        
                     if(SS.length() == 1){
                         SS = "0"+SS;
                     }
        
    
                    String D = String.valueOf(DateTime.get(Calendar.DAY_OF_MONTH));
                    String M = String.valueOf(DateTime.get(Calendar.MONTH)+1);
                    String A = String.valueOf(DateTime.get(Calendar.YEAR));
                   
                     if(M.length() == 1){
                         M= "0"+M;
                     }
            String DT = A+"-"+M+"-"+D+" "+HH+":"+MM+":"+SS;
           
            
            st.setString(1, T.getDetalle_tema());
            st.setString(2, T.getDescripcion());
            st.setInt(3, T.getDificultad());
            st.setString(4,DT);
            st.setInt(5, T.getId_tipo());
            st.setString(6, T.getId_autor());
            
         
            
            
            st.executeUpdate();
            ok = true;
            this.Conectar.desconectar();
            
        } catch (SQLException | ClassNotFoundException ex) {
        }
        
        
        
        
    
    return ok;
    }
    
    
    
    
    
    
    
    
}
