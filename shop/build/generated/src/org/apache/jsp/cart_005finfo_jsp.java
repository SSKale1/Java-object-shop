package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class cart_005finfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
 Class.forName("org.apache.derby.jdbc.ClientDriver"); 
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<HTML>\n");
      out.write("       <HEAD>\n");
      out.write("       <TITLE>Cart</TITLE>\n");
      out.write("       <link rel=\"stylesheet\" href=\"style2.css\" media=\"screen\" type=\"text/css\" />\n");
      out.write("       <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css\" integrity=\"sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l\" crossorigin=\"anonymous\"></HEAD>\n");
      out.write("       <BODY bgcolor=\"cyan\">\n");
      out.write("           <style>\n");
      out.write("               .new{width:50%;color:black;font-family: serif;font-size: 4;font-weight: normal;\n");
      out.write("               }\n");
      out.write("               h1{\n");
      out.write("                   color:cyan;\n");
      out.write("               }\n");
      out.write("               </style>\n");
      out.write("       <center>\n");
      out.write("           <H1><b>YOUR CART<b></H1>\n");
      out.write("       ");

           Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/grocery","grocery","grocery");
           Statement statement = connection.createStatement() ;
          ResultSet resultset = statement.executeQuery("select * from cart") ;
       
      out.write("\n");
      out.write("       <TABLE BORDER=\"1\" class=\"table table-dark  new\">\n");
      out.write("           \n");
      out.write("      <TR>\n");
      out.write("      <TH class=\"table-success\">Item</TH>\n");
      out.write("      <TH class=\"table-success\">Quantity</TH>\n");
      out.write("      <TH class=\"table-success\">Price</TH>\n");
      out.write("      <TH class=\"table-success\">Amount</TH>\n");
      out.write("      </TR>\n");
      out.write("      ");
 while(resultset.next()){ 
      out.write("\n");
      out.write("      <TR>\n");
      out.write("       <TD class=\"table-primary\"> ");
      out.print( resultset.getString(1) );
      out.write("</td>\n");
      out.write("       <TD class=\"table-primary\"> ");
      out.print( resultset.getString(2) );
      out.write("</TD>\n");
      out.write("       <TD class=\"table-primary\"> ");
      out.print( resultset.getString(3) );
      out.write("</TD>\n");
      out.write("       <TD class=\"table-primary\"> ");
      out.print( resultset.getString(4) );
      out.write("</TD>       \n");
      out.write("       </TR>\n");
      out.write("      ");
 } 
      out.write("\n");
      out.write("     </TABLE> \t\t\n");
      out.write("\t\t<form id=\"shopping-cart\" action=\"delete\" method=\"post\">\t\n");
      out.write("                    <input type=\"submit\" name=\"delete\" id=\"empty-cart\" class=\"btn btn-outline-secondary\" value=\"Empty Cart\" />\n");
      out.write("                </form>\t\n");
      out.write("\t\t\t\t\n");
      out.write("                <a href=\"HomePage.jsp\" class=\"btn\">Continue Shopping</a>\n");
      out.write("\t\t<a href=\"bill.jsp\" class=\"btn\">Go To Checkout</a>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("                       \n");
      out.write("       </center>\n");
      out.write("     </BODY>\n");
      out.write("</HTML>\n");
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
