/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import DAO.DAO_tema;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Miguel
 */
public class temas {
    
    String detalle_tema,descripcion,id_autor;
    int id_tema,dificultad,id_tipo;

    public temas() {
    }

    public String getDetalle_tema() {
        return detalle_tema;
    }

    public void setDetalle_tema(String detalle_tema) {
        this.detalle_tema = detalle_tema;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId_tema() {
        return id_tema;
    }

    public void setId_tema(int id_tema) {
        this.id_tema = id_tema;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    public String getId_autor() {
        return id_autor;
    }

    public void setId_autor(String id_autor) {
        this.id_autor = id_autor;
    }

    
    
    
    
    
    
    
    
    
}
