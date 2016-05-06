package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.DAO_usuario;
import DAO.DAO_tipo;
import clases.temas;
import java.sql.SQLException;
import DAO.DAO_tema;
import java.sql.ResultSet;

public final class desarrollo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");

    String U,P,User;
 

    
    
   if(session.getAttribute("U") == null ||session.getAttribute("P") == null){
     out.print("Sesion invalida");
     out.println("<br> <a href=\"iniciar_sesion.jsp\">Volver a intentar</a>");
     
   }else
     {
        
             User=session.getAttribute("nickname").toString();
             User = User.substring(0, 10) +"..."; 
  
      
        
    
    
    

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Desarrollo</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/materialize.min.css\"/>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("        ");
 
            
            
        if(session.getAttribute("tipo_usuario") == "0"){
        
        
       
        
        
        
      out.write("\n");
      out.write("        ");
    out.print(" <nav class=\"teal\">  ");
      out.write("\n");
      out.write("        ");
    out.print("    <div class=\"nav-wrapper\"> "); 
      out.write("\n");
      out.write("        ");
    out.println("<a  class=\"brand-logo left\"  href=\"desarrollo.jsp\">" + User+ "</a>"); 
      out.write("\n");
      out.write("  \n");
      out.write("         \n");
      out.write("        ");
    out.print("  <a href=\"#\" data-activates=\"mobile\" class=\"button-collapse\"> "); 
      out.write("\n");
      out.write("        ");
    out.print("    <i class=\"mdi-navigation-menu\"></i>  "); 
      out.write("\n");
      out.write("                \n");
      out.write("        ");
    out.print("</a>"); 
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("         ");
 out.print("  <ul id=\"nav-mobile\" class=\"right hide-on-med-and-down\">  "); 
      out.write("\n");
      out.write("         ");
 out.print("           <li><a href=\"hardware.jsp\">Hardware</a></li> "); 
      out.write("\n");
      out.write("         ");
 out.print("           <li><a href=\"software.jsp\">Software</a></li> "); 
      out.write("\n");
      out.write("         ");
 out.print("           <li><a href=\"diseno.jsp\">Diseño</a></li> "); 
      out.write("\n");
      out.write("         ");
 out.print("           <li><a href=\"logout.jsp\">Cerrar Sesion</a></li> "); 
      out.write("\n");
      out.write("         ");
 out.print("  </ul> "); 
      out.write("\n");
      out.write("         ");
 out.print("      <ul class=\"side-nav\" id=\"mobile\"> "); 
      out.write("\n");
      out.write("                    \n");
      out.write("          ");
 out.print("       <li><a href=\"hardware.jsp\">Hardware</a></li> "); 
      out.write("\n");
      out.write("          ");
 out.print("       <li><a href=\"software.jsp\">Software</a></li> "); 
      out.write("\n");
      out.write("          ");
 out.print("       <li><a href=\"diseno.jsp\">Diseño</a></li> "); 
      out.write("\n");
      out.write("          ");
 out.print("       <li><a href=\"logout.jsp\">Cerrar Sesion</a></li> "); 
      out.write("\n");
      out.write("          ");
 out.print("</ul> \n </div>  \n </nav>"); 
      out.write("         \n");
      out.write("            \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("            ");
  
            }else{

        <%    out.print(" <nav class=\"teal\">  ");
      out.write("\n");
      out.write("        ");
    out.print("    <div class=\"nav-wrapper\"> "); 
      out.write("\n");
      out.write("        ");
    out.println("<a  class=\"brand-logo left\"  href=\"desarrollo.jsp\">" + User+ "</a>"); 
      out.write("\n");
      out.write("  \n");
      out.write("         \n");
      out.write("        ");
    out.print("  <a href=\"#\" data-activates=\"mobile\" class=\"button-collapse\"> "); 
      out.write("\n");
      out.write("        ");
    out.print("    <i class=\"mdi-navigation-menu\"></i>  "); 
      out.write("\n");
      out.write("                \n");
      out.write("        ");
    out.print("</a>"); 
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("         ");
 out.print("  <ul id=\"nav-mobile\" class=\"right hide-on-med-and-down\">  "); 
      out.write("\n");
      out.write("         ");
 out.print("           <li><a href=\"hardware.jsp\">Hardware</a></li> "); 
      out.write("\n");
      out.write("         ");
 out.print("           <li><a href=\"software.jsp\">Software</a></li> "); 
      out.write("\n");
      out.write("         ");
 out.print("           <li><a href=\"diseno.jsp\">Diseño</a></li> "); 
      out.write("\n");
      out.write("         ");
 out.print("           <li><a href=\"logout.jsp\">Cerrar Sesion</a></li> "); 
      out.write("\n");
      out.write("         ");
 out.print("           <li><a href=\"logout.jsp\">Cerrar Sesion</a></li> ");
         <% out.print("  </ul> "); 
      out.write("\n");
      out.write("         ");
 out.print(" <ul class=\"side-nav\" id=\"mobile\"> "); 
      out.write("\n");
      out.write("                    \n");
      out.write("          ");
 out.print("       <li><a href=\"hardware.jsp\">Hardware</a></li> "); 
      out.write("\n");
      out.write("          ");
 out.print("       <li><a href=\"software.jsp\">Software</a></li> "); 
      out.write("\n");
      out.write("          ");
 out.print("       <li><a href=\"diseno.jsp\">Diseño</a></li> "); 
      out.write("\n");
      out.write("          ");
 out.print("       <li><a href=\"logout.jsp\">Cerrar Sesion</a></li> "); 
      out.write("\n");
      out.write("          ");
 out.print("</ul> \n </div>  \n </nav>"); 
      out.write("         \n");
      out.write("            \n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        \n");
      out.write("            %>    \n");
      out.write("                \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("                <div style=\"min-width: 200px;\"   class=\"container\" >\n");
      out.write("                    \n");
      out.write("                    <!-- Metodo de tabla -->\n");
      out.write("                    \n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <h4>Todos los temas</h4>\n");
      out.write("                        \n");
      out.write("                        <ul class=\"collapsible \" data-collapsible=\"accordion\">\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            <!-- \n");
      out.write("                            <li>\n");
      out.write("                                <div class=\"collapsible-header\"><i class=\"mdi-file-cloud-download\"></i>Listar</div>\n");
      out.write("                                <div class=\" s12 collapsible-body\">\n");
      out.write("                                   \n");
      out.write("                                    <table  class=\"hoverable \">\n");
      out.write("                                   \n");
      out.write("                                        <th  > Titulo </th>\n");
      out.write("                                        <th  >Descripcion</th>\n");
      out.write("                                        <th>Dificultad</th>\n");
      out.write("                                        \n");
      out.write("                                    \n");
      out.write("                                     \n");
      out.write("                                        <tbody> \n");
      out.write("                                     ");
 
                
                                        DAO_tema DT = new DAO_tema();
                                      ResultSet Listado = null;
                                 
                                      Listado = DT.seleccionar_tema();
                               
                                      
   
  
                                        
      out.write("\n");
      out.write("                                           \n");
      out.write("                                                ");
/* while(Listado.next()){
                                                    out.print("<tr>");
                                                  out.print("<td style=\"text-align:left\">"+Listado.getString("detalle_tema") +"</td>");
                                            
                                                  out.print("<td style=\"text-align:justify\" >"+Listado.getString("descripcion") +"</td>");
                                            
                                                  out.print("<td  style=\"text-align:center\" >"+Listado.getString("dificultad") +"</td>");
                                                  out.print("</tr>");

                                                }
                                                DT.Cerrar_Conexion();
                      */
                                                
      out.write("\n");
      out.write("                                         </tbody>\n");
      out.write("                                   \n");
      out.write("                                    </table>\n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            \n");
      out.write("                            -->\n");
      out.write("                            <!-- <div class=\"collapsible-header\"><i class=\"mdi-file-cloud-download\"></i>Listar</div>\n");
      out.write("                             <div class=\" s12 collapsible-body\">\n");
      out.write("                            -->\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                           ");
 
                                   
                                      
                                      while(Listado.next()){
                        out.print("<li>");   
                        out.print("<div style=\" word-wrap: break-word;\" class=\"collapsible-header \"> <b  > "+ Listado.getString("detalle_tema")+ "  </b> </div>");    
                        out.print("<div class=\"s12 collapsible-body\">   ");
                        
                        out.print(" <div style=\" word-wrap: break-word;\"  class=\" col s12 m8 offset-m2\" > <h5 class=\" teal-text \">   "   + Listado.getString("detalle_tema")+ "</h5> </div>");
                        out.print("<div class=\" col s12 m2  teal-text\" >Dificultad:  <b> "   + Listado.getInt("dificultad") + " </b> </div>");
                  
                         out.print("<div style=\" word-wrap: break-word;\"   class=\"  col s12 m10 offset-m1  \" \"  >  "+ Listado.getString("descripcion")+   "  </div>");
                       out.print("<div class=\" col s12 m2  teal-text\" > <b>Autor:</b> "+Listado.getString("id_autor")+" </div>");
                         out.print("</div>");
                      
                        out.print("</li>");  
                           
                           
                           
                           
                           
                           
                                      }
                                      DT.Cerrar_Conexion();
                                     
                            
                           
      out.write("\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                               \n");
      out.write("                        </ul>\n");
      out.write("                         \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                                         \n");
      out.write("                               <!-- Boton flotante -->          \n");
      out.write("                    <div class=\"fixed-action-btn\">\n");
      out.write("                        <a href=\"newtema.jsp\" class=\"btn-floating btn-large cyan\">\n");
      out.write("                            <i class=\"mdi-content-create\"></i>\n");
      out.write("                         </a>\n");
      out.write("                         \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("       \t<script src=\"js/jquery.js\"></script>\n");
      out.write("        <script src=\"js/materialize.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("        $(\".button-collapse\").sideNav();\n");
      out.write("        </script>\n");
      out.write("    \n");
      out.write("</html>\n");
 }
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
