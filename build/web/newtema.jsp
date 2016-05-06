<%-- 
    Document   : newhardware
    Created on : 28-jul-2015, 23:25:34
    Author     : Miguel
--%>


<%@page import="DAO.DAO_tipo"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    
String User = "";
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
        <title>Ingresar un nuevo tema.</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/materialize.min.css"/>
        
    </head>
    <body>
        
        <nav class="teal"> 
            <div class="nav-wrapper" >
                
                  <%  out.println("<a  class=\"brand-logo left\"  href=\"desarrollo.jsp\">" + User + "</a>"); %>
              
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
                  
                  
                  
                  
                  <div class="container" >
                    <div class="row">
                        <h4>Ingresar tema</h4>
                        <ul class="collapsible" data-collapsible="accordion">
                            
                            <li>
                                <div class="collapsible-header"><i class="mdi-file-cloud-download"></i>Ingresar un nuevo tema.</div>
                                <div class="collapsible-body">
                                    
                  <form action="ingresar_tema" method="POST"  > 
                    <div class="col s12  m10 offset-m1">
                        <div class="card Medium teal-text">
                         
                                   <span  class="card-title black-text">Datos del tema</span>
                           
                            <div class="card-content">
                                
                             
                                <div class="row">
                                     <div class="input-field col 10 m8">
                                       
                                         <input  length="100" id="titulo" name="titulo" type="text" class="validate" required/>
                                         
                                     <label for="titulo">Título</label>
                                 </div>
                                    
                                     <div class="input-field col s2 m4">
                                      
                                         <input  id="autor" name="autor" type="checkbox" />
                                            <label for="autor">Anonimo</label>
                             
                                   
                                     
                                     
                                     
                                 </div>
                                    
                                                
                                      <div class="input-field col s12">
                                         
                                        
                                       
                                          
                                          <p> <label> Descripcion </label> </p>
                                          <textarea required length="1000" id="descripcion" name="descripcion" type="text" class="validate materialize-textarea mooeditable-textarea" required/> </textarea>
                                     
                                      
                                      
                                  
                                      
                                      
                                      
                                    
                                 </div>
                                  
                                      <div class="input-field col s12 m6">
                                          <p>
                                           <label>  Categoría</label>
                                          </p>
                                          <br>
                                            <br>
                                          <select required id="tipo" name="tipo" class="browser-default" >
                                              <option value="" disable selected=""> Seleccione</option>
                                              <%  ResultSet Tipo = null;
                                                  
                                              DAO_tipo DT = new DAO_tipo();
                                              
                                             Tipo = DT.Listar_Tipo();
                                             
                                             while(Tipo.next()){
                                             
                                            %>
                                             
                                            <option  value="<%=Tipo.getInt("id_tipo")%>"> <%=Tipo.getString("detalle_tipo")%>    </option>
                                            
                                            
                                          <%  
                                             }
                                              DT.Cerrar_Conexion();
                                              
                                              %>
                                              
                                              
                                            
                                             
                                          </select>
                                         
                                          
                                     </div>
                                    <div class="input-field col s12 m6">
                                        <p class="range-field">
                                            <label>Dificultad </label>
                                            <br>
                                            <br>
                                            <input  id="dificultad" name="dificultad" type="range" min="0" max="10" class="validate" required/>
                                        </p>
                                 </div>
                                    
                                </div>
                            </div>
                            <div class="center-btn">
                                
                            
                            <div class="card-action center s6  m4   ">
                                <button class="btn waves-effect waves-light teal"  type="submit" name="action">Ingresar
                                    <i class="mdi-hardware-keyboard-arrow-right right"></i>
                                </button>
                             
                               </div>
                            </div>
                        </div>
                        
                    </div>
                    <% out.print("<input value=\""+session.getAttribute("U")+"\" name=\"id_autor\"  id=\"id_autor\" type=\"text\"  hidden=\"\">");   %>
                    </form>
                                        
                                    
                                    
                                    
                                </div>
                            </li>
                   
                           
                            
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
        <script src="tinymce/tinymce.min.js"></script>
<script type="text/javascript">
tinymce.init({
    selector: "textarea",
    theme: "modern",
    plugins: [
        "advlist autolink lists link image charmap print preview hr anchor pagebreak",
        "searchreplace wordcount code fullscreen",
        "insertdatetime media nonbreaking save   directionality",
        "emoticons template paste textcolor colorpicker textpattern "
    ],
    toolbar1: " print preview |  undo redo | styleselect | bold italic forecolor backcolor  | alignleft aligncenter alignright alignjustify | link image" ,
 
    
    templates: [
        {title: 'Test template 1', content: 'Test 1'},
        {title: 'Test template 2', content: 'Test 2'}
    ]
});
</script>
        <script>
        $(".button-collapse").sideNav();
        
      
         $('select').material_select();
            
     
        </script>
    </body>
</html>
 <%               
 }
            %>