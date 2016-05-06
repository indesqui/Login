<%-- 
    Document   : index
    Created on : 03-jul-2015, 23:31:02
    Author     : Migue
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Miguel Muñoz Librerias</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/materialize.min.css"/>
    </head>
    <body>
        <div class="navbar-fixed"> 
            <nav class="black" style="opacity:0.8"> 
            <div class="nav-wrapper " >
                
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
         </div>
     
      
       <!-- 
          <div class="row">
            <div class="col s12"> 
              
                <div class="slider " >
                 <ul class="slides">
                     
                     <li> <img src="images/diseno.jpg" >
                         <div class="caption center-align">
                             <h3>Diseño</h3>
                             <h5>Lo mejor en Fotografia y diseño</h5>
                         </div>
                     </li>
                     <li> <img src="images/software.png" alt="">
                         <div class="caption right-align">
                             <h3>Software</h3>
                             <h5>Programacion al limite</h5>
                             
                         </div>
                     </li>
                     
                 </ul> 
                 
            </div>  
                
             
              
          
          </div>
         
          </div>
         -->
         <div class="parallax-container" style="height:600px;transform: translate3d(0px, -60px, 0px)" >
            <div class="parallax">
                <img src="images/dis.jpg" alt="">
              
            </div>
        </div>
         
         <div class="container " >
                     <div class="row">
                         
                             <div class="card small col offset-m3 s12 m6 ">
                             <div class="card-image waves-effect waves-block waves-light ">
                                 <img class="activator" src="images/small-log.jpg">
                             </div>
                          <div class="card-content">
                             <span class="card-title activator blue-text text-darken-2">Diseño</span>
                           
                         </div>
                         <div class="card-reveal">
                              <span class="card-title grey-text text-darken-4">El diseño está en todas partes</span>
                            <p align="justify" >Creamos todo tipo de diseño y merchandising para tu empresa.
                            <p>  -Tarjetas de presentacion</p>
                           <p> -Entradas </p>
                           <p> -Flyer </p>
                           <p> -Documentos tributarios,etc.</p>
                      
                            </p>
                         </div>
                         </div>
                         
                     </div>
         </div>
           <div class="parallax-container" style="height:550px">
            <div class="parallax">
                <img src="images/sw.jpg" alt="">
               
            </div>
        </div>

           <div class="container " >
                     <div class="row">
                         
                             <div class="card small col offset-m3 s12 m6 ">
                             <div class="card-image waves-effect waves-block waves-light">
                                 <img class="activator" src="images/dis.jpg">
                             </div>
                          <div class="card-content">
                             <span class="card-title activator grey-text text-darken-4 ">Programación</span>
                           
                         </div>
                         <div class="card-reveal">
                              <span class="card-title grey-text text-darken-4">Implementa lo inesperado</span>
                            <p align="justify" >   Desarrollamos todo tipo de proyectos multiplataforma y responsivos.  </p>
                      
                      
                         
                         </div>
                         </div>
                         
                     </div>
         </div>
         
         
         <div class="footer">
             
             sadfjasildj
         </div>
         
         
         
         
         
        
       	<script src="js/jquery.js"></script>
        <script src="js/materialize.min.js"></script>
        <script>
        $(".button-collapse").sideNav();
   
        </script>
        <script>
          $(document).ready(function(){
      $('.slider').slider();
      $('.parallax').parallax();
    });
    
             
        </script>
        
        
        
        
    </body>
    
    
 
</html>
