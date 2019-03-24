/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexis
 */
public class Usuarios {
    private String Correo_electronico;
    private String Password;
    private String Nombre;
    private String Fecha_nacimiento;

    public Usuarios( String Nombre,String Password) {
        this.Password = Password;
        this.Nombre = Nombre;
    }
    
    public Usuarios(String Correo_electronico, String Password, String Nombre, String Fecha_nacimiento) {
        this.Correo_electronico = Correo_electronico;
        this.Password = Password;
        this.Nombre = Nombre;
        this.Fecha_nacimiento = Fecha_nacimiento;
    }

    Usuarios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCorreo_electronico() {
        return Correo_electronico;
    }

    public void setCorreo_electronico(String Correo_electronico) {
        this.Correo_electronico = Correo_electronico;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    public void setFecha_nacimiento(String Fecha_nacimiento) {
        this.Fecha_nacimiento = Fecha_nacimiento;
    }
    
    
}

