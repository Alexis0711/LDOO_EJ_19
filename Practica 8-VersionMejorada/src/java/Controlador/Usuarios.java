/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Usuarios extends Conexion {
    private String Nombre;
    private String Password;
    private String Fecha_nacimiento;
    private String Correo;

    public Usuarios(String Nombre, String Password, String Fecha_nacimiento, String Correo) {
        this.Nombre = Nombre;
        this.Password = Password;
        this.Fecha_nacimiento = Fecha_nacimiento;
        this.Correo = Correo;
    }

    public Usuarios(String Nombre, String Password) {
        this.Nombre = Nombre;
        this.Password = Password;
    }

   public Usuarios(){
       
   }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    public void setFecha_nacimiento(String Fecha_nacimiento) {
        this.Fecha_nacimiento = Fecha_nacimiento;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    
    public boolean autenticacion(String Nombre, String Password){
        PreparedStatement pst=null;
        ResultSet rs=null;
        
        try{
            String consulta="select * from Usuarios where NOMBRE= ? and PASSWORD = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1,Nombre);
            pst.setString(2, Password);
            
            rs=pst.executeQuery();
            
            if(rs.next()){
                return true;
            }
        } catch(SQLException e){
            System.out.println("Error" +e);
            
        }finally {
            
           try{
               
                if(getConexion()!=null) getConexion().close();
                if(pst != null) pst.close();
                if(rs != null) rs.close();
            
           }catch(SQLException e){
               
              System.out.println("Error" +e);
           }
               
        }
        return false;
    }
    
    public boolean Registrar(){
        
        PreparedStatement pst = null;
        ResultSet rs=null;
        
        try{
            
            String consulta2 = "insert into Usuarios(Nombre,Password,Fecha_nacimiento,Correo_electronico)values(?,?,?,?)";
            
            pst=getConexion().prepareStatement(consulta2);
            pst.setString(1,getNombre());
            pst.setString(2,getPassword());
            pst.setString(3,getFecha_nacimiento());
            pst.setString(4,getCorreo());
            
            if(pst.executeUpdate()==1){
                return true;
            }
        }catch(SQLException e){
            System.out.println("Error"+e);
        }finally{
            
            try{
                
            if(getConexion()!=null) getConexion().close();
            if(pst != null) pst.close();
            
            }
            catch(SQLException e){
                System.out.println("Error"+e);
            }
            
        }
        return false;
    }
    public Usuarios ObtenerUsuario(Usuarios usuario){
           
        Usuarios usuarios= new Usuarios();
        PreparedStatement pst=null;
        ResultSet rs = null;
        
        try{
           
            String sql= "select * from Usuarios where NOMBRE= ? and PASSWORD = ?";
            pst=getConexion().prepareStatement(sql);
            pst.setString(1,usuario.getNombre());
            pst.setString(2,usuario.getPassword());
            
            rs=pst.executeQuery();
            
            Usuarios user = null;
            
            while(rs.next()){
                
                user= new Usuarios();
                user.setNombre(rs.getString("NOMBRE"));
                user.setPassword(rs.getString("PASSWORD"));
                user.setFecha_nacimiento(rs.getString("FECHA_NACIMIENTO"));
                user.setCorreo(rs.getString("CORREO_ELECTRONICO"));
                usuarios=user;
                
                
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            
            try{
                
            if(rs != null)rs.close();
            if(pst != null)pst.close();
            if(getConexion() != null) getConexion().close();
            
                }catch(SQLException e){
                    e.printStackTrace();
                }
        }
        return usuarios;
     }
}
