package org.apache.jsp.AksesLogin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("        <title>SIKEL - Login</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom fonts for this template-->\r\n");
      out.write("        <link href=\"http://localhost:8080/SIKEL_Ganjil/Assets/vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link\r\n");
      out.write("            href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\"\r\n");
      out.write("            rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom styles for this template-->\r\n");
      out.write("        <link href=\"http://localhost:8080/SIKEL_Ganjil/Assets/css/sb-admin-2.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\"bg-gradient-primary\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <!-- Outer Row -->\r\n");
      out.write("            <div class=\"row justify-content-center\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-xl-10 col-lg-12 col-md-9\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"card o-hidden border-0 shadow-lg my-5\">\r\n");
      out.write("                        <div class=\"card-body p-0\">\r\n");
      out.write("                            <!-- Nested Row within Card Body -->\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-lg-6 d-none d-lg-block bg-login-image\"></div>\r\n");
      out.write("                                <div class=\"col-lg-6\">\r\n");
      out.write("                                    <div class=\"p-5\">\r\n");
      out.write("                                        <div class=\"text-center\">\r\n");
      out.write("                                            <h1 class=\"h4 text-gray-900 mb-4\">SELAMAT DATANG DI SIKEL PCR!</h1>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <form class=\"user\" method=\"post\" action=\"OlahLogin.jsp\">\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <input type=\"email\" class=\"form-control form-control-user\"\r\n");
      out.write("                                                       id=\"exampleInputEmail\" aria-describedby=\"emailHelp\"\r\n");
      out.write("                                                       placeholder=\"Enter Email Address...\" name =\"Email\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <input type=\"password\" class=\"form-control form-control-user\"\r\n");
      out.write("                                                       id=\"exampleInputPassword\" placeholder=\"Password\" name=\"Password\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <div class=\"custom-control custom-checkbox small\">\r\n");
      out.write("                                                    <input type=\"checkbox\" class=\"custom-control-input\" id=\"customCheck\">\r\n");
      out.write("                                                    <label class=\"custom-control-label\" for=\"customCheck\">Remember\r\n");
      out.write("                                                        Me</label>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <button class=\"btn btn-primary btn-user btn-block\" type=\"submit\" name=\"login\"> Login </button>\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                        <hr>\r\n");
      out.write("                                        <div class=\"text-center\">\r\n");
      out.write("                                            <a class=\"small\" href=\"forgot-password.html\">Forgot Password?</a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap core JavaScript-->\r\n");
      out.write("        <script src=\"http://localhost:8080/SIKEL_Ganjil/Assets/vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"http://localhost:8080/SIKEL_Ganjil/Assets/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Core plugin JavaScript-->\r\n");
      out.write("        <script src=\"http://localhost:8080/SIKEL_Ganjil/Assets/vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom scripts for all pages-->\r\n");
      out.write("        <script src=\"http://localhost:8080/SIKEL_Ganjil/Assets/js/sb-admin-2.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");

    String Email = request.getParameter("Email");
    String Password = request.getParameter("Password");

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
