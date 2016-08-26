package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.UserDataBeans;
import java.util.ArrayList;
import model.KagoyumeHelper;

public final class registrationconfirm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write('\n');
  
    HttpSession hs = request.getSession();
    UserDataBeans udb = (UserDataBeans)hs.getAttribute("udb");
    //空文字だった場合にchkListにString型の"name"が入る
    ArrayList<String> chkList = udb.chkproperties();
    
    KagoyumeHelper kh = KagoyumeHelper.getInstance();

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>新規会員登録確認ページ</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    ");
      out.write("\n");
      out.write("    ");
 if(chkList.size()==0){ 
      out.write("\n");
      out.write("        <h1>登録確認</h1>\n");
      out.write("        ユーザー名:");
      out.print( udb.getName());
      out.write("<br>\n");
      out.write("        パスワード:");
      out.print( udb.getPassword());
      out.write("<br>\n");
      out.write("        メールアドレス:");
      out.print( udb.getMail());
      out.write("<br>\n");
      out.write("        住所:");
      out.print( udb.getAddress());
      out.write("<br>\n");
      out.write("    上記の内容で登録いたします。よろしいですか？\n");
      out.write("        <form action=\"registrationComplete\" method=\"POST\">\n");
      out.write("            <input type = \"submit\" name=\"yes\" value=\"はい\">\n");
      out.write("            //アクセスルートチェック\n");
      out.write("        </form>>\n");
      out.write("        \n");
      out.write("    ");
 }else{ 
      out.write("\n");
      out.write("        <h1>入力が不完全です。</h1>\n");
      out.write("        ");
      out.print(kh.chkinput(chkList));
      out.write("\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("        <form action=\"registration\" method=\"POST\">\n");
      out.write("            <input type = \"submit\" name=\"no\" value=\"登録画面に戻る\">\n");
      out.write("            <input type = \"hidden\" name=\"re\" value=\"REINPUT\">\n");
      out.write("        </form>\n");
      out.write("        ");
      out.print(kh.top());
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
