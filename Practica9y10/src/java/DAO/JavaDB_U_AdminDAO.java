
package DAO;

import ControladorBD.JavaDBConexion;
import Usuarios.Usuario_Admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JavaDB_U_AdminDAO implements AdminDAO {

    @Override
    public boolean RegistrarUsuario(Usuario_Admin admin) {
        Connection conn = null;
        PreparedStatement pst=null;
      
        try{
            
            String consulta2 = "insert into Admin(Num_Empleado)values(?)";
            conn =JavaDBConexion.getConexion();
            pst=conn.prepareStatement(consulta2);
            pst.setInt(1,admin.getNum_empleado());

            
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
