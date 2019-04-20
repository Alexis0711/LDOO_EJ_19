
package DAO;

import ControladorBD.JavaDBConexion;
import Usuarios.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JavaDBUsuariosDAO implements UsuarioDAO {

    @Override
    public boolean RegistrarUsuario(Usuario usuario) {
        
        Connection conn = null;
        PreparedStatement pst=null;
      
        try{
            
            String consulta2 = "insert into Usuarios(Nombre,Password,Fecha_nacimiento,Correo_electronico,Tipo_Usuario)values(?,?,?,?,?)";
            conn =JavaDBConexion.getConexion();
            pst=conn.prepareStatement(consulta2);
            pst.setString(1,usuario.getUsername());
            pst.setString(2,usuario.getPassword());
            pst.setString(3,usuario.getFecha_nacimiento());
            pst.setString(4,usuario.getEmail());
            pst.setString(5,usuario.getTipo_usuario());
            
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
        
    @Override
    public boolean Autenticacion(Usuario usuario) {
        Connection conn = null;
        PreparedStatement pst=null;
        ResultSet rs=null;
        
        try{
            String consulta="select * from Usuarios where NOMBRE= ? and PASSWORD = ?";
            conn =JavaDBConexion.getConexion();
            pst=conn.prepareStatement(consulta);
            pst.setString(1,usuario.getUsername());
            pst.setString(2,usuario.getPassword());
            
            
            rs=pst.executeQuery();
            
            if(rs.next()){
                return true;
                
                }
        } catch(SQLException e){
            System.out.println("Error" +e);
            
        }finally {
            
           try{
               
                if(conn!=null) conn.close();
                if(pst != null) pst.close();
                if(rs != null) rs.close();
            
           }catch(SQLException e){
               
              System.out.println("Error" +e);
           }
               
        }
       return false;
    }
        
    @Override
     public Usuario ObtenerUsuario(Usuario usuario){
           
        Usuario usuarios= new Usuario();
        Connection conn = null;
        PreparedStatement pst=null;
        ResultSet rs = null;
        
        try{
            conn =JavaDBConexion.getConexion();
            String sql= "select * from Usuarios where NOMBRE= ? and PASSWORD = ?";
            pst=conn.prepareStatement(sql);
            pst.setString(1,usuario.getUsername());
            pst.setString(2,usuario.getPassword());
            
            rs=pst.executeQuery();
            
            Usuario user = null;
            
            while(rs.next()){
                
                user= new Usuario();
                user.setUsername(rs.getString("NOMBRE"));
                user.setPassword(rs.getString("PASSWORD"));
                user.setFecha_nacimiento(rs.getString("FECHA_NACIMIENTO"));
                user.setEmail(rs.getString("CORREO_ELECTRONICO"));
                user.setTipo_usuario(rs.getString("TIPO_USUARIO"));
                usuarios=user;
                
                
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            
            try{
                
            if(rs != null)rs.close();
            if(pst != null)pst.close();
            if(conn != null) conn.close();
            
                }catch(SQLException e){
                    e.printStackTrace();
                }
        }
        return usuarios;
     }
    
}
