/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.Factory;
import DAO.NormalDAO;
import DAO.UsuarioDAO;
import Usuarios.Usuario;
import Usuarios.Usuario_Normal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Alexis
 */
@WebServlet(name = "RegistrarUsuariosN", urlPatterns = {"/RegistrarUsuariosN"})
public class RegistrarUsuariosN extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String Nombre=request.getParameter("Nombre");
        String Username=request.getParameter("Usuario");
        String Contraseña=request.getParameter("Password");
        String Fecha_nacimiento=request.getParameter("Fecha_nacimiento");
        String Correo=request.getParameter("Correo");
        String Domicilio=request.getParameter("Domicilio");
        String Tipo_Usuario=request.getParameter("Tipo_usuario");
        
        Usuario usuario = new Usuario(Username, Contraseña,Correo,Fecha_nacimiento,Tipo_Usuario);
        Usuario_Normal normal = new Usuario_Normal(Nombre,Domicilio);
        
        Factory subfactoryusuario = Factory.getSubFactory(Factory.USUARIO);
        UsuarioDAO usuariodao = subfactoryusuario.getUsuarioDAO();
        Factory subfactorynormal=Factory.getSubFactory(Factory.NORMAL);
        NormalDAO Normaldao= subfactorynormal.getNormalDAO();
        
        
        if(usuariodao.RegistrarUsuario(usuario) && Normaldao.RegistrarUsuario(normal)){
             
            response.sendRedirect("InicioSesion.jsp");
              
             
        }else{
            response.sendRedirect("Registro_UserNormal.jsp");
  
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
