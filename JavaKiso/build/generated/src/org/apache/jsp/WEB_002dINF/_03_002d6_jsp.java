package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.HashMap;

public final class _03_002d6_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            HashMap<String, String> data = new HashMap<String, String>();
            String getData(int id){
            String profile = "";

                if (id == 001) {
                    data.put("id", "001");
                    data.put("name", "名前：ロロノア・ゾロ <br>");
                    data.put("birth", "生年月日：11/11 <br>");
                    data.put("add", "住所：東の海 シモツキ村 <br><br>");
                    profile = (data.get("name") + data.get("birth") + data.get("add"));

                } else if (id == 002) {
                    data.put("id", "002");
                    data.put("name", "名前：ナミ <br>");
                    data.put("birth", "生年月日：7/3 <br>");
                    data.put("add", "住所：東の海 コノミ諸島 ココヤシ村 <br><br>");
                    profile = (data.get("name") + data.get("birth") + data.get("add"));

                } else if (id == 003) {
                    data.put("id", "003");
                    data.put("name", "名前：ウソップ <br>");
                    data.put("birth", "生年月日：4/1 <br>");
                    data.put("add", "住所：東の海 ゲッコー諸島 シロップ村 <br><br>");
                    profile = (data.get("name") + data.get("birth") + data.get("add"));
                }
                return profile;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        ");
/*引数に1つのid(数値)をとり、3人分のプロフィール(項目は課題5参照)をあらかじめメソッド内で定義しておく。
            引数のid値により戻り値として返却するプロフィールを誰のものにするか選択する。それ以降などは課題5と同じ扱いに。
        HashMapを使用*/
      out.write("\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            int id = 003;

            String profile = getData(id);
            out.println(profile);
        
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
