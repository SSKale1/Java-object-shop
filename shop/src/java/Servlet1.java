import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Servlet1 extends HttpServlet {
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        if(LoginDao.checkUser(email, password))
        {
            RequestDispatcher rs = request.getRequestDispatcher("HomePage.jsp");
            rs.forward(request, response);
        }
        else
        {
           out.println("<center><h1 color=red>Username or Password incorrect</h1></center>");
           RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
           rs.include(request, response);
        }
    }  
}