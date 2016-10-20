package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class popup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<link rel=\"stylesheet\" href=\"css/jquery.ui.all.css\"/>\n");
      out.write("        \n");
      out.write("\t<script src=\"js/jquery-1.10.2.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.ui.core.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.ui.widget.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.ui.mouse.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.ui.button.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.ui.draggable.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.ui.position.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.ui.resizable.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.ui.button.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.ui.dialog.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.ui.effect.js\"></script>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/demos.css\"/>\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("<!--        <script type=\"text/javascript\" src=\"js/jquery.js\" ></script>-->\n");
      out.write("<!--        <script type=\"text/javascript\" src=\"js/jquery.validate.js\" ></script>-->\n");
      out.write("<!--        <script type=\"text/javascript\" src=\"js/login.js\" ></script>-->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\t<style>\n");
      out.write("\t\tbody { font-size: 62.5%; }\n");
      out.write("\t\tlabel, input { display:block; }\n");
      out.write("\t\tinput.text { margin-bottom:12px; width:95%; padding: .4em; }\n");
      out.write("\t\tfieldset { padding:0; border:0; margin-top:25px; }\n");
      out.write("\t\th1 { font-size: 1.2em; margin: .6em 0; }\n");
      out.write("\t\t.ui-dialog .ui-state-error { padding: .3em; }\n");
      out.write("\t\t.validateTips { border: 1px solid transparent; padding: 0.3em; }\n");
      out.write("\t</style>\n");
      out.write("\t<script>\n");
      out.write("            \n");
      out.write("\t$(function() {\n");
      out.write("//            $( \"#dialog-form\" ).hide();\n");
      out.write("\t\tvar username = $( \"#username\" ),\n");
      out.write("\t\t\tcode = $( \"#code\" ),\n");
      out.write("\t\t\tpassword = $( \"#password\" ),\n");
      out.write("\t\t\tallFields = $( [] ).add( username ).add( password ).add( code ),\n");
      out.write("\t\t\ttips = $( \".validateTips\" );\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("                        \n");
      out.write("\t\t$( \"#dialog-form\" ).dialog({\n");
      out.write("\t\t\tautoOpen: false,\n");
      out.write("\t\t\theight: 320,\n");
      out.write("\t\t\twidth: 350,\n");
      out.write("\t\t\tmodal: true,\n");
      out.write("\t\t\tbuttons: {\n");
      out.write("\t\t\t\t\"登陆\": function() {\n");
      out.write("\t\t\t\t\t//var bValid = true;\n");
      out.write("\t\t\t\t\tallFields.removeClass( \"ui-state-error\" );\n");
      out.write("\t\t\t\t\t\t$(\"#login\").append(\"<p>\"+username.val()+\"登陆中。。。</p>\"\n");
      out.write("\t\t\t\t\t\t\t);\n");
      out.write("                                                $(\"logindiv\").submit();\n");
      out.write("                                                //window.location=\"login/loginCheck\";\n");
      out.write("\t\t\t\t\t\t$( this ).dialog( \"close\" );\n");
      out.write("                                                $(\"#loginbutton\").hide();\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\t\"注册\": function() {\n");
      out.write("\t\t\t\t\t$( this ).dialog( \"close\" );\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tclose: function() {\n");
      out.write("\t\t\t\tallFields.val( \"\" ).removeClass( \"ui-state-error\" );\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t$( \"#loginbutton\" )\n");
      out.write("\t\t\t.button()\n");
      out.write("\t\t\t.click(function() {\n");
      out.write("//                             $( \"#dialog-form\" ).show();\n");
      out.write("\t\t\t\t$( \"#dialog-form\" ).dialog( \"open\" );\n");
      out.write("\t\t\t});\n");
      out.write("\t});\n");
      out.write("\t</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div id=\"dialog-form\" title=\"欢迎登陆\">\n");
      out.write("\t<form id=\"logindiv\" action=\"");
      out.print( request.getContextPath());
      out.write("/login/ImageServlet\" method=\"post\">\n");
      out.write("\t<fieldset>\n");
      out.write("\t\t<label for=\"username\">用户名</label>\n");
      out.write("\t\t<input type=\"text\" name=\"username\" id=\"username\" class=\"text ui-widget-content ui-corner-all\" />\n");
      out.write("\t\t<label for=\"password\">密码</label>\n");
      out.write("\t\t<input type=\"password\" name=\"password\" id=\"password\" value=\"\" class=\"text ui-widget-content ui-corner-all\" />\n");
      out.write("\t\t<label for=\"randomCode\">验证码</label>\n");
      out.write("\t\t<input type=\"text\" name=\"randomCode\" id=\"randomCode\" value=\"\" class=\"text ui-widget-content ui-corner-all\" />\n");
      out.write("                <img title=\"看不清，换一个\" onclick=\"javascript:window.top.location.reload()\" name=\"randomCodeImage\"  id=\"randomCodeImage\" src=\"");
      out.print( request.getContextPath());
      out.write("/login/ImageServlet\"/>\n");
      out.write("\t</fieldset>\n");
      out.write("\t</form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<button id=\"loginbutton\">登陆()</button>\n");
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
