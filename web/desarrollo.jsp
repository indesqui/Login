
<%@page import="DAO.DAO_usuario"%>
<%@page import="DAO.DAO_tipo"%>
<%@page import="clases.temas"%>
<%@page import="java.sql.SQLException"%>
<%@page import="DAO.DAO_tema"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    String U,P,User;
 
   
    
    
   if(session.getAttribute("U") == null ||session.getAttribute("P") == null){
     out.print("Sesion invalida");
     out.println("<br> <a href=\"iniciar_sesion.jsp\">Volver a intentar</a>");
     
   }else
     {
        
             User=session.getAttribute("U").toString();
             User = User.substring(0, 10) +"..."; 
  
      
        

    
    
%>

<html>
    <head>
        <title>Desarrollo</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/materialize.min.css"/>
    </head>
    
        <% 
        
       
        
        
        %>
        <!-- Menu normal -->
        
        <%    out.println(" <nav class=\"teal\">  ");%>
        <%    out.println("    <div class=\"nav-wrapper\"> "); %>
        <%    out.println("<a  class=\"brand-logo left\"  href=\"desarrollo.jsp\">" + User+ "</a>"); %>
  
         
        <%    out.println("  <a href=\"#\" data-activates=\"mobile\" class=\"button-collapse\"> "); %>
        <%    out.print("    <i class=\"mdi-navigation-menu\"></i>  "); %>
                
        <%    out.print("</a>"); %>
                
                
                
         <% out.print("  <ul id=\"nav-mobile\" class=\"right hide-on-med-and-down\">  "); %>
         <% out.print("           <li><a href=\"hardware.jsp\">Hardware</a></li> "); %>
         <% out.print("           <li><a href=\"software.jsp\">Software</a></li> "); %>
         <% out.print("           <li><a href=\"diseno.jsp\">Diseño</a></li> "); %>
         <% out.print("           <li><a href=\"logout.jsp\">Cerrar Sesion</a></li> "); %>
         <% out.print("  </ul> "); %>
         <% out.print("      <ul class=\"side-nav\" id=\"mobile\"> "); %>
                    
          <% out.print("       <li><a href=\"hardware.jsp\">Hardware</a></li> "); %>
          <% out.print("       <li><a href=\"software.jsp\">Software</a></li> "); %>
          <% out.print("       <li><a href=\"diseno.jsp\">Diseño</a></li> "); %>
          <% out.print("       <li><a href=\"logout.jsp\">Cerrar Sesion</a></li> "); %>
          <% out.print("</ul> \n </div>  \n </nav>"); %>         
            
        <!-- Fin menu normal -->
        
        
              
       
          
          <!-- Menu admin -->

        <%    out.print(" <nav class=\"teal\">  ");%>
        <%    out.print("    <div class=\"nav-wrapper\"> "); %>
        <%    out.print("<a  class=\"brand-logo left\"  href=\"desarrollo.jsp\">" + User+ "</a>"); %>
  
         
        <%    out.print("  <a href=\"#\" data-activates=\"mobile\" class=\"button-collapse\"> "); %>
        <%    out.print("    <i class=\"mdi-navigation-menu\"></i>  "); %>
                
        <%    out.print("</a>"); %>
                
                
                
         <% out.print("  <ul id=\"nav-mobile\" class=\"right hide-on-med-and-down\">  "); %>
         <% out.print("           <li><a href=\"admin.jsp\">Administrar</a></li> "); %>
         <% out.print("           <li><a href=\"hardware.jsp\">Hardware</a></li> "); %>
         <% out.print("           <li><a href=\"software.jsp\">Software</a></li> "); %>
         <% out.print("           <li><a href=\"diseno.jsp\">Diseño</a></li> "); %>
         <% out.print("           <li><a href=\"logout.jsp\">Cerrar Sesion</a></li> "); %>
        
         <% out.print("  </ul> "); %>
         <% out.print(" <ul class=\"side-nav\" id=\"mobile\"> "); %>
          <% out.print("           <li><a href=\"admin.jsp\">Administrar</a></li> "); %>         
          <% out.print("       <li><a href=\"hardware.jsp\">Hardware</a></li> "); %>
          <% out.print("       <li><a href=\"software.jsp\">Software</a></li> "); %>
          <% out.print("       <li><a href=\"diseno.jsp\">Diseño</a></li> "); %>
          <% out.print("       <li><a href=\"logout.jsp\">Cerrar Sesion</a></li> "); %>
          <% out.print("</ul> \n </div>  \n </nav>"); %>         
            
            <!-- Fin  menu admin -->

           
                
            
            
            
            
            
            
            
            
            
                <div style="min-width: 200px;"   class="container" >
                    
                    <!-- Metodo de tabla -->
                    
                    <div class="row">
                        
                        
                        <h4>Todos los temas</h4>
                        
                        <ul class="collapsible " data-collapsible="accordion">
                            
                            
                            <!-- 
                            <li>
                                <div class="collapsible-header"><i class="mdi-file-cloud-download"></i>Listar</div>
                                <div class=" s12 collapsible-body">
                                   
                                    <table  class="hoverable ">
                                   
                                        <th  > Titulo </th>
                                        <th  >Descripcion</th>
                                        <th>Dificultad</th>
                                        
                                    
                                     
                                        <tbody> 
                                     <% 
                
                                        DAO_tema DT = new DAO_tema();
                                      ResultSet Listado = null;
                                 
                                      Listado = DT.seleccionar_tema();
                               
                                      
   
  
                                        %>
                                           
                                                <%/* while(Listado.next()){
                                                    out.print("<tr>");
                                                  out.print("<td style=\"text-align:left\">"+Listado.getString("detalle_tema") +"</td>");
                                            
                                                  out.print("<td style=\"text-align:justify\" >"+Listado.getString("descripcion") +"</td>");
                                            
                                                  out.print("<td  style=\"text-align:center\" >"+Listado.getString("dificultad") +"</td>");
                                                  out.print("</tr>");

                                                }
                                                DT.Cerrar_Conexion();
                      */
                                                %>
                                         </tbody>
                                   
                                    </table>
                                    
                                </div>
                            </li>
                            
                            -->
                            <!-- <div class="collapsible-header"><i class="mdi-file-cloud-download"></i>Listar</div>
                             <div class=" s12 collapsible-body">
                            -->
                            
                            
                           <% 
                                   
                                      
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
                                     
                            
                           %>
                            
                            
                            
                               
                        </ul>
                         
                    </div>
                    
                                         
                               <!-- Boton flotante -->          
                    <div class="fixed-action-btn">
                        <a href="newtema.jsp" class="btn-floating btn-large cyan">
                            <i class="mdi-content-create"></i>
                         </a>
                         
                    </div>
                    
                     
                </div>
                
                
                
            
        
        
        
       	<script src="js/jquery.js"></script>
        <script src="js/materialize.min.js"></script>
        <script>
        $(".button-collapse").sideNav();
        </script>
    
</html>
<% }%>
