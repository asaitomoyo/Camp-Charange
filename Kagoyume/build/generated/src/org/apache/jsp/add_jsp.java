package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.UserDataBeans;
import model.KagoyumeHelper;
import java.util.ArrayList;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
    
    HttpSession hs = request.getSession();
    KagoyumeHelper kh = KagoyumeHelper.getInstance();

    //ログインチェック
    boolean login = false;
    UserDataBeans udb = (UserDataBeans) hs.getAttribute("udb");
    if (udb != null) {
        login = true;
    }


      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>カートに追加ページ</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 if(login){ 
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            <p>ようこそ<a href=\"MyData\">");
      out.print(udb.getName());
      out.write("</a>さん！</p>      \n");
      out.write("            ");
      out.print(kh.logout());
      out.write("<br>\n");
      out.write("            ");
      out.print(kh.cart());
      out.write("<br>\n");
      out.write("            ");
      out.write("\n");
      out.write("        ");
 }else{ 
      out.write("\n");
      out.write("            ");
      out.print( kh.login());
      out.write("<br>\n");
      out.write("        ");
 }
      out.write("\n");
      out.write("        \n");
      out.write("        カートに追加しました。\n");
      out.write("        <br><br>\n");
      out.write("        \n");
      out.write("        ");
      out.print( kh.top() );
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
