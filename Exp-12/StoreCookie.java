import java.io.*;
import java.util.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;

class StoreCookie extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        Cookie nameUser = new Cookie("username", "Rahul Gedela");
        Cookie emailUser = new Cookie("email", "rahulgedela.shopping@gmail.com");

        nameUser.setMaxAge(7 * 24 * 60 * 60);
        emailUser.setMaxAge(7 * 24 * 60 * 60);

        response.addCookie(nameUser);
        response.addCookie(emailUser);

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h2>Cookies have been set successfully</h2>");
        out.println("</body>");
        out.println("</html>");
    }
}
