
package Usuarios;

public class Usuario{

    private String Username;
    private String Password;
    private String Email;
    private String Fecha_nacimiento;
    private String Tipo_usuario;

    public Usuario(String Username, String Password, String Email, String Fecha_nacimiento, String Tipo_usuario) {
        this.Username = Username;
        this.Password = Password;
        this.Email = Email;
        this.Fecha_nacimiento = Fecha_nacimiento;
        this.Tipo_usuario = Tipo_usuario;
    }

    public Usuario(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }
    public Usuario(){
       
    }
    
  public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    public void setFecha_nacimiento(String Fecha_nacimiento) {
        this.Fecha_nacimiento = Fecha_nacimiento;
    }

    public String getTipo_usuario() {
        return Tipo_usuario;
    }

    public void setTipo_usuario(String Tipo_usuario) {
        this.Tipo_usuario = Tipo_usuario;
    }

  }
