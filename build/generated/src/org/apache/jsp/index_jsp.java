package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  <meta name=\"description\" content=\"\">\n");
      out.write("  <meta name=\"author\" content=\"\">\n");
      out.write("  <title>Gestão de Conteudo</title>\n");
      out.write("  <!-- Bootstrap core CSS-->\n");
      out.write("  <link href='assets/vendor/bootstrap/css/bootstrap.min.css' rel=\"stylesheet\">\n");
      out.write("  <!-- Custom fonts for this template-->\n");
      out.write("  <link href='assets/vendor/font-awesome/css/font-awesome.min.css' rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  <!-- Page level plugin CSS-->\n");
      out.write("  <link href='assets/vendor/datatables/dataTables.bootstrap4.css' rel=\"stylesheet\">\n");
      out.write("  <!-- Custom styles for this template-->\n");
      out.write("  <link href='assets/css/sb-admin.css' rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<body class=\"bg-dark\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"card card-login mx-auto mt-5\">\n");
      out.write("      <div class=\"card-header\">Login</div>\n");
      out.write("      <div class=\"card-body\">\n");
      out.write("        <form method=\"post\" action=\"ControllerP\">\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label for=\"exampleInputEmail1\">Informe seu Email</label>\n");
      out.write("            <input class=\"form-control\" id=\"exampleInputEmail1\" name=\"email\" type=\"email\" aria-describedby=\"emailHelp\" placeholder=\"Insira seu email\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label for=\"exampleInputPassword1\">Palavra Passe</label>\n");
      out.write("            <input class=\"form-control\" id=\"exampleInputPassword1\" name=\"senha\" type=\"password\" placeholder=\"Insira sua Palavra Passe\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <div class=\"form-check\">\n");
      out.write("              <label class=\"form-check-label\">\n");
      out.write("                <input class=\"form-check-input\" type=\"checkbox\"> Remember Password</label>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <input class=\"btn btn-primary btn-block\"  type=\"submit\" name=\"action\" value=\"entrar\">\n");
      out.write("          \n");
      out.write("        </form>\n");
      out.write("        <div class=\"text-center\">\n");
      out.write("          <a class=\"d-block small mt-3\" href=\"Controller?action=registar\">Registar Uma Nova Conta</a>\n");
      out.write("          <a class=\"d-block small\" href=\"forgot-password.html\">Esqueceu a Palavra Passe?</a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <!-- Bootstrap core JavaScript-->\n");
      out.write("  <script src=\"assets/vendor/jquery/jquery.min.js\"></script>\n");
      out.write("  <script src=\"aasets/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("  <!-- Core plugin JavaScript-->\n");
      out.write("  <script src=\"assets/vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
