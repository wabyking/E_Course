package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navigation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            .active{\n");
      out.write("                padding: 10px,10px,10px,10px;\n");
      out.write("                color: red;\n");
      out.write("            }\n");
      out.write("        </style>>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function() {\n");
      out.write("                $(\".nav a\").each(function() {\n");
      out.write("                    $(this).click(function() {\n");
      out.write("                        $(\".nav .active\").removeClass(\"active\");\n");
      out.write("                        $(this).addClass(\"active\");\n");
      out.write("                        return false;//防止页面跳转  \n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("//$(document).ready(function(){  \n");
      out.write("//    $(\".nav a\").each(function(){  \n");
      out.write("//        $this = $(this);  \n");
      out.write("//        if($this[0].href==String(window.location)){  \n");
      out.write("//            $this.addClass(\"hover\");  \n");
      out.write("//        }  \n");
      out.write("//    });  \n");
      out.write("//});  \n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"topnav\"  class=\"nav\">\n");
      out.write("            <ul id=\"navul\">\n");
      out.write("                <li ><a href=\"main.jsp\"  class=\"active\">首  页</a></li>\n");
      out.write("                <!--        class=\"active\"-->\n");
      out.write("                <li><a href=\"#\">教学公告</a></li>\n");
      out.write("                <li><a href=\"#\">课程简介</a></li>\n");
      out.write("                <li><a href=\"#\">师资力量</a></li>\n");
      out.write("                <li><a href=\"#\">教学内容</a></li>\n");
      out.write("                <li><a href=\"#\">教学资料</a></li>\n");
      out.write("                <li><a href=\"#\">申报材料</a></li>\n");
      out.write("                <li><a href=\"#.html\">作业管理</a></li>\n");
      out.write("                <li><a href=\"vedio.jsp\">教学录像</a></li>\n");
      out.write("                <li class=\"last\"><a href=\"#\">在线交流</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
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
