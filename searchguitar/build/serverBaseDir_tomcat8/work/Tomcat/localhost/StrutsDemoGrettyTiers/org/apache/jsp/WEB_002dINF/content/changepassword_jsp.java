/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2016-06-28 13:57:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class changepassword_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Register</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Exo+2' rel='stylesheet' type='text/css'>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery1.min.js\"></script>\r\n");
      out.write("<!-- start menu -->\r\n");
      out.write("<link href=\"css/megamenu.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/megamenu.js\"></script>\r\n");
      out.write("<script>$(document).ready(function(){$(\".megamenu\").megamenu();});</script>\r\n");
      out.write("<script src=\"js/jquery.easydropdown.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body> \r\n");
      out.write("\t<div class=\"header-top\">\r\n");
      out.write("\t\t\t<div class=\"wrap\">\r\n");
      out.write("\t\t\t  <div class=\"cssmenu\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"index\">主页</a></li> \r\n");
      out.write("\t\t\t\t\t|\r\n");
      out.write("\t\t\t\t\t<li><a href=\"checkout.html\">购物车</a></li> \r\n");
      out.write("\t\t\t\t\t|\r\n");
      out.write("\t\t\t\t\t<li><a href=\"checkout.html\">支付</a></li> \r\n");
      out.write("\t\t\t\t\t|\r\n");
      out.write("\t\t\t\t\t<li><a href=\"loginform1\">登录</a></li> \r\n");
      out.write("\t\t\t\t\t|\r\n");
      out.write("\t\t\t\t\t<li><a href=\"register.html\">退出</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clear\"></div>\r\n");
      out.write(" \t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t <div class=\"header-bottom\">\r\n");
      out.write("\t    <div class=\"wrap\">\r\n");
      out.write("\t\t  <div class=\"header-bottom-left\">\r\n");
      out.write("\t\t\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t\t\t<a href=\"index.html\"><img src=\"images/logo.png\" alt=\"\"/></a>\r\n");
      out.write("\t\t\t\t</div>\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"menu\">\r\n");
      out.write("\t          <ul class=\"megamenu skyblue\">\r\n");
      out.write("\t\t\t<li class=\"active grid\"><a href=\"index.html\">主页</a></li>\r\n");
      out.write("\t\t\t<li><a class=\"color4\" href=\"#\">女士眼镜</a>\r\n");
      out.write("\t\t\t\t<div class=\"megapanel\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col1\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"h_nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>甜美</h4>\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col1\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"h_nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>可爱</h4>\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col1\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"h_nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>时尚</h4>\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t\t</li>\t\t\t\t\r\n");
      out.write("\t\t\t\t<li><a class=\"color5\" href=\"#\">男士眼镜</a>\r\n");
      out.write("\t\t\t\t  <div class=\"megapanel\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col1\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"h_nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>英伦</h4>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col1\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"h_nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>酷炫</h4>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li><a class=\"color6\" href=\"other.html\">联系我们</a></li>\r\n");
      out.write("\t\t\t</ul>  \r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t      <div class=\"clear\"></div>\r\n");
      out.write("     </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("          <div class=\"register_account\">\r\n");
      out.write("          \t<div class=\"wrap\">\r\n");
      out.write("    \t      <h4 class=\"title\">忘记密码，请修改</h4>\r\n");
      out.write("    \t\t   <form action=\"Register\" method=\"post\">\r\n");
      out.write("    \t\t\t <div class=\"col_1_of_2 span_1_of_2\">\r\n");
      out.write("\t\t   \t\t\t    <div>姓名:<input type=\"text\" name=\"name\"></input></div>\r\n");
      out.write("\t\t    \t\t\t<div>邮箱:<input type=\"text\" name=\"email\"></input></div>\r\n");
      out.write("\t\t    \t\t\t<div>密码:<input type=\"text\" name=\"password\"></input></div>\r\n");
      out.write("\t\t    \t </div>\r\n");
      out.write("\t\t    \t  <p>&nbsp;</p>\r\n");
      out.write("\t\t    \t  <p>&nbsp;</p>\r\n");
      out.write("\t\t    \t  <p>&nbsp;</p>\r\n");
      out.write("\t\t    \t  <p>&nbsp;</p>\r\n");
      out.write("\t\t    \t  <p>&nbsp;</p>\r\n");
      out.write("\t\t    \t  <p>&nbsp;</p>\r\n");
      out.write("\t\t    \t  <p>&nbsp;</p>\r\n");
      out.write("\t\t    \t  <p>&nbsp;</p>\r\n");
      out.write("\t\t    \t  <p>&nbsp;</p>\r\n");
      out.write("\t\t    \t  <p>&nbsp;</p>\r\n");
      out.write("\t\t    \t  <p>&nbsp;</p>\r\n");
      out.write("\t\t    \t  <p>&nbsp;</p>\r\n");
      out.write("\t\t    \t  <p>&nbsp;</p>\r\n");
      out.write("\t\t    \t  <button class=\"grey\">修改密码</button>\r\n");
      out.write("\t\t          <div class=\"clear\"></div>\r\n");
      out.write("\t\t    </form>\r\n");
      out.write("    \t</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"footer\">\r\n");
      out.write("\t\t<div class=\"footer-top\">\r\n");
      out.write("\t\t\t<div class=\"wrap\">\r\n");
      out.write("\t\t\t  <div class=\"section group example\">\r\n");
      out.write("\t\t\t\t<div class=\"col_1_of_2 span_1_of_2\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"f-list\">\r\n");
      out.write("\t\t\t\t\t  <li><img src=\"images/2.png\"><span class=\"f-text\">我们致力于为您提供优质的服务</span>\r\n");
      out.write("\t\t\t\t\t    <div class=\"clear\"></div></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col_1_of_2 span_1_of_2\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"f-list\">\r\n");
      out.write("\t\t\t\t\t  <li><img src=\"images/3.png\"><span class=\"f-text\">我们向您承诺七天无理由退换</span><div class=\"clear\"></div></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t      </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"footer-middle\">\r\n");
      out.write("\t\t\t<div class=\"wrap\">\r\n");
      out.write("\t\t\t <div class=\"section group example\">\r\n");
      out.write("\t\t\t  <div class=\"col_1_of_f_1 span_1_of_f_1\">\r\n");
      out.write("\t\t\t\t <div class=\"section group example\">\r\n");
      out.write("\t\t\t\t   <div class=\"col_1_of_f_2 span_1_of_f_2\">\r\n");
      out.write("\t\t\t\t      <h3>LEO SHOP</h3>\r\n");
      out.write("\t\t\t\t\t\t<script>(function(d, s, id) {\r\n");
      out.write("\t\t\t\t\t\t  var js, fjs = d.getElementsByTagName(s)[0];\r\n");
      out.write("\t\t\t\t\t\t  if (d.getElementById(id)) return;\r\n");
      out.write("\t\t\t\t\t\t  js = d.createElement(s); js.id = id;\r\n");
      out.write("\t\t\t\t\t\t  js.src = \"//connect.facebook.net/en_US/all.js#xfbml=1\";\r\n");
      out.write("\t\t\t\t\t\t  fjs.parentNode.insertBefore(js, fjs);\r\n");
      out.write("\t\t\t\t\t\t}(document, 'script', 'facebook-jssdk'));</script>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"like_box\">\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"fb-like-box\" data-href=\"http://www.cssmoban.com/\" data-colorscheme=\"light\" data-show-faces=\"true\" data-header=\"true\" data-stream=\"false\" data-show-border=\"true\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write(" \t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t  <div class=\"clear\"></div>\r\n");
      out.write("\t\t      </div>\r\n");
      out.write(" \t\t\t </div>\r\n");
      out.write("\t\t\t <div class=\"col_1_of_f_1 span_1_of_f_1\">\r\n");
      out.write("\t\t\t   <div class=\"section group example\">\r\n");
      out.write("\t\t\t\t <div class=\"col_1_of_f_2 span_1_of_f_2\">\r\n");
      out.write("\t\t\t\t   <h3>联系我们</h3>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"company_address\">\r\n");
      out.write("\t\t\t\t\t\t\t   \t\t<p>江苏省徐州市</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>中国矿业大学</p>\r\n");
      out.write("\t\t\t\t\t   \t\t<p>QQ：870513252</p>\r\n");
      out.write("\t\t\t\t\t \t \t<p>Email:870513252@qq.com</p>\r\n");
      out.write("\t\t\t\t\t   \t\t\r\n");
      out.write("\t\t\t\t\t   </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"social-media\"> </div>\r\n");
      out.write("\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t   </div>\r\n");
      out.write("\t\t  <div class=\"clear\"></div>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"footer-bottom\">\r\n");
      out.write("\t\t\t <div class=\"wrap\">\r\n");
      out.write("\t           <center> <p>\r\n");
      out.write("\t             <p>&copy; 2016 中国矿业大学\r\n");
      out.write("                 <p> </center>\r\n");
      out.write("\t\t        <div class=\"clear\"></div>\r\n");
      out.write("\t\t      </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("<div style=\"display:none\"></div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
