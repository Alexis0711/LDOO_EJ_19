<%-- 
    Document   : InicioSesion
    Created on : 15/04/2019, 11:05:17 PM
    Author     : Alexis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="Script/ValidarLogin.js"></script>
        <title>Iniciar Sesión</title>
    
    </head>
    <body>
        <h1>Iniciar Sesión</h1>
        <form action="Iniciar" method="post" id="forminiciosesion">
            Usuario <input type="text" name="Usuario" id="txtUsuario"/><br><br>
            Contraseña <input type="password" name="Password" id="txtPassword"/><br><br>
            <input type="button" value="Iniciar Sesión" id="btniniciar"/>
        </form>
        
    </body>
</html>
