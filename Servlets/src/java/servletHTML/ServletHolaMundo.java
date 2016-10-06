 //Primer   Servlet.
//Muy   sencillo.
package servletHTML;

import java.io.*;
import javax.servlet.*;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

//@WebServlet(name = "ServletHolaMundo", urlPatterns = {"/ServletHolaMundo"})
public class ServletHolaMundo extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = new PrintWriter(res.getOutputStream());
        out.println("<!DOCTYPE html>");
        out.println("<html lang=\"es\">");
        out.println("<head>");
        out.println("<meta charset=\"utf-8\">");
        out.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
        out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
        out.println("<meta name=\"description\" content=\"\">");
        out.println("<meta name=\"author\" content=\"\">");
        out.println("<title>Hola Mundo Servlet</title>");
        out.println("<link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">");
        out.println("<link href=\"vendor/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">");
        out.println("<link href=\"https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic\" rel=\"stylesheet\" type=\"text/css\">");
        out.println("<link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\" type=\"text/css\">");
        out.println("<link href=\"css/grayscale.min.css\" rel=\"stylesheet\">");
        out.println("<body id=\"page-top\" data-spy=\"scroll\" data-target=\".navbar-fixed-top\">");
        out.println("<header class=\"intro\">");
        out.println("<div class=\"intro-body\">");
        out.println("<div class=\"container\">");
        out.println("<div class=\"row\">");
        out.println("<div class=\"col-md-8 col-md-offset-2\">");
        out.println("<h3 class=\"brand-heading\">Hola mundo desde servidor web</h3>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("</header>");
        out.println("<script src=\"js/grayscale.min.js\"></script>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

    public String getServletInfo() {
        return "Crea   una   página   HTML   que   dice   HolaMundo";
    }
}
