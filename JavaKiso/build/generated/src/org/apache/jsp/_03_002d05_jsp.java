package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _03_002d05_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

/*課題5
戻り値としてある人物のid(数値),名前,生年月日、住所を返却するメソッドを作成し、
受け取った後はid以外の値を表示する
*/
    
   ;
    
        int getId() {
            return 99;         
        }
        String getName() {
            return "のび太";      
        }
        String getBirth(){
            return "1964年8月7日";
        }
        String getAdd() {
            return "日本";         
        }

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
      out.write("\n");
      out.write('\n');


        int id = getId();
        String name = getName();
        String birth =getBirth();
        String add =getAdd();
        
        out.println(name +birth + add);
        System.exit(id);
        
        

      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("/*\n");
      out.write(" * To change this license header, choose License Headers in Project Properties.\n");
      out.write(" * To change this template file, choose Tools | Templates\n");
      out.write(" * and open the template in the editor.\n");
      out.write(" */\n");
      out.write("package classsample;\n");
      out.write(" import java.util.*;\n");
      out.write("\n");
      out.write("/**\n");
      out.write(" *\n");
      out.write(" * @author tomoyoasai\n");
      out.write("\n");

    ArrayList<Integer> al = 
new ArrayList<Integer>();

    al.add(100); // 追加
    al.get(0); // 参照
    al.set(0, 50);	// 更新
    al.remove(0); // 要素の削除
    al.size(); // 要素数の確認　
    * 
     out.print(al.get(1));
     * 

      out.write("*/\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("           \n");
      out.write("\n");
      out.write("        \n");
      out.write("}");
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
