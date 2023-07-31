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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Online Oxygen Cylinder Management System Version 1.0</title>\n");
      out.write("        <!--meta tags -->\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"keywords\" content=\"Cargoes Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("        <script>\n");
      out.write("            addEventListener(\"load\", function () {\n");
      out.write("                setTimeout(hideURLbar, 0);\n");
      out.write("            }, false);\n");
      out.write("\n");
      out.write("            function hideURLbar() {\n");
      out.write("                window.scrollTo(0, 1);\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <!--//meta tags ends here-->\n");
      out.write("        <!--booststrap-->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("        <!--//booststrap end-->\n");
      out.write("        <!-- font-awesome icons -->\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- //font-awesome icons -->\n");
      out.write("        <!--stylesheets-->\n");
      out.write("        <link href=\"css/style.css\" rel='stylesheet' type='text/css' media=\"all\">\n");
      out.write("        <!--//stylesheets-->\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Fira+Sans:400,500,600,700\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Source+Sans+Pro:400,600\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"main-top\" id=\"home\">\n");
      out.write("            <!-- header -->\n");
      out.write("            <header>\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"header d-md-flex justify-content-between py-3 pl-2\">\n");
      out.write("                        <!-- logo -->\n");
      out.write("                        <div id=\"logo\">\n");
      out.write("                            <h1>\n");
      out.write("                                <a>Oxygen</a>\n");
      out.write("                            </h1>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- //logo -->\n");
      out.write("                        <!-- nav -->\n");
      out.write("                        <div class=\"nav_main\">\n");
      out.write("                            <nav>\n");
      out.write("                                <label for=\"drop\" class=\"toggle\">Menu</label>\n");
      out.write("                                <input type=\"checkbox\" id=\"drop\" />\n");
      out.write("                                <ul class=\"menu\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"index.jsp\" class=\"active nav-style\">Home</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"User_login.jsp\" class=\"nav-style\">User</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"Hospital_login.jsp\" class=\"nav-style\">Hospital</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"Supplier_login.jsp\" class=\"nav-style\">Oxygen Supplier</a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </nav>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- //nav -->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("            <!-- //header -->\n");
      out.write("            <!-- banner -->\n");
      out.write("            <div class=\"main-banner\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-6\">\n");
      out.write("                            <div class=\"style-banner \">\n");
      out.write("                                <br><br><br>\n");
      out.write("                                <h4 class=\"mb-2\">Online Oxygen Cylinder Management System Version 1.0</h4>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-6 left-banner\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- //banner -->\n");
      out.write("        <!-- about -->\n");
      out.write("        <!-- footer -->\n");
      out.write("        <footer class=\"py-lg-4 py-3\">\n");
      out.write("            <div class=\"bottom-footer text-center\">\n");
      out.write("                <p>\n");
      out.write("                    © 2021\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
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
