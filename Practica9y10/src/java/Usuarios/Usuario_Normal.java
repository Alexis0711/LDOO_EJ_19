
package Usuarios;

public class Usuario_Normal{
    private String Nombre;
    private String Domicilio;

    public Usuario_Normal(String Nombre, String Domicilio) {
        this.Nombre = Nombre;
        this.Domicilio = Domicilio;
    }
    
    public Usuario_Normal(){
        
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }
    
  }
