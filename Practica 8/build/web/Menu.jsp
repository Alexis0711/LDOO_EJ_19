<%-- 
    Document   : Menu
    Created on : 6/04/2019, 02:48:00 AM
    Author     : Alexis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    HttpSession sesion = request.getSession(false);
    String usuario = (String)sesion.getAttribute("Usuario");
    if(usuario.equals("")){
        response.sendRedirect("Index.jsp");
        
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menú</title>
    </head>
    <body>
        <h1>Bienvenido <% out.println(usuario);             %></h1>
        <a href='CerrarSesion'>Cerrar Sesión</a>
    </body>
</html>
