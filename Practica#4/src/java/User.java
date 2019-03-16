/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexis
 */
public class User {
    
    private String correo_electronico;
    private String password;
    private String nombre_user;
    private String fecha_nacimiento;
    
    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNombre_user(String nombre_user) {
        this.nombre_user = nombre_user;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public String getPassword() {
        return password;
    }

    public String getNombre_user() {
        return nombre_user;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }
}
