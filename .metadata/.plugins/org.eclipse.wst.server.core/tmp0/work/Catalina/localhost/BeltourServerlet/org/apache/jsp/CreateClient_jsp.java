/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.80
 * Generated at: 2023-11-08 00:23:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CreateClient_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Formulário de Cliente</title>\r\n");
      out.write("    <!-- Incluindo arquivos CSS do Bootstrap -->\r\n");
      out.write("    <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	    <!-- Cabeçalho -->\r\n");
      out.write("    <header>\r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark  bg-dark text-light\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"Index.html\"><img src=\"./img/BeLTOUR.png\"/ height=\"64px\"></a>\r\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("                    <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">Home</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"ReadController\">Cadastros</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"#sobre\">Sobre</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"#contato\">Contato</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <!-- Corpo da Página -->\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("	    <h2>Gerenciamento de Clientes</h2>\r\n");
      out.write("	\r\n");
      out.write("	    <!-- Formulário para Ações de Cliente -->\r\n");
      out.write("		<form id=\"cliente-form\">\r\n");
      out.write("		  <a href=\"CreateClient.jsp\" class=\"btn btn-primary\" name=\"cadastrar\">Cadastrar Cliente</a>\r\n");
      out.write("		  <a href=\"ReadController\" class=\"btn btn-primary\" name=\"procurar\">Procurar Clientes</a>\r\n");
      out.write("\r\n");
      out.write("	</form>\r\n");
      out.write("  	</div>\r\n");
      out.write("  \r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <h1 class=\"mt-4\">Formulário de Cliente</h1>\r\n");
      out.write("        <form action=\"CreateController\" method=\"post\">\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"cpf\">CPF (11 dígitos):</label>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"cpf\" name=\"cpf\" required pattern=\"\\d{11}\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"nome\">Nome (até 30 caracteres):</label>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"nome\" name=\"name\" maxlength=\"30\" required>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"dataNasc\">Data de Nascimento (AAAA-MM-DD):</label>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"bornDate\" name=\"bornDate\" required pattern=\"\\d{4}-\\d{2}-\\d{2}\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"endereco\">Endereço (até 30 caracteres):</label>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"adress\" name=\"adress\" maxlength=\"30\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"email\">Email (até 30 caracteres):</label>\r\n");
      out.write("                <input type=\"email\" class=\"form-control\" id=\"email\" name=\"email\" maxlength=\"30\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"telefone\">Telefone (até 16 dígitos):</label>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"tel\" name=\"tel\" pattern=\"\\d{1,16}\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary\">Enviar</button>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"text-center mt-3\">\r\n");
      out.write("        <a href=\"Index.html\" class=\"btn btn-secondary\">Voltar</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Rodapé -->\r\n");
      out.write("    <footer class=\"bg-dark text-light text-center py-3 fixed-bottom\">\r\n");
      out.write("        &copy; 2023 Sua Empresa. Todos os direitos reservados.\r\n");
      out.write("    </footer>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Incluindo arquivos JavaScript do Bootstrap e jQuery -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.2/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
