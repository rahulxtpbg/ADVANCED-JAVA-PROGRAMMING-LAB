import java.io.*;
import java.util.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;

class RetrieveCookie extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        Cookie[] cookies = request.getCookies();

        String username = "";
        String email = "";

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("username")) {
                    username = cookie.getValue();
                } else if (cookie.getName().equals("email")) {
                    email = cookie.getValue();
                }
            }
        }

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h2>Retrieving from cookies</h2>");
        out.println("<h3>Username:" + username + "</h3>");
        out.println("<h3>Email:" + email + "</h3>");
        out.println("</body>");
        out.println("</html>");
    }
}
