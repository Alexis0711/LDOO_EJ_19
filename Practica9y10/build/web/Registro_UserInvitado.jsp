<%-- 
    Document   : Registro_UserInvitado
    Created on : 16/04/2019, 09:33:58 PM
    Author     : Alexis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="Script/ValidarRegistro.js"></script>
        <title>Registro Usuario Invitado</title>
    </head>
    <body>
        <h1>Registro Usuario Invitado</h1>
        <form action="RegistrarUsuariosInv" method="post" id="formregistro">
            Nombre <input type="text" name="Nombre" id="Nombre"/><br><br>
            Username <input type="text" name="Usuario" id="Usuario"/><br><br>
            Contraseña <input type="password" name="Password" id="Password"/><br><br>
            Fecha Nacimiento <input type="text" name="Fecha_nacimiento" id="Fecha"/><br><br>
            Correo Electrónico <input type="text" name="Correo" id="Correo"/><br><br>
            Fecha Registro <input type="text" name="FechaR" id="FechaR"/><br><br>
            Tipo Usuario <select name="Tipo_usuario" id="Tipo_user">
                <option value="Invitado">Invitado</option>
                <option value="Admin">Admin</option>
                <option value="Normal">Normal</option>
            </select><br><br>
            <input type="button" value="Registrar" id="BtnRegistrar"/>
        </form>
    </body>
</html>
