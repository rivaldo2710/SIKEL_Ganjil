package org.apache.jsp.konfirmasi_0020Pengajuan;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class confirm_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String id = request.getParameter("id");
    String status = request.getParameter("status");
    out.print(status);
    String komentar = request.getParameter("komentar")+" ";
    String nama = request.getParameter("nama");
    String id_ail = request.getParameter("id_ail");
    String nopengajuan = id + "-" + request.getParameter("nama");
    String id_notifikasi = null ;
    String host = "jdbc:mysql://localhost:3306/sikel_db";

    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(host, "root", "");
        if (conn != null) {
            if (id != null) {
                if (status.equalsIgnoreCase("terima")) {
                    PreparedStatement pst = conn.prepareStatement("update form_pengajuan set status='terima' where id='" + id + "'");
                    PreparedStatement pst2 = conn.prepareStatement("INSERT INTO notifikasi values(?,?,?,?,?,?)");
                    pst.executeUpdate();
                    status = "terima";
                    pst2.setString(1, id_notifikasi);
                    pst2.setString(2, id_ail);
                    pst2.setString(3, nama);
                    pst2.setString(4, nopengajuan);
                    pst2.setString(5, status);
                    pst2.setString(6, komentar);
                    pst2.executeUpdate();
                    pst.close();
                    pst2.close();
                } else if (status.equalsIgnoreCase("tolak")) {
                    PreparedStatement pst = conn.prepareStatement("update form_pengajuan set status='tolak' where id='" + id + "'");
                    PreparedStatement pst2 = conn.prepareStatement("INSERT INTO notifikasi values(?,?,?,?,?,?)");
                    pst.executeUpdate();
                    status = "tolak";
                    pst2.setString(1, id_notifikasi);
                    pst2.setString(2, id_ail);
                    pst2.setString(3, nama);
                    pst2.setString(4, nopengajuan);
                    pst2.setString(5, status);
                    pst2.setString(6, komentar);
                    pst2.executeUpdate();
                    pst.close();
                    pst2.close();
                }
                response.sendRedirect("view_Konfirmasi.jsp");
            }
        } else {
            response.sendRedirect("view_Konfirmasi.jsp");
        }
    } catch (SQLException ex) {
        out.print("Gagal Koneksi"+ex);
    } catch (Exception ex) {
        out.println("gagal");
        out.print(ex.getMessage());
    }

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
