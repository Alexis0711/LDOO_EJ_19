
package ControladorBD;

import java.sql.Connection;
import java.sql.DriverManager;

public class JavaDBConexion {
    static{
        try{
            Class.forName("java.sql.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    public static Connection getConexion(){
        Connection con = null;
        try{
          con  = DriverManager.getConnection("jdbc:derby://localhost:1527/Usuarios","Alexis", "12345");
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
