package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistroUsuarios_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"Script/ValidarRegistro.js\"></script>\n");
      out.write("        <title>Registro Usuario Admin</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Registro Usuario Admin</h1>\n");
      out.write("        <form action=\"Registrar\" method=\"post\" id=\"formregistro\">\n");
      out.write("            Número Empleado <input type=\"text\" name=\"Num_emp\" id=\"Num_emp\"/><br><br>\n");
      out.write("            Username <input type=\"text\" name=\"Usuario\" id=\"Usuario\"/><br><br>\n");
      out.write("            Contraseña <input type=\"password\" name=\"Password\" id=\"Password\"/><br><br>\n");
      out.write("            Fecha Nacimiento <input type=\"text\" name=\"Fecha_nacimiento\" id=\"Fecha\"/><br><br>\n");
      out.write("            Correo Electrónico <input type=\"text\" name=\"Correo\" id=\"Correo\"/><br><br>\n");
      out.write("            Tipo Usuario <select name=\"Tipo_usuario\" id=\"Tipo_user\">\n");
      out.write("                <option value=\"Admin\">Admin</option>\n");
      out.write("                <option value=\"Normal\">Normal</option>\n");
      out.write("                <option value=\"Invitado\">Invitado</option>\n");
      out.write("            </select><br><br>\n");
      out.write("            <input type=\"button\" value=\"Registrar\" id=\"BtnRegistrar\"/>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
