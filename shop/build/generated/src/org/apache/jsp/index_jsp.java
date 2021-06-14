package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("     <title>Login Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"https://i.pinimg.com/originals/16/e5/ed/16e5edf86a58f0455a3df243fcf3cc40.jpg\">\n");
      out.write("        \n");
      out.write("       \n");
      out.write("            <div class=\"col-lg-5 new\">\n");
      out.write("                \n");
      out.write("                <div class=\"card2 card border-0 px-4 py-5\">\n");
      out.write("                     <h1><b><font color=\"gray\">E-Furniture</font><b></h1>\n");
      out.write("                    <div class=\"row mb-4 px-3\">\n");
      out.write("                        <h3 class=\"mb-0 mr-4 mt-2\"><b>Sign in <b></h3>\n");
      out.write("                     \n");
      out.write("                    </div>\n");
      out.write("                                 \n");
      out.write("                    <form action=\"Servlet1\" method=\"post\" class=\"form1\">            \n");
      out.write("                                 \n");
      out.write("                    <div class=\"row px-3\"> <label class=\"mb-1\"><h6 class=\"mb-0 text-sm\">Email Address</h6>\n");
      out.write("                            \n");
      out.write("                        </label> <input class=\"mb-4\" type=\"text\" name=\"email\" placeholder=\"Enter a valid email address\" required> </div>\n");
      out.write("                        \n");
      out.write("                    <div class=\"row px-3\"> <label class=\"mb-1\"><h6 class=\"mb-0 text-sm\">Password</h6>\n");
      out.write("                            \n");
      out.write("                        </label> <input type=\"password\" name=\"password\" placeholder=\"Enter password\" required> </div>\n");
      out.write("                        \n");
      out.write("                   <br><br>\n");
      out.write("                   \n");
      out.write("                    <div class=\"row mb-3 px-3\"> <button type=\"submit\" class=\"btn btn-blue text-center\">Login</button> </div>\n");
      out.write("                    \n");
      out.write("                    </form>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <div class=\"row mb-4 px-3\"> <small class=\"font-weight-bold\">Don't have an account?<a href=\"signup.jsp\" class=\"text-danger\">Register</a></small> </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"bg-blue py-4\">\n");
      out.write("                <div class=\"social-contact ml-4 ml-sm-auto\"> <span class=\"fa fa-facebook mr-4 text-sm\"></span> <span class=\"fa fa-google-plus mr-4 text-sm\"></span> <span class=\"fa fa-linkedin mr-4 text-sm\"></span> <span class=\"fa fa-twitter mr-4 mr-sm-5 text-sm\"></span> </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
