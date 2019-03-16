<%-- 
    Document   : Mostrar
    Created on : 14/03/2019, 03:30:46 PM
    Author     : Alexis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix = "form"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>Spring MVC Form Handling</title>
    </head>
    <body>

      <h2>Submitted User Information</h2>
     <table>
         <tr>
            <td>Nombre</td>
            <td>${nombre}</td>
         </tr>
         <tr>
            <td>Password</td>
            <td>${password}</td>
         </tr>
         <tr>
            <td>Correo Electrónico</td>
            <td>${correo}</td>
         </tr>
         <tr>
            <td>Fecha Nacimiento</td>
            <td>${fecha_nacimiento}</td>
         </tr>
      </table>  
   </body>
</html>

