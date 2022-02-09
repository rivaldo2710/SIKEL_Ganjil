package org.apache.jsp.Memvalidasi_0020Laporan;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class view_005flaporan_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
    String host = "jdbc:mysql://localhost:3306/projek_sistemkeuanganlab";
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(host, "root", "");
        String query = "select * from laporan ORDER BY baca asc";
        Statement stmt = conn.createStatement();
        ResultSet rs = null;
        rs = stmt.executeQuery(query);

      out.write("    \r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("        <title>validasi laporan</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom fonts for this template -->\r\n");
      out.write("        <link href=\" ../Assets/vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link\r\n");
      out.write("            href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\"\r\n");
      out.write("            rel=\"stylesheet\">\r\n");
      out.write("        <!-- Custom styles for this template -->\r\n");
      out.write("        <link href=\"../Assets/css/sb-admin-2.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n");
      out.write("        <!-- Custom styles for this page -->\r\n");
      out.write("        <link href=\" ../Assets/vendor/datatables/dataTables.bootstrap4.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"../Assets/img/file.svg\" />\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <body id=\"page-top\">\r\n");
      out.write("        <!-- Page Wrapper -->\r\n");
      out.write("        <div id=\"wrapper\">\r\n");
      out.write("            <!-- Sidebar -->\r\n");
      out.write("            <ul class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\r\n");
      out.write("                <!-- Sidebar - Brand -->\r\n");
      out.write("                <a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"index.html\">\r\n");
      out.write("                    <div class=\"sidebar-brand-icon rotate-n-15\">\r\n");
      out.write("                        <i class=\"fas fa-laugh-wink\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"sidebar-brand-text mx-3\">SIKEL</div>\r\n");
      out.write("                </a>\r\n");
      out.write("                <!-- Divider -->\r\n");
      out.write("                <hr class=\"sidebar-divider my-0\">\r\n");
      out.write("\r\n");
      out.write("                <hr class=\"sidebar-divider\">\r\n");
      out.write("                <!-- Nav Item - Charts -->\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"../konfirmasi Pengajuan/view_Konfirmasi.jsp\">\r\n");
      out.write("                        <i class=\"fas fa-fw fa-list\"></i>\r\n");
      out.write("                        <span>List Pengajuan</span></a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <hr class=\"sidebar-divider\">\r\n");
      out.write("                <!-- Nav Item - Charts -->\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"../Memvalidasi Laporan/view_laporan.jsp\">\r\n");
      out.write("                        <i class=\"fas fa-fw fa-file-pdf\"></i>\r\n");
      out.write("                        <span>LPJ</span></a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <!-- Divider -->\r\n");
      out.write("                <hr class=\"sidebar-divider d-none d-md-block\">\r\n");
      out.write("                <!-- Sidebar Toggler (Sidebar) -->\r\n");
      out.write("                <div class=\"text-center d-none d-md-inline\">\r\n");
      out.write("                    <button class=\"rounded-circle border-0\" id=\"sidebarToggle\"></button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <!-- End of Sidebar -->\r\n");
      out.write("\r\n");
      out.write("            <!-- Content Wrapper -->\r\n");
      out.write("            <div id=\"content-wrapper\" class=\"d-flex flex-column\">\r\n");
      out.write("                <!-- Main Content -->\r\n");
      out.write("                <div id=\"content\">\r\n");
      out.write("                    <!-- Topbar -->\r\n");
      out.write("                    <nav class=\"navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow\">\r\n");
      out.write("                        <!-- Sidebar Toggle (Topbar) -->\r\n");
      out.write("                        <button id=\"sidebarToggleTop\" class=\"btn btn-link d-md-none rounded-circle mr-3\">\r\n");
      out.write("                            <i class=\"fa fa-bars\"></i>\r\n");
      out.write("                        </button>\r\n");
      out.write("                        <!-- Topbar Navbar -->\r\n");
      out.write("                        <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("\r\n");
      out.write("                            <!-- Nav Item - Search Dropdown (Visible Only XS) -->\r\n");
      out.write("                            <li class=\"nav-item dropdown no-arrow d-sm-none\">\r\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"searchDropdown\" role=\"button\"\r\n");
      out.write("                                   data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                    <i class=\"fas fa-search fa-fw\"></i>\r\n");
      out.write("                                </a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <!-- Dropdown - Messages -->\r\n");
      out.write("                                <div class=\"dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in\"\r\n");
      out.write("                                     aria-labelledby=\"searchDropdown\">\r\n");
      out.write("                                    <form class=\"form-inline mr-auto w-100 navbar-search\">\r\n");
      out.write("                                        <div class=\"input-group\">\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control bg-light border-0 small\"\r\n");
      out.write("                                                   placeholder=\"Search for...\" aria-label=\"Search\"\r\n");
      out.write("                                                   aria-describedby=\"basic-addon2\">\r\n");
      out.write("                                            <div class=\"input-group-append\">\r\n");
      out.write("                                                <button class=\"btn btn-primary\" type=\"button\">\r\n");
      out.write("                                                    <i class=\"fas fa-search fa-sm\"></i>\r\n");
      out.write("                                                </button>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <!-- Nav Item - User Information -->\r\n");
      out.write("                            <li class=\"nav-item dropdown no-arrow\">\r\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\"\r\n");
      out.write("                                   data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                    <span class=\"mr-2 d-none d-lg-inline text-gray-600 small\">Dwi Listiyanti, S.S.T</span>\r\n");
      out.write("                                    <img class=\"img-profile rounded-circle\"\r\n");
      out.write("                                         src=\"../Assets/img/file.svg\">\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <!-- Dropdown - User Information -->\r\n");
      out.write("                                <div class=\"dropdown-menu dropdown-menu-right shadow animated--grow-in\"\r\n");
      out.write("                                     aria-labelledby=\"userDropdown\">\r\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">\r\n");
      out.write("                                        <i class=\"fas fa-user fa-sm fa-fw mr-2 text-gray-400\"></i>\r\n");
      out.write("                                        Profile\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">\r\n");
      out.write("                                        <i class=\"fas fa-cogs fa-sm fa-fw mr-2 text-gray-400\"></i>\r\n");
      out.write("                                        Settings\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">\r\n");
      out.write("                                        <i class=\"fas fa-list fa-sm fa-fw mr-2 text-gray-400\"></i>\r\n");
      out.write("                                        Activity Log\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\" data-toggle=\"modal\" data-target=\"#logoutModal\">\r\n");
      out.write("                                        <i class=\"fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400\"></i>\r\n");
      out.write("                                        Logout\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                    <!-- End of Topbar -->\r\n");
      out.write("\r\n");
      out.write("                    <div style=\"margin: 60px\">\r\n");
      out.write("                        <!-- Begin Page Content -->\r\n");
      out.write("                        <div class=\"container-fluid\">\r\n");
      out.write("                            <!-- Page Heading -->\r\n");
      out.write("                            <h1 class=\"h3 mb-2 text-gray-800\">Validasi Laporan Belanja</h1>\r\n");
      out.write("\r\n");
      out.write("                            <!-- DataTales  -->\r\n");
      out.write("                            <div style=\"padding: 30px\">\r\n");
      out.write("                                <div class=\"card shadow mb-4\">\r\n");
      out.write("                                    <div class=\"card-header py-3\">\r\n");
      out.write("                                        <h6 class=\"m-0 font-weight-bold text-primary\">Daftar Pengajuan</h6>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"card-body\">\r\n");
      out.write("                                        <div class=\"table-responsive\">\r\n");
      out.write("                                            <table class=\"table table-bordered\" id=\"dataTable\" width=\"100%\" cellspacing=\"0\">\r\n");
      out.write("                                                <thead>\r\n");
      out.write("                                                    <tr style=\"background-color: #007bff ; color: white\">\r\n");
      out.write("                                                        <th style=\"width: 50px\">No</th>\r\n");
      out.write("                                                        <th >Nama KaLab</th>\r\n");
      out.write("                                                        <th>Keterangan</th>\r\n");
      out.write("                                                        <th>View File</th>\r\n");
      out.write("                                                        <th>Aksi</th>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                </thead>\r\n");
      out.write("                                                <tfoot>\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <th style=\"width: 50px\">No</th>\r\n");
      out.write("                                                        <th >Nama KaLab</th>\r\n");
      out.write("                                                        <th>Keterangan</th>\r\n");
      out.write("                                                        <th>View File</th>\r\n");
      out.write("                                                        <th>Aksi</th>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                </tfoot>\r\n");
      out.write("                                                <tbody>\r\n");
      out.write("                                                    ");
 int i = 1;
                                                        while (rs.next()) {
                                                    
      out.write("\r\n");
      out.write("                                                    <tr style=\"background: ");

                                                        if (rs.getString("baca").equalsIgnoreCase("0")) {
                                                        
      out.write("#fcebeb;font-weight: bold; color: black;\r\n");
      out.write("                                                        ");
}
      out.write("\">\r\n");
      out.write("                                                        <td style=\"text-align: center\">");
      out.print(i);
 i++;
      out.write("</td>\r\n");
      out.write("                                                        <td>\r\n");
      out.write("                                                            ");

                                                                String query2 = "select * from ail where id_ail='" + rs.getString("id_ail") + "'";
                                                                Statement stmt2 = conn.createStatement();
                                                                ResultSet rs2 = null;
                                                                rs2 = stmt2.executeQuery(query2);
                                                                while (rs2.next()) {
                                                            
      out.write("\r\n");
      out.write("                                                            ");
      out.print(rs2.getString("nama_ail"));
      out.write("\r\n");
      out.write("                                                            ");

                                                                }
                                                            
      out.write("\r\n");
      out.write("                                                        </td>\r\n");
      out.write("                                                        <td>");
      out.print(rs.getString("status"));
      out.write("</td>\r\n");
      out.write("                                                        <td>\r\n");
      out.write("                                                            <a class=\"btn btn-primary\" style=\" padding: 0px 5px 0px 5px;text-decoration: none; color: white\" href=\"lihat.jsp?fname=");
      out.print(rs.getString("nama_file"));
      out.write("&ket=1&id=");
      out.print(rs.getString("id"));
      out.write("\" target=\"_blank\">\r\n");
      out.write("                                                                ");
      out.print(rs.getString("nama_file"));
      out.write("\r\n");
      out.write("                                                            </a>\r\n");
      out.write("                                                        </td>\r\n");
      out.write("                                                        <td>\r\n");
      out.write("                                                            <a class=\"btn btn-primary\" href=\"verifikasi.jsp?id=");
      out.print(rs.getString("id"));
      out.write("&status=Terima\">Terima</a>\r\n");
      out.write("                                                            <a  style=\"margin-left: 10px;color: white\" class=\"btn btn-danger\" data-toggle=\"modal\" data-target=\"#");
      out.print(rs.getString("id"));
      out.write("\">Tolak</a>\r\n");
      out.write("                                                        </td>\r\n");
      out.write("                                                <div class=\"modal fade\" id=\"");
      out.print(rs.getString("id"));
      out.write("\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("                                                    <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("                                                        <div class=\"modal-content\">\r\n");
      out.write("                                                            <div class=\"modal-header\">\r\n");
      out.write("                                                                <form action=\"verifikasi.jsp\" method=\"POST\" >\r\n");
      out.write("                                                                    <h5 class=\"modal-title\" id=\"exampleModalLabel\">Komentar</h5>\r\n");
      out.write("                                                                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                                                                        <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("                                                                    </button>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                            <div class=\"modal-body\">\r\n");
      out.write("                                                                <input type=\"hidden\" name=\"id\" value=\"");
      out.print(rs.getString("id"));
      out.write("\">\r\n");
      out.write("                                                                <input type=\"hidden\" name=\"status\" value=\"Tolak\">\r\n");
      out.write("                                                                <textarea type=\"text\" style=\"width: 100%; height: 150px\" name=\"komentar\"></textarea>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                            <div class=\"modal-footer\">\r\n");
      out.write("                                                                <button value=\"submit\" type=\"submit\" class=\"btn btn-primary\">Submit</button>\r\n");
      out.write("                                                                <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Batal</button>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                </form>\r\n");
      out.write("                                                ");

                                                    }
                                                
      out.write("\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                                </tbody>\r\n");
      out.write("                                            </table>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- End of Main Content -->\r\n");
      out.write("\r\n");
      out.write("                    <!-- Footer -->\r\n");
      out.write("                    <footer class=\"sticky-footer bg-white\">\r\n");
      out.write("                        <div class=\"container my-auto\">\r\n");
      out.write("                            <div class=\"copyright text-center my-auto\">\r\n");
      out.write("                                <span>Sistem Keuangan Lab | Kemlompok 3</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </footer>\r\n");
      out.write("                    <!-- End of Footer -->\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- End of Content Wrapper -->\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- End of Page Wrapper -->\r\n");
      out.write("\r\n");
      out.write("            <!-- Scroll to Top Button-->\r\n");
      out.write("            <a class=\"scroll-to-top rounded\" href=\"#page-top\">\r\n");
      out.write("                <i class=\"fas fa-angle-up\"></i>\r\n");
      out.write("            </a>\r\n");
      out.write("\r\n");
      out.write("            <!-- Logout Modal-->\r\n");
      out.write("            <div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\"\r\n");
      out.write("                 aria-hidden=\"true\">\r\n");
      out.write("                <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("                    <div class=\"modal-content\">\r\n");
      out.write("                        <div class=\"modal-header\">\r\n");
      out.write("                            <h5 class=\"modal-title\" id=\"exampleModalLabel\">Ready to Leave?</h5>\r\n");
      out.write("                            <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                                <span aria-hidden=\"true\">×</span>\r\n");
      out.write("                            </button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"modal-body\">Select \"Logout\" below if you are ready to end your current session.</div>\r\n");
      out.write("                        <div class=\"modal-footer\">\r\n");
      out.write("                            <button class=\"btn btn-secondary\" type=\"button\" data-dismiss=\"modal\">Cancel</button>\r\n");
      out.write("                            <a class=\"btn btn-primary\" href=\"login.html\">Logout</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <script src=\" ../Assets/vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("            <script src=\" ../Assets/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("            <!-- Core plugin JavaScript-->\r\n");
      out.write("            <script src=\" ../Assets/vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("            <!-- Custom scripts for all pages-->\r\n");
      out.write("            <script src=\"js/sb-admin-2.min.js\"></script>\r\n");
      out.write("            <!-- Page level plugins -->\r\n");
      out.write("            <script src=\" ../Assets/vendor/datatables/jquery.dataTables.min.js\"></script>\r\n");
      out.write("            <script src=\" ../Assets/vendor/datatables/dataTables.bootstrap4.min.js\"></script>\r\n");
      out.write("            <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("            <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("            <script src=\"../Assets/js/demo/datatables-demo.js\"></script>\r\n");
      out.write("            <!--<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>--> \r\n");
      out.write("            ");

                    rs.close();
                    stmt.close();
                    conn.close();
                } catch (SQLException ex) {
                    out.print("Gagal Koneksi"+ex);
                } catch (Exception ex) {
                    out.print(ex.getMessage());
                }
            
      out.write("\r\n");
      out.write("    </body>\r\n");
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
