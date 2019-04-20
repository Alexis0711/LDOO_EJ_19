<%-- 
    Document   : Registro_UserNormal
    Created on : 16/04/2019, 09:33:42 PM
    Author     : Alexis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="Script/ValidarRegistro.js"></script>
        <title>Registro Usuario Normal</title>
    </head>
    <body>
        <h1>Registro Usuario Normal</h1>
        <form action="RegistrarUsuariosN" method="post" id="formregistro">
            Nombre <input type="text" name="Nombre" id="Nombre"/><br><br>
            Username <input type="text" name="Usuario" id="Usuario"/><br><br>
            Contraseña <input type="password" name="Password" id="Password"/><br><br>
            Fecha Nacimiento <input type="text" name="Fecha_nacimiento" id="Fecha"/><br><br>
            Correo Electrónico <input type="text" name="Correo" id="Correo"/><br><br>
            Domicilio <input type="text" name="Domicilio" id="Domicilio"/><br><br>
            Tipo Usuario <select name="Tipo_usuario" id="Tipo_user">
                <option value="Normal">Normal</option>
                <option value="Admin">Admin</option>
                <option value="Invitado">Invitado</option>
            </select><br><br>
            <input type="button" value="Registrar" id="BtnRegistrar"/>
        </form>
    </body>
</html>
