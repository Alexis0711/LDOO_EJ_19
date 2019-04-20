
package DAO;

import ControladorBD.JavaDBConexion;
import Usuarios.Usuario_Invitado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JavaDB_U_InvitadoDAO implements InvitadoDAO {

    @Override
    public boolean RegistrarUsuario(Usuario_Invitado invitado) {
        Connection conn=null;
        PreparedStatement pst = null;
        
        try{
            
            String consulta2 = "insert into Invitado(Nombre,Fecha_Registro)values(?,?)";
            conn=JavaDBConexion.getConexion();
            pst=conn.prepareStatement(consulta2);
            pst.setString(1,invitado.getNombre());
            pst.setString(2, invitado.getFecha_registro());
            
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
