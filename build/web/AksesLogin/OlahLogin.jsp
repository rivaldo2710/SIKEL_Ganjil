<%-- 
    Document   : OlahLogin
    Created on : Feb 8, 2022, 10:52:53 AM
    Author     : HP
--%>

<%@page import="Models.Login"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            String Email = request.getParameter("Email");
            String Password = request.getParameter("Password");
            
            Login db = new Login();
            
            if ( Email != null && Password != null) {
                int check = db.CheckLogin(Email, Password);
                if (check > 0) {
                    
                    response.sendRedirect("succes");
                } else {
                    response.sendRedirect("Email salah");
                }
                
            }else{
                
                response.sendRedirect("Gagal");
            }  
        %>
    </body>
</html>
