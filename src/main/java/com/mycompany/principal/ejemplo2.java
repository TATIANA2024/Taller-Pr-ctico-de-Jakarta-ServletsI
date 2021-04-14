

package com.mycompany.principal;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet("/ejemplo2")
public class ejemplo2 extends HttpServlet {
@Override
public void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
PrintWriter out = response.getWriter();
out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Hola Marte: Powered by the Perseverance</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<strong><h1><i>Hola Marte: Powered by the Perseverance</i> </h1></strong>");
            out.println("</body>");
            out.println("</html>");
        }
    
}




