package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class content_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- ####################################################################################################### -->\n");
      out.write("<div class=\"wrapper row2\">\n");
      out.write("  <div id=\"hpage_featured\" class=\"clear\">\n");
      out.write("    <!-- ####################################################################################################### -->\n");
      out.write("    <div id=\"featured_slide\">\n");
      out.write("      <ul>\n");
      out.write("        <li><img src=\"images/1.jpg\" alt=\"\" />\n");
      out.write("          <div class=\"panel-overlay\">\n");
      out.write("            <h2>Nullamlacus dui ipsum</h2>\n");
      out.write("            <p>Temperinte interdum sempus odio urna eget curabitur semper convallis nunc laoreet. <a href=\"#\">Continue Reading &raquo;</a></p>\n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("        <li><img src=\"images/2.jpg\" alt=\"\" /></li>\n");
      out.write("        <li><img src=\"images/3.jpg\" alt=\"\" />\n");
      out.write("          <div class=\"panel-overlay\">\n");
      out.write("            <h2>Semvelit nonummy odio tempus</h2>\n");
      out.write("            <p>Justolacus eger at pede felit in dictum sempus elit curabitur ipsum. Ametpellentum. <a href=\"#\">Continue Reading &raquo;</a></p>\n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("        <li><img src=\"images/4.jpg\" alt=\"\" />\n");
      out.write("          <div class=\"panel-overlay\">\n");
      out.write("            <h2>Pedefamet orci orci quisque</h2>\n");
      out.write("            <p>Nonnam aenenasce morbi liberos malesuada risus id donec volutpat estibulum curabitae. <a href=\"#\">Continue Reading &raquo;</a></p>\n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <!-- ###### -->\n");
      out.write("    <div class=\"intro clear\">\n");
      out.write("      <div class=\"welcome clear\"><img class=\"imgl\" src=\"images/5.jpg\" alt=\"\" />\n");
      out.write("        <div class=\"fl_right\">\n");
      out.write("          <h2>塑料橡胶成型加工精品课程</h2>\n");
      out.write("          <p>Morbit incidunt maurisque eros molest nunc anteget sed vel lacus mus semper. Anter dumnullam interdum eros dui urna consequam ac nisl nullam ligula vestassa condimen tumfelis.</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"popular\">\n");
      out.write("        <h2>公告</h2>\n");
      out.write("        <ul class=\"clear\">\n");
      out.write("          <li><a href=\"#\">&raquo; Visiting the University</a></li>\n");
      out.write("          <li><a href=\"#\">&raquo; Undergraduate Courses</a></li>\n");
      out.write("          <li><a href=\"#\">&raquo; Graduate Courses</a></li>\n");
      out.write("          <li><a href=\"#\">&raquo; Postgraduate Research</a></li>\n");
      out.write("          <li><a href=\"#\">&raquo; Postgraduate Taught</a></li>\n");
      out.write("          <li><a href=\"#\">&raquo; International Students</a></li>\n");
      out.write("          <li><a href=\"#\">&raquo; Lifelong Learning</a></li>\n");
      out.write("          <li><a href=\"#\">&raquo; Graduate Health Services</a></li>\n");
      out.write("\n");
      out.write("          <li><a href=\"#\">&raquo; Visiting the University</a></li>\n");
      out.write("          <li><a href=\"#\">&raquo; Undergraduate Courses</a></li>\n");
      out.write("          <li><a href=\"#\">&raquo; Graduate Courses</a></li>\n");
      out.write("          <li><a href=\"#\">&raquo; Postgraduate Research</a></li>\n");
      out.write("          <li><a href=\"#\">&raquo; Postgraduate Taught</a></li>\n");
      out.write("          <li><a href=\"#\">&raquo; International Students</a></li>\n");
      out.write("          <li><a href=\"#\">&raquo; Lifelong Learning</a></li>\n");
      out.write("          <li><a href=\"#\">&raquo; Graduate Health Services</a></li>\n");
      out.write("                    \n");
      out.write("          \n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- ####################################################################################################### -->\n");
      out.write("  </div>\n");
      out.write("</div>\n");
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
