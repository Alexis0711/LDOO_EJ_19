<%-- 
    Document   : Menu
    Created on : 15/04/2019, 11:44:51 PM
    Author     : Alexis
--%>

<%@page import="Usuarios.Usuario_Admin"%>
<%@page import="Usuarios.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
     HttpSession sesionInicioS = request.getSession(false);
     HttpSession Admin = request.getSession(false);
     
     Usuario usuario = null;
     usuario=(Usuario)Admin.getAttribute("UsuarioA");
     
    String user = (String)sesionInicioS.getAttribute("Usuario");
    
    if(user.equals("")){
        response.sendRedirect("InicioSesion.jsp");
        
    }
    if(usuario.equals("")){
        response.sendRedirect("InicioSesion.jsp");
    }
    
   
    
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menú Admin</title>
    </head>
    <body>
        <h1>Bienvenido <% out.println(user); %></h1>
        <p>User Name: <%out.println(usuario.getUsername()); %></p>
        <p>Password: <%out.println(usuario.getPassword()); %></p>
        <p>Email: <%out.println(usuario.getEmail()); %></p>
        <p>Fecha Nacimiento: <%out.println(usuario.getFecha_nacimiento()); %></p>
        <p>Tipo Usuario: <%out.println(usuario.getTipo_usuario()); %></p>
        
        <a href='CerrarSesion'>Cerrar Sesión</a>
    </body>
</html>
