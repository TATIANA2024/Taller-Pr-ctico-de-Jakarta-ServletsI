
package com.mycompany.principal;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

 @WebServlet("/ejemplo4")
public class ejemplo4 extends HttpServlet{
     
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        System.out.println("Imprimiendo HTML");
        out.println("<!DOCTYPE html>");
        out.print("<html lang='es'>");
        out.print("<head>");
        out.print("<title>Spring MVC</title>");
        out.print("<style>"+ ".texto{background-color: #39636B ;}+" + "</style>");
        out.print("<script>" + "function cambiarTexto(){" + " document.getElementById('texto').innerHTML ='<p>Ayuda a construir aplicaciones basadas en la Web que sean flexibles y desvinculado de las tecnologías de vista subyacentes.</p>';}"+
                "</script>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1 aling=center>Spring MVC</h1>");
        out.print("<div id='texto'></div>");
        out.print("<p><button onclick='cambiarTexto();'>Presióname para mostrar texto</button></p>");
        out.print("</body>");
        out.print("</html>");

    }
}