package org.apache.jsp.org_camp_jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Scanner;
import java.io.FileWriter;
import java.util.Date;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

public final class deta10_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

         File txt = new File("/Users/tomoyoasai/NetBeansProjects/JavaStandard/web/org.camp.jsp");//ログファイル指定
            FileWriter fw = new FileWriter(txt,true);//ログファイルに追加書き足し
            BufferedReader br = new BufferedReader(new FileReader(txt));//まとめて書き込む
            //開始時刻の記入
            Date start = new Date();
            Date end = new Date();
            fw.write("開始" + start);

            Scanner scanner = new Scanner(System.in);
            System.out.print("名前の入力");
            String userName = scanner.next();
            System.out.println("こんにちは" + userName);
            
            
            //ログファイルの大きさを表示
            System.out.println((int) txt.length());
            //終了日時を書き込む
            fw.write("終了"+ end );
            //ログ内容の表示
            String str =br.readLine();
            while(str != null){
               System.out.println(str);
               str = br.readLine();
            }
            //書き込みの終了
            fw.close();;
            br.close();        
        
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
