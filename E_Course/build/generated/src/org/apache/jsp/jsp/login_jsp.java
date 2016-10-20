package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html lang=\"en\"  xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<title>jQuery UI Dialog - Modal form</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../css/jquery.ui.all.css\">\n");
      out.write("\t<script src=\"../js/jquery-1.10.2.js\"></script>\n");
      out.write("\t<script src=\"../js/jquery.ui.core.js\"></script>\n");
      out.write("\t<script src=\"../js/jquery.ui.widget.js\"></script>\n");
      out.write("\t<script src=\"../js/jquery.ui.mouse.js\"></script>\n");
      out.write("\t<script src=\"../js/jquery.ui.button.js\"></script>\n");
      out.write("\t<script src=\"../js/jquery.ui.draggable.js\"></script>\n");
      out.write("\t<script src=\"../js/jquery.ui.position.js\"></script>\n");
      out.write("\t<script src=\"../js/jquery.ui.resizable.js\"></script>\n");
      out.write("\t<script src=\"../js/jquery.ui.button.js\"></script>\n");
      out.write("\t<script src=\"../js/jquery.ui.dialog.js\"></script>\n");
      out.write("\t<script src=\"../js/jquery.ui.effect.js\"></script>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../css/demos.css\"/>\n");
      out.write("\t<style>\n");
      out.write("\t\tbody { font-size: 62.5%; }\n");
      out.write("\t\tlabel, input { display:block; }\n");
      out.write("\t\tinput.text { margin-bottom:12px; width:95%; padding: .4em; }\n");
      out.write("\t\tfieldset { padding:0; border:0; margin-top:25px; }\n");
      out.write("\t\th1 { font-size: 1.2em; margin: .6em 0; }\n");
      out.write("\t\tdiv#users-contain { width: 350px; margin: 20px 0; }\n");
      out.write("\t\tdiv#users-contain table { margin: 1em 0; border-collapse: collapse; width: 100%; }\n");
      out.write("\t\tdiv#users-contain table td, div#users-contain table th { border: 1px solid #eee; padding: .6em 10px; text-align: left; }\n");
      out.write("\t\t.ui-dialog .ui-state-error { padding: .3em; }\n");
      out.write("\t\t.validateTips { border: 1px solid transparent; padding: 0.3em; }\n");
      out.write("\t</style>\n");
      out.write("\t<script>\n");
      out.write("\t$(function() {\n");
      out.write("\t\tvar name = $( \"#name\" ),\n");
      out.write("\t\t\temail = $( \"#email\" ),\n");
      out.write("\t\t\tpassword = $( \"#password\" ),\n");
      out.write("\t\t\tallFields = $( [] ).add( name ).add( email ).add( password ),\n");
      out.write("\t\t\ttips = $( \".validateTips\" );\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t\t$( \"#dialog-form\" ).dialog({\n");
      out.write("\t\t\tautoOpen: false,\n");
      out.write("\t\t\theight: 300,\n");
      out.write("\t\t\twidth: 350,\n");
      out.write("\t\t\tmodal: true,\n");
      out.write("\t\t\tbuttons: {\n");
      out.write("\t\t\t\t\"login\": function() {\n");
      out.write("\t\t\t\t\t//var bValid = true;\n");
      out.write("\t\t\t\t\tallFields.removeClass( \"ui-state-error\" );\n");
      out.write("\t\t\t\t\t\t$(\"#login\").append(\"<p>登陆中。。。</p>\"\n");
      out.write("\t\t\t\t\t\t\t);\n");
      out.write("\t\t\t\t\t\t$( this ).dialog( \"close\" );\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\tCancel: function() {\n");
      out.write("\t\t\t\t\t$( this ).dialog( \"close\" );\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tclose: function() {\n");
      out.write("\t\t\t\tallFields.val( \"\" ).removeClass( \"ui-state-error\" );\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t$( \"#create-user\" )\n");
      out.write("\t\t\t.button()\n");
      out.write("\t\t\t.click(function() {\n");
      out.write("\t\t\t\t$( \"#dialog-form\" ).dialog( \"open\" );\n");
      out.write("\t\t\t});\n");
      out.write("\t});\n");
      out.write("\t</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div id=\"dialog-form\" title=\"Create new user\">\n");
      out.write("\t<form>\n");
      out.write("\t<fieldset>\n");
      out.write("\t\t<label for=\"username\">用户名</label>\n");
      out.write("\t\t<input type=\"text\" name=\"username\" id=\"username\" class=\"text ui-widget-content ui-corner-all\" />\n");
      out.write("\t\t<label for=\"password\">密码</label>\n");
      out.write("\t\t<input type=\"password\" name=\"password\" id=\"password\" value=\"\" class=\"text ui-widget-content ui-corner-all\" />\n");
      out.write("\t\t<label for=\"code\">验证码</label>\n");
      out.write("\t\t<input type=\"text\" name=\"code\" id=\"code\" value=\"\" class=\"text ui-widget-content ui-corner-all\" />\n");
      out.write("\t</fieldset>\n");
      out.write("\t</form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<button id=\"create-user\">登陆</button>\n");
      out.write("\n");
      out.write("<div id=\"login\">\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
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
