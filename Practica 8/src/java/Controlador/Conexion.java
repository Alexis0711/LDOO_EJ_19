
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    
    private String Username="Alexis";
    private String Password="12345";
    private String url="jdbc:derby://localhost:1527/Usuarios";
    private Connection conexion;
    
    public Conexion(){
        try{
            //Class.forName(url);
            conexion=DriverManager.getConnection(url,Username,Password);
            
        }
        catch(SQLException e){
            System.out.println("ERROR"+e);
        }
    }
    
    public Connection getConexion(){
        return conexion;
    }
    
  }
