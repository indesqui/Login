/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import DAO.Conexion;
import DAO.DAO_usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.codec.digest.DigestUtils;
 
/**
 *
 * @author Migue
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {
 

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
           
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> Desarrollo</title>");           
            out.println("</head>");
            out.println("<body>");
            out.println("</body>");
            out.println("</html>");
          
           
              String U,P;
            
           
              U = request.getParameter("email");
              P = DigestUtils.sha1Hex(request.getParameter("pass"));
                      
              
             
              
           
              
              
             DAO_usuario consultar = new DAO_usuario();
             Conexion con = new Conexion();
             if(!con.conectar()){
             response.setContentType("text/html");  
                
                out.println("<script type=\"text/javascript\">");  
                out.println("alert('[ERROR] Al conectar');");  
         
                out.println("</script>");
                
                
                 out.println("<script type=\"text/javascript\">");  
                out.println("window.location=\"iniciar_sesion.jsp\";");  
         
                out.println("</script>");
             
             }else{
         
             
             if(!consultar.Usuario_Correcto(U, P)){
                response.setContentType("text/html");  
                out.println("<script type=\"text/javascript\">");  
                out.println("alert('[ERROR] Al iniciar sesion.');");  
           
                out.println("</script>");
                
                
                out.println("<script type=\"text/javascript\">");  
                out.println("window.location=\"iniciar_sesion.jsp\";");  
         
                out.println("</script>");
                 
             }else{
                 
                /*
                 ResultSet usuario;
                 
                 usuario =  consultar.Select_Usuario(U, P);
                 
                 String sexo,nickname;
                 sexo = usuario.getString("sexo");
                 nickname = usuario.getString("usuario");
                 int tipo_usuario = usuario.getInt("tipo_usuario");
                 */
                 
                 HttpSession mysesion = request.getSession();
                 ServletContext ctx = getServletContext();
                 
                 mysesion.setAttribute("U", U);
                 mysesion.setAttribute("P", P);
                 /*
                 mysesion.setAttribute("sexo",sexo);
                 mysesion.setAttribute("tipo_usuario",tipo_usuario);
                 mysesion.setAttribute("nickname",nickname);
                 */
                 RequestDispatcher dispatcher = ctx.getRequestDispatcher("/desarrollo.jsp");
                 
                 
                 dispatcher.include(request, response);
                  
             
            
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
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
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
