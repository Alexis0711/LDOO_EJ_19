/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.Factory;
import DAO.UsuarioDAO;
import Usuarios.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "InicioSesion", urlPatterns = {"/Iniciar"})
public class InicioSesion extends HttpServlet {

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
      
        
        
        String Usuario=request.getParameter("Usuario");
        String Contraseña=request.getParameter("Password");
       
        Factory subfactoryusuario = Factory.getSubFactory(Factory.USUARIO);
       
        UsuarioDAO usuariodao = subfactoryusuario.getUsuarioDAO();
        Usuario user = new Usuario(Usuario,Contraseña);
        
        Usuario usuario = null;
        usuario=usuariodao.ObtenerUsuario(user);
        
        
        if(usuariodao.Autenticacion(user)&& usuario.getTipo_usuario().equals("Admin")){
            HttpSession sesion=request.getSession(true);
            sesion.setAttribute("Usuario", user.getUsername());
            sesion.setAttribute("UsuarioA", usuario);
            response.sendRedirect("Menu.jsp");
        }
        else
        if(usuariodao.Autenticacion(user)&& usuario.getTipo_usuario().equals("Normal")){
             HttpSession sesion=request.getSession(true);
             sesion.setAttribute("Us-Normal", user.getUsername());
             sesion.setAttribute("UsuarioN", usuario);
             response.sendRedirect("MenuUserN.jsp");
        }
        else
             if(usuariodao.Autenticacion(user)&& usuario.getTipo_usuario().equals("Invitado")){
             HttpSession sesion=request.getSession(true);
             sesion.setAttribute("Us-Inv", user.getUsername());
             sesion.setAttribute("UsuarioIn", usuario);
             response.sendRedirect("MenuUserInv.jsp");
        }
        else{
            
            response.sendRedirect("InicioSesion.jsp");
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
