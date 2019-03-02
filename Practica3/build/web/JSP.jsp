<%-- 
    Document   : JSP
    Created on : 27/02/2019, 12:54:47 AM
    Author     : Alexis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
         <%
             String correo = request.getParameter("correo");
             String password = request.getParameter("password");
             String usuario = request.getParameter("usuario");
             String fecha_nacimiento = request.getParameter("fecha_nacimiento");
             
                out.println("Correo Electrónico: "+ correo);
                out.println("<br>");
                out.println("Contraseña: "+ password);
                out.println("<br>");
                out.println("Usuario: "+ usuario);
                out.println("<br>");
                out.println("Fecha de Nacimiento: "+ fecha_nacimiento);
      %>
    </body>
</html>
