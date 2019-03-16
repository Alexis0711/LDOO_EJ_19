<%-- 
    Document   : Usuario
    Created on : 14/03/2019, 03:29:01 PM
    Author     : Alexis
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix = "form"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <h2>User Information</h2>
           <form:form method = "POST" action = "/addUser">
         <table>
            <tr>
               <td><form:label path = "nombre">Nombre</form:label></td>
               <td><form:input path = "nombre" /></td>
            </tr>
            <tr>
               <td><form:label path = "password">Password</form:label></td>
               <td><form:input path = "password" /></td>
            </tr>
            <tr>
               <td><form:label path = "correo">Correo Electrónico</form:label></td>
               <td><form:input path = "correo" /></td>
            </tr>
            <tr>
               <td><form:label path = "fecha_nacimiento">Fecha Nacimiento</form:label></td>
               <td><form:input path = "fecha_nacimiento" /></td>
            </tr>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>  
      </form:form>
        </form>
   </body>
</html>

