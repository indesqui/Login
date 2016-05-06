/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;


import DAO.Conexion;
import DAO.DAO_tema;

import clases.temas;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Miguel
 */
@WebServlet(name = "ingresar_tema", urlPatterns = {"/ingresar_tema"})
public class ingresar_tema extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
               Conexion con = new Conexion();
            if(!con.conectar()){
                response.setContentType("text/html");  
                out.println("<script type=\"text/javascript\">");  
                out.println("alert('[ERROR] Al conectar');");  
         
                out.println("</script>");
                
                
                 out.println("<script type=\"text/javascript\">");  
                out.println("window.location=\"index.jsp\";");  
         
                out.println("</script>");
            
            }else{
                
         String autor = "";
         
         if(request.getParameter("autor") == null){
         autor = request.getParameter("id_autor");
         }else{
         autor="Anonimo";
         
         }
          
              
              
        
            temas T = new temas();
      
            T.setDetalle_tema(request.getParameter("titulo"));
            T.setDescripcion(request.getParameter("descripcion"));
            T.setDificultad(Integer.parseInt(request.getParameter("dificultad")));
            T.setId_tipo(Integer.parseInt(request.getParameter("tipo")));
            T.setId_autor(autor);
          
            
                DAO_tema DT = new DAO_tema();
                
            
            if(DT.Ingresar_Tema(T)){
            
                 response.setContentType("text/html");  
                out.println("<script type=\"text/javascript\">");  
                out.println("alert('[CORRECTO] Tema ingresado correctamente.');");  
                out.println("</script>");
                out.println("<script type=\"text/javascript\">");  
                out.println("window.location=\"newtema.jsp\";");  
                out.println("</script>");
                
            
            }else{
            
                response.setContentType("text/html");  
                out.println("<script type=\"text/javascript\">");  
                out.println("alert('[Error] Al registrar.');");  
                out.println("</script>");
                out.println("<script type=\"text/javascript\">");  
                out.println("window.location=\"newtema.jsp\";");  
                out.println("</script>");
            
            }
            
            
            
            
            
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ingresar_tema.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ingresar_tema.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ingresar_tema.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ingresar_tema.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
