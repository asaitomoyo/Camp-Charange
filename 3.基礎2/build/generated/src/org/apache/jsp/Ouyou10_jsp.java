package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Ouyou10_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    ");
//課題10.簡易素因数分解のロジックを作成します。

    //クエリストリングから渡された数値を1ケタの素数で可能な限り分解し、
    //元の値と素因数分解の結果を表示するようにしてください。

    //2ケタ以上の素数が含まれた数値の場合は、
    //「元の値　1ケタの素因数　その他」と表記して、その他　に含んでください。

    
      out.write("\n");
      out.write("    ");
/*クエリストリングから渡された元の値num*/
        String num = request.getParameter("num"); 
        /*Stringからint型へ変換*/
        int org = Integer.parseInt(num);
        
        while(org != 1){
            //素数2,3,5,7
            if (org % 2 == 0){
                out.print(2);
                out.print(" ");
                org /=2;

            }else if(org % 3 == 0){
                out.print(3);
                out.print(" ");
                org /=3;

            }else if(org % 5 == 0){
                out.print(5);
                out.print(" ");
                org /= 5;

            }else if(org % 7 == 0){
                out.print(7);
                out.print(" ");
                org /= 7;

            }else{
                out.print("その他");
            }
        }
        
   //クエリストリングhttp://localhost:8084/JavaKiso2/Kisohen10.jsp?num=200

      out.write("\n");
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
