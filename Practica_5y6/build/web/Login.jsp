<%-- 
    Document   : Login
    Created on : 23/03/2019, 09:15:15 PM
    Author     : Alexis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio de Sesión</title>
    </head>
    <body>
        <h1>Login</h1>
        
        <form action="ValidarUsuario" method="POST">
            <label>User <input type="text" name="user" id="user"></label>
            <br><br>
            <label>Password <input type="text" name="password" id="password"></label>
            <br><br>
            <input type="submit" name="entrar" id="entrar" value="Entrar">
        </form>
    </body>
</html>

