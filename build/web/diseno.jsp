<%@page import="java.sql.ResultSet"%>
<%@page import="DAO.DAO_tema"%>
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
        <title>Desarrollo | Diseño</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/materialize.min.css"/>
    </head>
    <body>
        
        <nav class="teal"> 
            <div class="nav-wrapper" >
                <%  out.println("<a  class=\"brand-logo left\"  href=\"desarrollo.jsp\">" + User+ "</a>"); %>
  
         
                <a href="#" data-activates="mobile" class="button-collapse"> 
                    <i class="mdi-navigation-menu"></i>
                
                </a>
                
               
                
                <ul id="nav-mobile" class="right hide-on-med-and-down">
                    <li><a href="hardware.jsp">Hardware</a></li>
                     <li><a href="software.jsp">Software</a></li>
                      <li><a href="diseno.jsp">Diseño</a></li>
                      <li><a href="logout.jsp">Cerrar Sesion</a></li>
                  </ul>
                <ul class="side-nav" id="mobile">
                    
                       <li><a href="hardware.jsp">Hardware</a></li>
                     <li><a href="software.jsp">Software</a></li>
                     <li><a href="diseno.jsp">Diseño</a></li>
                     <li><a href="logout.jsp">Cerrar Sesion</a></li>
                    
                </ul>
            </div>
        
        
        </nav>
                
                
                <div style="min-width: 200px;"   class="container" >
                    
                    <!-- Metodo de tabla -->
                    
                    <div class="row">
                        
                        
                        <h4>Temas sobre diseño.</h4>
                        
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
                                 
                                      Listado = DT.Solo_diseno();
                               
                                      
   
  
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
                        out.print("<div style=\" word-wrap: break-word;\" class=\"collapsible-header \"> <b> "+ Listado.getString("detalle_tema")+" </b> </div>"      );    
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
    </body>
</html>
<% }%>