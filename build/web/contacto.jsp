<%-- 
    Document   : contacto
    Created on : 17-jun-2015, 22:57:21
    Author     : Migue
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
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
                     <li><a href="iniciar_sesion.jsp">Iniciar Sesion</a></li>
                     <li><a href="contacto.jsp">Contacto</a></li>
     
                  </ul>
                <ul class="side-nav" id="mobile">
                    
                     <li><a href="iniciar_sesion.jsp">Iniciar Sesion</a></li>
                     <li><a href="contacto.jsp">Contacto</a></li>
     
                    
                </ul>
            </div>
        
        
        </nav>
            
            
            <div class="container">
                <div class="row">
                    <form action="mail" method="POST" class=" offset-m3 col s12 m6">
                        <div class="card white"> 
                        <div class="card-content  ">
                            <span class="card-title cyan-text ">Enviar correo electronico</span>
                            
                            <div class="row">
                                <div class="col s6 m6">
                                    <input placeholder="Nombre" id="nombre" name="nombre" type="text" class="validate" required="">
                                    <label for="nombre">Nombre</label> 
                                </div>
                                <div class="col s6 m6">
                                    <input placeholder="E-Mail" id="mail" name="mail" type="text" class="validate" required="">
                                    <label for="mail">E-Mail</label> 
                                </div>
                                  <div class="col s12 m12 ">
                                      <input placeholder="Asunto" id="asunto" name="asunto" type="text" class="validate" required="">
                                    <label for="asunto">Asunto</label> 
                                </div>
                                 <div class="input-field col s12">
                                     <textarea id="textarea1" name="mensaje" class="materialize-textarea" required=""></textarea>
                                  <label for="textarea1">Mensaje</label>
                              </div>
                                
                            </div>
                            
                            
                            
                        </div>
                        <div class="card-action right s6 m4">
                            <button class="btn waves-effect waves-light cyan"  type="submit" name="action">Enviar
                                <i class="mdi-content-send"></i>
                                
                            </button>
                            
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
    </body>
</html>