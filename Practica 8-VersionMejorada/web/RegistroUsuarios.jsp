<%-- 
    Document   : RegistroUsuarios
    Created on : 6/04/2019, 02:22:38 AM
    Author     : Alexis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Usuarios</title>
    </head>
    <body>
        <h1>Registro Usuarios</h1>
        <form action="Registrar" method="post">
            Nombre <input type="text" name="Usuario"/><br><br>
            Contraseña <input type="password" name="Password"/><br><br>
            Fecha Nacimiento <input type="text" name="Fecha_nacimiento"/><br><br>
            Correo Electrónico <input type="text" name="Correo"/><br><br>
            <input type="submit" value="Registrar"/>
        </form>
    </body>
</html>
