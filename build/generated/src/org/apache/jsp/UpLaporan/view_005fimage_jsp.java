package org.apache.jsp.UpLaporan;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class view_005fimage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
    String host = "jdbc:mysql://localhost:3306/sikel_db";
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(host, "root", "");
        String query = "select * from laporan ORDER BY baca asc";
        Statement stmt = conn.createStatement();
        ResultSet rs = null;
        rs = stmt.executeQuery(query);

      out.write("    \n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <title>validasi laporan</title>\n");
      out.write("\n");
      out.write("        <!-- Custom fonts for this template -->\n");
      out.write("        <link href=\" ../Assets/vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link\n");
      out.write("            href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\"\n");
      out.write("            rel=\"stylesheet\">\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"../Assets/css/sb-admin-2.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <!-- Custom styles for this page -->\n");
      out.write("        <link href=\" ../Assets/vendor/datatables/dataTables.bootstrap4.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"../Assets/img/file.svg\" />\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body id=\"page-top\">\n");
      out.write("        <!-- Page Wrapper -->\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("            <!-- Sidebar -->\n");
      out.write("            <ul class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\n");
      out.write("                <!-- Sidebar - Brand -->\n");
      out.write("                <a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"index.html\">\n");
      out.write("                    <div class=\"sidebar-brand-icon rotate-n-15\">\n");
      out.write("                        <i class=\"fas fa-laugh-wink\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"sidebar-brand-text mx-3\">SIKEL</div>\n");
      out.write("                </a>\n");
      out.write("                <!-- Divider -->\n");
      out.write("                <hr class=\"sidebar-divider my-0\">\n");
      out.write("\n");
      out.write("                <hr class=\"sidebar-divider\">\n");
      out.write("                <!-- Nav Item - Charts -->\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"../konfirmasi Pengajuan/view_Konfirmasi.jsp\">\n");
      out.write("                        <i class=\"fas fa-fw fa-list\"></i>\n");
      out.write("                        <span>List Pengajuan</span></a>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <hr class=\"sidebar-divider\">\n");
      out.write("                <!-- Nav Item - Charts -->\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"../Memvalidasi Laporan/view_laporan.jsp\">\n");
      out.write("                        <i class=\"fas fa-fw fa-file-pdf\"></i>\n");
      out.write("                        <span>LPJ</span></a>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <!-- Divider -->\n");
      out.write("                <hr class=\"sidebar-divider d-none d-md-block\">\n");
      out.write("                <!-- Sidebar Toggler (Sidebar) -->\n");
      out.write("                <div class=\"text-center d-none d-md-inline\">\n");
      out.write("                    <button class=\"rounded-circle border-0\" id=\"sidebarToggle\"></button>\n");
      out.write("                </div>\n");
      out.write("            </ul>\n");
      out.write("            <!-- End of Sidebar -->\n");
      out.write("\n");
      out.write("            <!-- Content Wrapper -->\n");
      out.write("            <div id=\"content-wrapper\" class=\"d-flex flex-column\">\n");
      out.write("                <!-- Main Content -->\n");
      out.write("                <div id=\"content\">\n");
      out.write("                    <!-- Topbar -->\n");
      out.write("                    <nav class=\"navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow\">\n");
      out.write("                        <!-- Sidebar Toggle (Topbar) -->\n");
      out.write("                        <button id=\"sidebarToggleTop\" class=\"btn btn-link d-md-none rounded-circle mr-3\">\n");
      out.write("                            <i class=\"fa fa-bars\"></i>\n");
      out.write("                        </button>\n");
      out.write("                        <!-- Topbar Navbar -->\n");
      out.write("                        <ul class=\"navbar-nav ml-auto\">\n");
      out.write("\n");
      out.write("                            <!-- Nav Item - Search Dropdown (Visible Only XS) -->\n");
      out.write("                            <li class=\"nav-item dropdown no-arrow d-sm-none\">\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"searchDropdown\" role=\"button\"\n");
      out.write("                                   data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                    <i class=\"fas fa-search fa-fw\"></i>\n");
      out.write("                                </a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <!-- Dropdown - Messages -->\n");
      out.write("                                <div class=\"dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in\"\n");
      out.write("                                     aria-labelledby=\"searchDropdown\">\n");
      out.write("                                    <form class=\"form-inline mr-auto w-100 navbar-search\">\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control bg-light border-0 small\"\n");
      out.write("                                                   placeholder=\"Search for...\" aria-label=\"Search\"\n");
      out.write("                                                   aria-describedby=\"basic-addon2\">\n");
      out.write("                                            <div class=\"input-group-append\">\n");
      out.write("                                                <button class=\"btn btn-primary\" type=\"button\">\n");
      out.write("                                                    <i class=\"fas fa-search fa-sm\"></i>\n");
      out.write("                                                </button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <!-- Nav Item - User Information -->\n");
      out.write("                            <li class=\"nav-item dropdown no-arrow\">\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\"\n");
      out.write("                                   data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                    <span class=\"mr-2 d-none d-lg-inline text-gray-600 small\">Dwi Listiyanti, S.S.T</span>\n");
      out.write("                                    <img class=\"img-profile rounded-circle\"\n");
      out.write("                                         src=\"../Assets/img/file.svg\">\n");
      out.write("                                </a>\n");
      out.write("                                <!-- Dropdown - User Information -->\n");
      out.write("                                <div class=\"dropdown-menu dropdown-menu-right shadow animated--grow-in\"\n");
      out.write("                                     aria-labelledby=\"userDropdown\">\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                                        <i class=\"fas fa-user fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                                        Profile\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                                        <i class=\"fas fa-cogs fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                                        Settings\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                                        <i class=\"fas fa-list fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                                        Activity Log\n");
      out.write("                                    </a>\n");
      out.write("                                    <div class=\"dropdown-divider\"></div>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\" data-toggle=\"modal\" data-target=\"#logoutModal\">\n");
      out.write("                                        <i class=\"fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                                        Logout\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </nav>\n");
      out.write("                    <!-- End of Topbar -->\n");
      out.write("\n");
      out.write("                    <div style=\"margin: 60px\">\n");
      out.write("                        <!-- Begin Page Content -->\n");
      out.write("                        <div class=\"container-fluid\">\n");
      out.write("                            <!-- Page Heading -->\n");
      out.write("                            <h1 class=\"h3 mb-2 text-gray-800\">Data Laporan </h1>\n");
      out.write("\n");
      out.write("                            <!-- DataTales  -->\n");
      out.write("                            <div style=\"padding: 30px\">\n");
      out.write("                                <div class=\"card shadow mb-4\">\n");
      out.write("                                    <div class=\"card-header py-3\">\n");
      out.write("                                        <h6 class=\"m-0 font-weight-bold text-primary\">Daftar Laporan</h6>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <div class=\"table-responsive\">\n");
      out.write("                                            <table class=\"table table-bordered\" id=\"dataTable\" width=\"100%\" cellspacing=\"0\">\n");
      out.write("                                                <thead>\n");
      out.write("                                                    <tr style=\"background-color: #007bff ; color: white\">\n");
      out.write("                                                        <th style=\"width: 50px\">No</th>\n");
      out.write("                                                       \n");
      out.write("                                                        <th>View File</th>\n");
      out.write("                                                        <th>Keterangan</th>\n");
      out.write("                                                        \n");
      out.write("                                                    </tr>\n");
      out.write("                                                </thead>\n");
      out.write("                                                <tfoot>\n");
      out.write("                                                    <tr>\n");
      out.write("                                                        <th style=\"width: 50px\">No</th>\n");
      out.write("                                                                                                              \n");
      out.write("                                                        <th>View File</th>\n");
      out.write("                                                        <th>Keterangan</th>\n");
      out.write("                                                        \n");
      out.write("                                                    </tr>\n");
      out.write("                                                </tfoot>\n");
      out.write("                                                <tbody>\n");
      out.write("                                                    ");
 int i = 1;
                                                        while (rs.next()) {
                                                    
      out.write("\n");
      out.write("                                                    <tr style=\"background: ");

                                                        if (rs.getString("baca").equalsIgnoreCase("0")) {
                                                        
      out.write("#fcebeb;font-weight: bold; color: black;\n");
      out.write("                                                        ");
}
      out.write("\">\n");
      out.write("                                                        <td style=\"text-align: center\">");
      out.print(i);
 i++;
      out.write("</td>\n");
      out.write("                                                        \n");
      out.write("                                                       \n");
      out.write("                                                     <td>\n");
      out.write("                                                            <a class=\"btn btn-primary\" style=\" padding: 0px 5px 0px 5px;text-decoration: none; color: white\" href=\"lihat.jsp?fname=");
      out.print(rs.getString("nama_file"));
      out.write("&ket=1&id=");
      out.print(rs.getString("id"));
      out.write("\" target=\"_blank\">\n");
      out.write("                                                                ");
      out.print(rs.getString("nama_file"));
      out.write("\n");
      out.write("                                                            </a>\n");
      out.write("                                                        </td>\n");
      out.write("                                                        \n");
      out.write("                                                         <td>");
      out.print(rs.getString("status") );
      out.write("</td>\n");
      out.write("                                                        \n");
      out.write("                                                        \n");
      out.write("                                                <div class=\"modal fade\" id=\"");
      out.print(rs.getString("id"));
      out.write("\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("                                                    <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                                                        <div class=\"modal-content\">\n");
      out.write("                                                            <div class=\"modal-header\">\n");
      out.write("                                                                <form action=\"verifikasi.jsp\" method=\"POST\" >\n");
      out.write("                                                                    <h5 class=\"modal-title\" id=\"exampleModalLabel\">Komentar</h5>\n");
      out.write("                                                                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                                                                        <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                                                                    </button>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"modal-body\">\n");
      out.write("                                                                <input type=\"hidden\" name=\"id\" value=\"");
      out.print(rs.getString("id"));
      out.write("\">\n");
      out.write("                                                                <input type=\"hidden\" name=\"status\" value=\"Tolak\">\n");
      out.write("                                                                <textarea type=\"text\" style=\"width: 100%; height: 150px\" name=\"komentar\"></textarea>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"modal-footer\">\n");
      out.write("                                                                <button value=\"submit\" type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("                                                                <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Batal</button>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                </form>\n");
      out.write("                                                ");

                                                    }
                                                
      out.write("\n");
      out.write("                                                </tr>\n");
      out.write("                                                </tbody>\n");
      out.write("                                            </table>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- End of Main Content -->\n");
      out.write("\n");
      out.write("                    <!-- Footer -->\n");
      out.write("                    <footer class=\"sticky-footer bg-white\">\n");
      out.write("                        <div class=\"container my-auto\">\n");
      out.write("                            <div class=\"copyright text-center my-auto\">\n");
      out.write("                                <span>Sistem Keuangan Lab | Kemlompok 3</span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </footer>\n");
      out.write("                    <!-- End of Footer -->\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- End of Content Wrapper -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- End of Page Wrapper -->\n");
      out.write("\n");
      out.write("            <!-- Scroll to Top Button-->\n");
      out.write("            <a class=\"scroll-to-top rounded\" href=\"#page-top\">\n");
      out.write("                <i class=\"fas fa-angle-up\"></i>\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <!-- Logout Modal-->\n");
      out.write("            <div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\"\n");
      out.write("                 aria-hidden=\"true\">\n");
      out.write("                <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                        <div class=\"modal-header\">\n");
      out.write("                            <h5 class=\"modal-title\" id=\"exampleModalLabel\">Ready to Leave?</h5>\n");
      out.write("                            <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                                <span aria-hidden=\"true\">×</span>\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">Select \"Logout\" below if you are ready to end your current session.</div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <button class=\"btn btn-secondary\" type=\"button\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("                            <a class=\"btn btn-primary\" href=\"login.html\">Logout</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <script src=\" ../Assets/vendor/jquery/jquery.min.js\"></script>\n");
      out.write("            <script src=\" ../Assets/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("            <!-- Core plugin JavaScript-->\n");
      out.write("            <script src=\" ../Assets/vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("            <!-- Custom scripts for all pages-->\n");
      out.write("            <script src=\"js/sb-admin-2.min.js\"></script>\n");
      out.write("            <!-- Page level plugins -->\n");
      out.write("            <script src=\" ../Assets/vendor/datatables/jquery.dataTables.min.js\"></script>\n");
      out.write("            <script src=\" ../Assets/vendor/datatables/dataTables.bootstrap4.min.js\"></script>\n");
      out.write("            <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("            <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("            <script src=\"../Assets/js/demo/datatables-demo.js\"></script>\n");
      out.write("            <!--<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>--> \n");
      out.write("            ");

                    rs.close();
                    stmt.close();
                    conn.close();
                } catch (SQLException ex) {
                    out.print("Gagal Koneksi");
                } catch (Exception ex) {
                    out.print(ex.getMessage());
                }
            
      out.write("\n");
      out.write("    </body>\n");
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
