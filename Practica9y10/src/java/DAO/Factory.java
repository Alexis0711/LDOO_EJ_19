
package DAO;


public abstract class Factory {
    
     public static final int USUARIO=1;
     public static final int ADMIN=2;
     public static final int NORMAL=3;
     public static final int INVITADO=4;
     
     public abstract UsuarioDAO getUsuarioDAO();
     public abstract AdminDAO getAdminDAO();
     public abstract NormalDAO getNormalDAO();
     public abstract InvitadoDAO getInvitadoDAO();
     
      public static Factory getSubFactory(int tipo){
        
        switch(tipo){
            case USUARIO:
                return new UsuarioFactoryJavaDB();
            case ADMIN:
                return new UsuarioFactoryJavaDB();
            case NORMAL:
                return new UsuarioFactoryJavaDB();
            case INVITADO:
                return new UsuarioFactoryJavaDB();
           
            default:
                break;
        }
        
        return null;
    }
     
    
}
