package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _01_002d01_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
  //課題1.「Hello world.」を表示してください。
    
    String talk = "Hello world.";
    

      out.write("\n");
      out.write("        ");
      out.print(talk );
      out.write("<br>\n");
      out.write("        \n");
  //課題2.「groove」「-」「gear」の３つの文字列を連結して表示してください。

            out.print("groove"+"-"+"gear");
        

      out.write("<br>\n");
      out.write("            \n");
      out.write("            \n");
  //課題3.自分の自己紹介を作成してみてください。

            out.print("浅井朋代です。");
            

      out.write("<br>\n");
      out.write("            \n");
      out.write("    \n");
  /*課題4&5.
    定数と変数を宣言し、それぞれに数値を入れて四則演算を行ってください。
    四則演算の結果をそれぞれ表示してください。*/
            
            //変数num1 定数 num2宣言
            int num1 = 7;
            final int num2 = 3;
            
            //変数 plusにnum1+num2を代入
            int plus= num1 + num2;
            //変数以外は""をつける
            out.print(num1+"+"+num2+"は、"+plus+"です。");
            
            int minus = num1 - num2;
            out.print(num1+"-"+num2+"は、"+minus+"です。");
            int kake = num1 * num2;
            out.print(num1+"×"+num2+"は、"+kake+"です。");
            int wari = num1 / num2;
            int amari = num1 % num2;
            out.print(num1+"÷"+num2+"は、"+wari+"余り"+amari+"です。");
            
            out.print(3+4);
            out.print(5*7);

      out.write("<br>\n");
      out.write("            \n");
      out.write("        \n");
      out.write("\n");
  /*課題6.
    変数を宣言し、その変数の中身によって以下の表示を行ってください。
    ⇒値が 1 なら「１です！」
    ⇒値が 2 なら「プログラミングキャンプ！」
    ⇒それ以外なら「その他です！」*/

            int a = 3;
            
            if (a == 1){
                out.print("1です。");
            }else if(a == 2){
                out.print("プログラミングキャンプ！");
            }else{
                out.print("その他です！");
            }
            

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
