package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Arquivos;
import ModelDAO.ArquivoDAO;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write(" <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <title>Meus Arquivos</title>\n");
      out.write("        <!-- Bootstrap core CSS-->\n");
      out.write("        <link href='assets/vendor/bootstrap/css/bootstrap.min.css' rel=\"stylesheet\">\n");
      out.write("        <link href='assets/sweetalert2.css' rel=\"stylesheet\">\n");
      out.write("        <!-- Custom fonts for this template-->\n");
      out.write("        <link href='assets/vendor/font-awesome/css/font-awesome.min.css' rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <!-- Page level plugin CSS-->\n");
      out.write("        <link href='assets/vendor/datatables/dataTables.bootstrap4.css' rel=\"stylesheet\">\n");
      out.write("        <!-- Custom styles for this template-->\n");
      out.write("        <link href='assets/css/sb-admin.css' rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"../assets/table/\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../assets/Data/datatables.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../assets/Data/datatables.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <!-- MENU -->\n");
      out.write("    <body class=\"fixed-nav sticky-footer bg-dark\" id=\"page-top\">\n");
      out.write("        <!-- Navigation-->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark fixed-top\" id=\"mainNav\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"index.html\">Gestão de Conteudos v 3.0.1</a>\n");
      out.write("            <button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("                <ul class=\"navbar-nav navbar-sidenav\" id=\"exampleAccordion\">\n");
      out.write("                    <li class=\"nav-item\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Dashboard\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">\n");
      out.write("                            <i class=\"fa fa-fw fa-dashboard\"></i>\n");
      out.write("                            <span class=\"nav-link-text\">Ambiente</span>\n");
      out.write("                        </a>\n");
      out.write("\n");
      out.write("                    <li class=\"nav-item\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Components\">\n");
      out.write("                        <a class=\"nav-link nav-link-collapse collapsed\" href=\"r\" data-parent=\"#exampleAccordion\">\n");
      out.write("                            <i class=\"fa fa-fw fa-wrench\"></i>\n");
      out.write("                            <span class=\"nav-link-text\">Arquivos</span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"sidenav-second-level collapse\" id=\"collapseComponents\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Components\">\n");
      out.write("                    <a class=\"nav-link nav-link-collapse collapsed\" data-toggle=\"collapse\" href=\"#collapseComponents3\" data-parent=\"#exampleAccordion\">\n");
      out.write("                        <i class=\"fa fa-fw fa-wrench\"></i>\n");
      out.write("                        <span class=\"nav-link-text\">Configurações</span>\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"sidenav-third-level collapse\" id=\"collapseComponents3\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"actualizarAlsimples.php?id=<?php echo $_GET['id'] ;?>\">Perfil</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"actualizarAlagregado.php?id=<?php echo $_GET['id'] ;?>\">Exibição</a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Components\">\n");
      out.write("                    <a class=\"nav-link nav-link-collapse collapsed\" data-toggle=\"collapse\" href=\"#collapseComponents4\" data-parent=\"#exampleAccordion\">\n");
      out.write("                        <i class=\"fa fa-fw fa-wrench\"></i>\n");
      out.write("                        <span class=\"nav-link-text\">Gerenciar Pratos</span>\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"sidenav-third-level collapse\" id=\"collapseComponents4\">\n");
      out.write("\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"ActualizarPragregado.php?id=<?php echo $_GET['id'] ;?>\">Pratos Composto</a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"navbar-nav sidenav-toggler\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link text-center\" id=\"sidenavToggler\">\n");
      out.write("                            <i class=\"fa fa-fw fa-angle-left\"></i>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle mr-lg-2\" id=\"messagesDropdown\" href=\"#\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"fa fa-fw fa-envelope\"></i>\n");
      out.write("                            <span class=\"d-lg-none\">Messages\n");
      out.write("                                <span class=\"badge badge-pill badge-primary\">12 New</span>\n");
      out.write("                            </span>\n");
      out.write("                            <span class=\"indicator text-primary d-none d-lg-block\">\n");
      out.write("                                <i class=\"fa fa-fw fa-circle\"></i>\n");
      out.write("                            </span>\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"messagesDropdown\">\n");
      out.write("                            <h6 class=\"dropdown-header\">New Messages:</h6>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                                <strong>David Miller</strong>\n");
      out.write("                                <span class=\"small float-right text-muted\">11:21 AM</span>\n");
      out.write("                                <div class=\"dropdown-message small\">Hey there! This new version of SB Admin is pretty awesome! These messages clip off when they reach the end of the box so they don't overflow over to the sides!</div>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                                <strong>Jane Smith</strong>\n");
      out.write("                                <span class=\"small float-right text-muted\">11:21 AM</span>\n");
      out.write("                                <div class=\"dropdown-message small\">I was wondering if you could meet for an appointment at 3:00 instead of 4:00. Thanks!</div>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                                <strong>John Doe</strong>\n");
      out.write("                                <span class=\"small float-right text-muted\">11:21 AM</span>\n");
      out.write("                                <div class=\"dropdown-message small\">I've sent the final files over to you for review. When you're able to sign off of them let me know and we can discuss distribution.</div>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item small\" href=\"#\">View all messages</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle mr-lg-2\" id=\"alertsDropdown\" href=\"#\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"fa fa-fw fa-bell\"></i>\n");
      out.write("                            <span class=\"d-lg-none\">Alerts\n");
      out.write("                                <span class=\"badge badge-pill badge-warning\">6 New</span>\n");
      out.write("                            </span>\n");
      out.write("                            <span class=\"indicator text-warning d-none d-lg-block\">\n");
      out.write("                                <i class=\"fa fa-fw fa-circle\"></i>\n");
      out.write("                            </span>\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"alertsDropdown\">\n");
      out.write("                            <h6 class=\"dropdown-header\">New Alerts:</h6>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                                <span class=\"text-success\">\n");
      out.write("                                    <strong>\n");
      out.write("                                        <i class=\"fa fa-long-arrow-up fa-fw\"></i>Status Update</strong>\n");
      out.write("                                </span>\n");
      out.write("                                <span class=\"small float-right text-muted\">11:21 AM</span>\n");
      out.write("                                <div class=\"dropdown-message small\">This is an automated server response message. All systems are online.</div>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                                <span class=\"text-danger\">\n");
      out.write("                                    <strong>\n");
      out.write("                                        <i class=\"fa fa-long-arrow-down fa-fw\"></i>Status Update</strong>\n");
      out.write("                                </span>\n");
      out.write("                                <span class=\"small float-right text-muted\">11:21 AM</span>\n");
      out.write("                                <div class=\"dropdown-message small\">This is an automated server response message. All systems are online.</div>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                                <span class=\"text-success\">\n");
      out.write("                                    <strong>\n");
      out.write("                                        <i class=\"fa fa-long-arrow-up fa-fw\"></i>Status Update</strong>\n");
      out.write("                                </span>\n");
      out.write("                                <span class=\"small float-right text-muted\">11:21 AM</span>\n");
      out.write("                                <div class=\"dropdown-message small\">This is an automated server response message. All systems are online.</div>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item small\" href=\"#\">View all alerts</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <form class=\"form-inline my-2 my-lg-0 mr-lg-2\">\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <input class=\"form-control\" type=\"text\" placeholder=\"Procurar por\">\n");
      out.write("                                <span class=\"input-group-append\">\n");
      out.write("                                    <button class=\"btn btn-primary\" type=\"button\">\n");
      out.write("                                        <i class=\"fa fa-search\"></i>\n");
      out.write("                                    </button>\n");
      out.write("                                </span>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" data-toggle=\"modal\" href=\"<?php session_destroy(); header('location: ../index.php');?>\" data-target=\"#exampleModal\">\n");
      out.write("                            <i class=\"fa fa-fw fa-sign-out\" href=\"df\"></i>Sair</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Deseja Sair?</h5>\n");
      out.write("                        <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\">×</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">Clique em Sair se pretende Fechar essa Sessão.</div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button class=\"btn btn-secondary\" type=\"button\" data-dismiss=\"modal\">Cancelar</button>\n");
      out.write("                        <a class=\"btn btn-primary\" href=\"../index.php\">Sair</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"content-wrapper\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <!-- Breadcrumbs-->\n");
      out.write("                <ol class=\"breadcrumb\">\n");
      out.write("                    <li class=\"breadcrumb-item\">\n");
      out.write("                        <a href=\"#\">Ambiente de Trabalho</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"breadcrumb-item active\">Actualizar</li>\n");
      out.write("                </ol>\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

            ArquivoDAO dao=new ArquivoDAO();
            int id=Integer.parseInt((String)request.getAttribute("idut"));
            int idprop=Integer.parseInt((String)request.getAttribute("idprop"));
            Arquivos ut=(Arquivos)dao.list(id);
        
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("              <div class=\"card card-register mx-auto mt-5\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                 <h1>Editar Dados do Arquivo</h1>\n");
      out.write("        <form action=\"Controller\" method=\"post\">\n");
      out.write("            <div>\n");
      out.write("                 <label>Actualizar Nome</label><br>\n");
      out.write("                 <input class=\"form-control\" type=\"text\" name=\"nome\" placeholder=\"Informe o nome\" value=\"");
      out.print( ut.getNome());
      out.write("\" required=\"\"/><br>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("            <label>Actualizar Preco</label><br>\n");
      out.write("            <input class=\"form-control\" type=\"number\" name=\"preco\" placeholder=\"Informe o novo Preço\" value=\"");
      out.print( ut.getPreco());
      out.write("\" required=\"\"/><br>\n");
      out.write("            </div>\n");
      out.write("          \n");
      out.write("            <input type=\"hidden\" name=\"id\" value=\"");
      out.print( ut.getId());
      out.write("\"/>\n");
      out.write("            <input type=\"hidden\" name=\"idprop\" value=\"");
      out.print( idprop);
      out.write("\"/>\n");
      out.write("            <input class=\"btn btn-primary\" type=\"submit\" name=\"action\" value=\"Actualizar\"/>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
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
