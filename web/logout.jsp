<%-- 
    Document   : logout
    Created on : 19-jun-2015, 15:46:04
    Author     : Migue
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Adios...</title>
    </head>
    <body>
     
        <%
           session.removeAttribute("U");
            response.sendRedirect("iniciar_sesion.jsp");
            
            
            %>
        
    </body>
</html>
