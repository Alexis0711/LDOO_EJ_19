<%-- 
    Document   : Index
    Created on : 6/04/2019, 02:10:41 AM
    Author     : Alexis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar Sesión</title>
        <script src="JavaScript/main.js"></script>
    </head>
    <body>
        <h1>Iniciar Sesión</h1>
        <form action="Iniciar" method="post" id="forminiciosesion">
            Usuario <input type="text" name="Usuario" id="txtUsuario"/><br><br>
            Contraseña <input type="password" name="Password" id="txtPassword"/><br><br>
            <input type="button" value="Iniciar Sesión" id="btniniciar"/>
        </form>
        <br>
        ¿No tienes una cuenta?<a href="RegistroUsuarios.jsp">Registrate</a>
    </body>
</html>
