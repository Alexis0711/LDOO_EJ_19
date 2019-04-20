
package Usuarios;

public class Usuario_Invitado{
    private String Nombre;
    private String Fecha_registro;

    public Usuario_Invitado(String Nombre, String Fecha_registro) {
        this.Nombre = Nombre;
        this.Fecha_registro = Fecha_registro;
    }
    
    public Usuario_Invitado(){
        
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFecha_registro() {
        return Fecha_registro;
    }

    public void setFecha_registro(String Fecha_registro) {
        this.Fecha_registro = Fecha_registro;
    }
    
    
  }
