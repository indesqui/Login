<%-- 
    Document   : registrar
    Created on : 22-jun-2015, 17:57:26
    Author     : Migue
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>



<html>
    <head>
        <title>Registrarse</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/materialize.min.css"/>
    </head>
        <body >
        
            <nav class="black"> 
            <div class="nav-wrapper" >
                
                <a href="index.jsp" class="brand-logo center">Miguel<b>Muñoz</b></a>
                <a href="#" data-activates="mobile" class="button-collapse"> 
                    <i class="mdi-navigation-menu"></i>
                
                </a>
                
                
                
                <ul id="nav-mobile" class="right hide-on-med-and-down">
                    <li><a href="contacto.jsp">Contacto</a></li>
                       <li><a href="iniciar_sesion.jsp">Iniciar Sesion</a></li>
                    
                     
     
                  </ul>
                <ul class="side-nav" id="mobile">
                     <li><a href="contacto.jsp">Contacto</a></li>
                        <li><a href="iniciar_sesion.jsp">Iniciar Sesion</a></li>  
                   
                    
     
                    
                </ul>
            </div>
        
      
        </nav>
            
            <br>
            <div class="container">
                <div class="row">
                    <form  name="form" onsubmit="return Valida()" action="registrar" method="POST"> 
                    <div class="col s12 m8 offset-m2">
                        <div class="card Medium white">
                           
                             
                                   <span class="card-title cyan-text "> Registrar</span>
                            
                            <div class="card-content">
                                
                             
                                <div class="row">
                                     <div class="input-field col s12 m6">
                                         <i class="small mdi-action-account-circle prefix "></i>
                                         <input id="email" name="email" type="email" class="validate" required/>
                                     <label for="email">E-mail</label>
                                 </div>
                                    
                                    
                                     <div class="input-field col s12 m6">
                                         <i class="small mdi-image-portrait prefix "></i>
                                         <input id="usuario" name="usuario" type="text" class="validate" required/>
                                     <label for="usuario">Usuario</label>
                                 </div>
                                    
                                      <div class="input-field col s12 m6">
                                          <i class="small mdi-communication-vpn-key prefix"></i>
                                          <input id="pass" name="pass" type="password" class="validate" required/>
                                      <label for="pass">Contraseña</label>
                                 </div>
                                      <div class="input-field col s12 m6">
                                          <i class="small mdi-communication-vpn-key prefix"></i>
                                          <input id="pas" name="pas" type="password" class="validate" required/>
                                      <label for="pas">Repetir Contraseña</label>
                                 </div>
                                 
                                   <div class="input-field col s12 m6">
                                       <span class="card-title cyan-text">Seleccione</span>
                                       <br>
                                       <input name="sexo" type="radio" id="Hom" value="Hombre" />
                                             <label for="Hom">Hombre</label>
                                             
                                             <input name="sexo" type="radio" id="Muj" value="Mujer" />
                                             <label for="Muj">Mujer</label>
                                        
                                </div>
                            </div>
                            <div class="center-btn">
                                
                            
                            <div class="card-action right s6  m4   ">
                                <button class="btn waves-effect waves-light cyan"  type="submit"  name="action">Ingresar
                                    <i class="mdi-hardware-keyboard-arrow-right right"></i>
                                </button>
                             
                               </div>
                                
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
            function Valida(){
               var contrasena1 = document.getElementById("pass").value;
               var contrasena2 = document.getElementById("pas").value;
               
              if (contrasena1 != contrasena2) {
                alert("Contraseñas no coinciden");
                document.getElementById("pass").focus();
                return false;
                } else {
             
                return true; 
                }
                
                
            }
            
        </script>
        
        
        <script>
        $(".button-collapse").sideNav();
        </script>
        
      
    </body>
</html>
