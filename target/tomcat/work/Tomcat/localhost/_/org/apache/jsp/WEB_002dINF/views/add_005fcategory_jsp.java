/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-08-28 08:39:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_005fcategory_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\r\n");
      out.write(" <head>\r\n");
      out.write("  <title>Yahoo!!</title>\r\n");
      out.write("  <!-- Bootstrap core CSS -->\r\n");
      out.write("<link href=\"webjars/bootstrap/3.3.6/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\t<style>\r\n");
      out.write("\t.footer {\r\n");
      out.write("\t\tposition: absolute;\r\n");
      out.write("\t\tbottom: 0;\r\n");
      out.write("\t\twidth: 100%;\r\n");
      out.write("\t\theight: 60px;\r\n");
      out.write("\t\tbackground-color: #f5f5f5;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("\t\r\n");
      out.write("  </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    \r\n");
      out.write("     <nav class=\"navbar navbar-default\">\r\n");
      out.write("\r\n");
      out.write("\t\t<a href=\"/welcome.ca\" class=\"navbar-brand\">HOmee</a>\r\n");
      out.write("        <ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t<li class=\"active\"><a href=\"/addcategory.ca\">category</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"/addproduct.ca\">product</a></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("        <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("        <li><a href=\"/Signup.ca\">signup</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"/Login.ca\">Login</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t</nav>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("    \r\n");
      out.write("   <H1>Welcome </H2>\r\n");
      out.write("      <p><font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errorMessage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</font></p>\r\n");
      out.write("\t<form action=\"/Signup.ca\" method=\"POST\">\r\n");
      out.write("\t\tcategory name : <input name=\"cat_name\" type=\"text\" /> \r\n");
      out.write("\t\t category  description : <input name=\"cat_des\" type=\"text\"/>\r\n");
      out.write("\t\t  <input type=\"submit\" value=\"add category\">\r\n");
      out.write("\t</form>\r\n");
      out.write("   signup page\r\n");
      out.write("\r\n");
      out.write("   </div>\r\n");
      out.write("   </div>\r\n");
      out.write("   <footer class=\"footer\">\r\n");
      out.write("\t\t<div>footer content</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\r\n");
      out.write("   <script src=\"webjars/jquery/1.9.1/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"webjars/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\r\n");
      out.write("   \r\n");
      out.write(" </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
