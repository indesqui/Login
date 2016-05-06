<%-- 
    Document   : iniciar_sesion
    Created on : 17-jun-2015, 21:33:35
    Author     : Migue
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<%
    String U,P,Cadena;
 
   if(session.getAttribute("U") == null ||session.getAttribute("P") == null){
     
    Cadena= "<li> <a href=\"registrar.jsp\">Regístrese</a> </li>";
     
   }else{
   
       Cadena = " <li> <a href=\"desarrollo.jsp\">Desarrollo</a> </li>";
   
   }
   
   %>
   




<html>
    <head>
        <title>Iniciar Sesion</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/materialize.min.css"/>
    </head>
        <body>
        
            <nav class="black"> 
            <div class="nav-wrapper" >
                
                <a href="index.jsp" class="brand-logo center">Miguel<b>Muñoz</b></a>
                <a href="#" data-activates="mobile" class="button-collapse"> 
                    <i class="mdi-navigation-menu"></i>
                
                </a>
                
                
                
                <ul id="nav-mobile" class="right hide-on-med-and-down">
                    <li><a href="contacto.jsp">Contacto</a></li>
                    <%out.print(Cadena);
                            
                    
                    %>
                    
                     
     
                  </ul>
                <ul class="side-nav" id="mobile">
                     <li><a href="contacto.jsp">Contacto</a></li>
                       <%out.print(Cadena); %>
                   
                    
     
                    
                </ul>
            </div>
        
      
        </nav>
            
            
            <div class="container">
                <div class="row">
                    <form action="login" method="POST"  onsubmit="return Valida()"> 
                    <div class="col s12 m6 offset-m3">
                        <div class="card Medium white">
                            <div class="card-image">
                                <img src="images/small-log.jpg" alt="">
                                   <span class="card-title">Iniciar Sesion</span>
                            </div>
                            <div class="card-content">
                                
                             
                                <div class="row">
                                     <div class="input-field col s12 m6">
                                         <i class=" orange600 small mdi-action-account-circle prefix"></i>
                                         <input id="email" name="email" type="email" class="validate" required/>
                                     <label for="email">E-mail</label>
                                 </div>
                                      <div class="input-field col s12 m6">
                                          <i class="  small mdi-communication-vpn-key prefix"></i>
                                          <input id="pass" name="pass" type="password" class="validate" required/>
                                      <label for="pass">Contraseña</label>
                                 </div>
                                </div>
                            </div>
                            <div class="center-btn">
                                
                            
                            <div class="card-action center s6  m4   ">
                                <button class="btn waves-effect waves-light cyan"  type="submit" name="action">Ingresar
                                    <i class="mdi-hardware-keyboard-arrow-right right"></i>
                                </button>
                             
                               </div>
                            </div>
                        </div>
                        
                    </div>
                    
                    </form>
                </div>
            </div>
            
            
            
        
        
        
       	<script src="js/jquery.js"></script>
        <script src="js/materialize.min.js"></script>
        <script>
        $(".button-collapse").sideNav();
        </script>
        
        <script> 
            function Valida(){
                
                var u = document.getElementById("email");
                var p = document.getElementById("pass");
                
                if(u == "" || p == ""){
                    document.getElementByID("email").focus();
                    
                }
                
                
                
                if(u.legth>=3 ){
                    
                    alert("Error al iniciar sesion"){}
                    document.getElementById("email").focus();
                    return false;
                    
                }else{
                    
                    
                    return true;
                }
                
                
                
                
            }
            
            
            
            </script>
            
    </body>
</html>
