<%-- 
    Document   : MenuUserInv
    Created on : 19/04/2019, 08:12:21 PM
    Author     : Alexis
--%>

<%@page import="Usuarios.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
     HttpSession sesionInicioS = request.getSession(false);
     HttpSession Invitado = request.getSession(false);
     
     Usuario usuario = null;
     usuario=(Usuario)Invitado.getAttribute("UsuarioIn");
     
     String user = (String)sesionInicioS.getAttribute("Us-Inv");
     
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
        <title>Menú Usuario Invitado</title>
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
