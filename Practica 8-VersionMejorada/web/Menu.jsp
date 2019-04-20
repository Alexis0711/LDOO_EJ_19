<%-- 
    Document   : Menu
    Created on : 6/04/2019, 02:48:00 AM
    Author     : Alexis
--%>

<%@page import="Controlador.Usuarios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    HttpSession sesion = request.getSession(false);
    
    Usuarios usuarios = (Usuarios)sesion.getAttribute("Usuario");
    
    if(usuarios.equals("")){
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
        <h1>Bienvenido <% out.println(usuarios.getNombre());             %></h1>
        <p>User Name: <%out.println(usuarios.getNombre()); %></p>
        <p>Password: <%out.println(usuarios.getPassword()); %></p>
        <p>Email: <%out.println(usuarios.getCorreo()); %></p>
        <p>Fecha Nacimiento: <%out.println(usuarios.getFecha_nacimiento()); %></p>
        
        <a href='CerrarSesion'>Cerrar Sesión</a>
    </body>
</html>
