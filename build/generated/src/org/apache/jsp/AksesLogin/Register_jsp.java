package org.apache.jsp.AksesLogin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <title>SIKEL - Register</title>\n");
      out.write("\n");
      out.write("        <!-- Custom fonts for this template-->\n");
      out.write("        <link href=\"http://localhost:8080/SIKEL_Ganjil/Assets/vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link\n");
      out.write("            href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\"\n");
      out.write("            rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template-->\n");
      out.write("        <link href=\"http://localhost:8080/SIKEL_Ganjil/Assets/css/sb-admin-2.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"bg-gradient-primary\">\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"card o-hidden border-0 shadow-lg my-5\">\n");
      out.write("                <div class=\"card-body p-0\">\n");
      out.write("                    <!-- Nested Row within Card Body -->\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-5 d-none d-lg-block bg-register-image\"></div>\n");
      out.write("                        <div class=\"col-lg-7\">\n");
      out.write("                            <div class=\"p-5\">\n");
      out.write("                                <div class=\"text-center\">\n");
      out.write("                                    <h1 class=\"h4 text-gray-900 mb-4\">Create an Account!</h1>\n");
      out.write("                                </div>\n");
      out.write("                                <form class=\"user\" method=\"post\" action=\"ControlRegist\">\n");
      out.write("                                    <div class=\"form-group row\">\n");
      out.write("                                        <div class=\"col-sm-6 mb-3 mb-sm-0\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control form-control-user\" id=\"exampleFirstName\"\n");
      out.write("                                                   placeholder=\"First Name\" name=\"FirstName\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-sm-6\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control form-control-user\" id=\"exampleLastName\"\n");
      out.write("                                                   placeholder=\"Last Name\" name=\"LastName\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"email\" class=\"form-control form-control-user\" id=\"exampleInputEmail\"\n");
      out.write("                                               placeholder=\"Email Address\" name=\"Email\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"password\" class=\"form-control form-control-user\" id=\"exampleInputPassword\"\n");
      out.write("                                               placeholder=\"Password\" name=\"Password\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <select class=\"form-select form-select-sm mb-3\" aria-label=\".form-select-sm example\" name=\"HakAkses\">\n");
      out.write("                                        <option selected>HAK AKSES</option>\n");
      out.write("                                        <option value=\"KAJUR\">KA JUR</option>\n");
      out.write("                                        <option value=\"KALAB\">KA LAB</option>\n");
      out.write("                                        <option value=\"AIL\">AIL</option>\n");
      out.write("                                    </select>\n");
      out.write("                                        <button class=\"btn btn-primary btn-user btn-block\" type=\"submit\" name=\"Register\"> Register </button>\n");
      out.write("                                        \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                </form>\n");
      out.write("                                <hr>\n");
      out.write("                                <div class=\"text-center\">\n");
      out.write("                                    <a class=\"small\" href=\"Forgot-password.jsp\">Forgot Password?</a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"text-center\">\n");
      out.write("                                    <a class=\"small\" href=\"Login.jsp\">Already have an account? Login!</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core JavaScript-->\n");
      out.write("        <script src=\"http://localhost:8080/SIKEL_Ganjil/Assets/vendor/jquery/jquery.min.js\"></script>\n");
      out.write("        <script src=\"http://localhost:8080/SIKEL_Ganjil/Assets/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Core plugin JavaScript-->\n");
      out.write("        <script src=\"http://localhost:8080/SIKEL_Ganjil/Assets/vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Custom scripts for all pages-->\n");
      out.write("        <script src=\"http://localhost:8080/SIKEL_Ganjil/Assets/js/sb-admin-2.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <!-- Option 1: Bootstrap Bundle with Popper -->\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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
