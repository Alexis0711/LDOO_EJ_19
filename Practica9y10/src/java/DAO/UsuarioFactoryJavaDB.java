
package DAO;


public class UsuarioFactoryJavaDB extends Factory {

    @Override
    public UsuarioDAO getUsuarioDAO() {
       return new JavaDBUsuariosDAO();
    }

    @Override
    public AdminDAO getAdminDAO() {
       return new JavaDB_U_AdminDAO();
    }

    @Override
    public NormalDAO getNormalDAO() {
        return new JavaDB_U_NormalDAO();
    }

    @Override
    public InvitadoDAO getInvitadoDAO() {
        return new JavaDB_U_InvitadoDAO();
    }
    
    
}
