/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import DAO.Conexion;
import DAO.DAO_usuario;
import clases.registro;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author Migue
 */
@WebServlet(name = "registrar", urlPatterns = {"/registrar"})
public class registrar extends HttpServlet {

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
       
            out.println("<title>Conectando...</title>");       
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
            
            registro usuario = new registro();
   
            
            
            
             usuario.setEmail(request.getParameter("email"));
             usuario.setUsuario(request.getParameter("usuario"));
             usuario.setContrasena(DigestUtils.sha1Hex(request.getParameter("pass")));
             usuario.setSexo(request.getParameter("sexo"));
             usuario.setTipo_usuario(Integer.parseInt("0"));
             
            DAO_usuario Ingresar = new DAO_usuario();
             
           if(Ingresar.Usuario_valido(usuario)){
               
              
                response.setContentType("text/html");  
                out.println("<script type=\"text/javascript\">");  
                out.println("alert('[ERROR] Email ya registrado.');");  
         
                out.println("</script>");
                
                
                 out.println("<script type=\"text/javascript\">");  
                out.println("window.location=\"registrar.jsp\";");  
         
                out.println("</script>");
               
             
           
           }else if(Ingresar.Insertar_usuario(usuario)){
           
              response.setContentType("text/html");  
                out.println("<script type=\"text/javascript\">");  
                out.println("alert('[CORRECTO] Registrado Exitosamente.');");  
         
                out.println("</script>");
                
                
                 out.println("<script type=\"text/javascript\">");  
                out.println("window.location=\"iniciar_sesion.jsp\";");  
         
                out.println("</script>");
        }else{
                response.setContentType("text/html");  
                out.println("<script type=\"text/javascript\">");  
                out.println("alert('[ERROR] Al registrar su cuenta');");  
         
                out.println("</script>");
                
                
                 out.println("<script type=\"text/javascript\">");  
                out.println("window.location=\"registrar.jsp\";");  
         
                out.println("</script>");
               
           }}}
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
            Logger.getLogger(registrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(registrar.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(registrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(registrar.class.getName()).log(Level.SEVERE, null, ex);
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
