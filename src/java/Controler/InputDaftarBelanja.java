/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Config.Database;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nocty
 */
@WebServlet(name = "InputDaftarBelanja", urlPatterns = {"/DaftarBelanja/input-belanja"})
public class InputDaftarBelanja extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet InputDaftarBelanja</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet InputDaftarBelanja at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        new Database("projek_sistemkeuanganlab", "root", "");
        String nama_barang = request.getParameter("nama_barang"),
            jumlah_barang = request.getParameter("jumlah_barang"),
            harga_per_unit = request.getParameter("harga_per_unit"),
            tanggal_pembelian = request.getParameter("tanggal_pembelian"),
            id_lab = request.getParameter("LAB"),
            id_ail = request.getParameter("AIL"),
            id_supplier = request.getParameter("supplier"),
        query = "insert into pembelian values (" + null + ", '" + id_supplier + "', '"
                + id_ail + "', '" 
                + id_lab + "', '" 
                + nama_barang + "', '" 
                + jumlah_barang + "', '" 
                + harga_per_unit + "', '" 
                + tanggal_pembelian + "', '0')";
        
        System.out.println(query);
        
        PrintWriter out = response.getWriter();
        if(Database.saveQuery(query, Database.connection)) {
            response.sendRedirect(request.getContextPath() + "/DaftarBelanja");
        }else {
            out.println("Something went wrong!");
        }
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
