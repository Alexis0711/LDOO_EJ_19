/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Alexis
 */
@WebServlet(urlPatterns = {"/RegistroUsuarios"})
public class RegistroUsuarios extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            
            String correo=request.getParameter("correo");
            String password=request.getParameter("password");
            String nombre=request.getParameter("usuario");
            String fecha_nacimiento=request.getParameter("fecha_nacimiento");
            
            HttpSession session = request.getSession();
            
            Cookie cookie= new Cookie("ID_Sesion",session.getId());
            Cookie cookie_username=new Cookie("Username",nombre);
            Cookie cookie_pass=new Cookie("Pass",password);
            
            cookie.setMaxAge(60*60);
            cookie_username.setMaxAge(60*60);
            cookie_pass.setMaxAge(60*60);
            
            response.addCookie(cookie);
            response.addCookie(cookie_username);
            response.addCookie(cookie_pass);
            
            
            if(session!=null){
                request.getRequestDispatcher("Login.jsp").forward(request, response);
            }
            else{
          
           Usuarios users=(Usuarios)session.getAttribute("Usuario");
           
           if(users==null){
               
               users=new Usuarios(correo,password,nombre,fecha_nacimiento);
               
               session.setAttribute("Usuario",users);
               
               
           }
           
           
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>RegistroUsuarios</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Registro Usuarios</h1>");
            out.println("Correo Electronico: "+users.getCorreo_electronico());
            out.println("<br>");
            out.println("Password: "+users.getPassword());
            out.println("<br>");
            out.println("Nombre: "+users.getNombre());
            out.println("<br>");
            out.println("Fecha Nacimiento: "+users.getFecha_nacimiento());
            out.println("</body>");
            out.println("</html>");
        }
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
