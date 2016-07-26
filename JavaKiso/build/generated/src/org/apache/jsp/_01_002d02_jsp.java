package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _01_002d02_jsp extends org.apache.jasper.runtime.HttpJspBase
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
/*応用編 課題７.クエリストリング(情報を送る)を利用して、以下の処理を実現してください。
    スーパーのレジでレシートを作る仕組みを作成します。
    クエリストリングで総額・個数・商品種別を受け取って処理します。

    ①商品種別は、３つ。１：雑貨、２：生鮮食品、３：その他 商品種別を表示してください。
    ②総額と個数から１個当たりの値段を算出してください。
    総額と１個当たりの値段を表示してください。*/

      out.write("\n");
      out.write("\n");
      out.write("        \n");


    String classification = request.getParameter("classification");
    String total = request.getParameter("total");
    String piece = request.getParameter("piece");
    
    //int型に変換
    int finalClassification = Integer.parseInt(classification);
    int finalTotal = Integer.parseInt(total);
    int finalPiece  = Integer.parseInt(piece);

    out.print("種別:");
    out.print(finalClassification + "<br>");    
    
    int perPrice = 0;
    perPrice =  finalTotal / finalPiece ;
    
    out.print("１個当たりの値段:");
    out.print(perPrice + "<br>");
    
    //③3000円以上購入で4%、5000円以上購入で5%のポイントが付きます。
    //購入額に応じたポイントの表示を行ってください。
    
    out.print("ポイント数:");
    
    double point = 0;
    
    if (finalTotal >= 3000){
        point = finalTotal * 0.04 ;  
        out.println (point);
        
    }else if (finalTotal >= 5000) {
        point = finalTotal * 0.05 ;
        out.print (point);
        
    } else {
        
    }


      out.write('\n');

    //クエリストリング
    //http://localhost:8084/javaKiso/01-02.jsp?classification=3&total=10000&piece=5

      out.write("\n");
      out.write("        \n");
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
