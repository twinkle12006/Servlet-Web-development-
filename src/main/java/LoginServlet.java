import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class LoginServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        // Get parameters from request
        String uname = req.getParameter("uname");
        String pass = req.getParameter("pass");

        // Simple validation
        if ("admin".equals(uname) && "1234".equals(pass)) {
            out.println("<h2>Login Successful!</h2>");
            out.println("<p>Welcome, " + uname + "!</p>");
        } else {
            out.println("<h2>Invalid Username or Password!</h2>");
        }

        out.close();
    }
}
