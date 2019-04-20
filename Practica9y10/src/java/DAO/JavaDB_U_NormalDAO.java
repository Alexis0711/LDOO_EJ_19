
package DAO;

import ControladorBD.JavaDBConexion;
import Usuarios.Usuario_Normal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class JavaDB_U_NormalDAO implements NormalDAO {

    @Override
    public boolean RegistrarUsuario(Usuario_Normal normal) {
        Connection conn = null;
        PreparedStatement pst = null;
       
        try{
            
            String consulta2 = "insert into Normal(Nombre,Domicilio)values(?,?)";
            conn =JavaDBConexion.getConexion();
            pst=conn.prepareStatement(consulta2);
            pst.setString(1,normal.getNombre());
            pst.setString(2, normal.getDomicilio());
            
           if(pst.executeUpdate()==1){
                return true;
            }
        }catch(SQLException e){
            System.out.println("Error"+e);
        }finally{
            
            try{
                
            if(conn!=null) conn.close();
            if(pst != null) pst.close();
            
            }
            catch(SQLException e){
                System.out.println("Error"+e);
            }
            
        }
        return false;
    }
    
    }
    

