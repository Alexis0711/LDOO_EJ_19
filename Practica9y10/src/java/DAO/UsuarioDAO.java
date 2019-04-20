
package DAO;

import Usuarios.Usuario;



public interface UsuarioDAO {
    
    public boolean RegistrarUsuario(Usuario usuario);
    public boolean Autenticacion(Usuario usuario);
    public Usuario ObtenerUsuario(Usuario usuario);
    
}
