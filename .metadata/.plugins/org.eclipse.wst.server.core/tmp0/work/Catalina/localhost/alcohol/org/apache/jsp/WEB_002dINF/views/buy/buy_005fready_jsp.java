/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-05-09 08:26:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.buy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class buy_005fready_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>주소 입력</title>\r\n");
      out.write("    <meta content=\"\" name=\"description\">\r\n");
      out.write("    <meta content=\"\" name=\"keywords\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Favicons -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Google Fonts -->\r\n");
      out.write("    <link href=\"https://fonts.gstatic.com\" rel=\"preconnect\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i\"\r\n");
      out.write("          rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Vendor CSS Files -->\r\n");
      out.write("\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("          integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/assets/vendor/bootstrap-icons/bootstrap-icons.css\"\r\n");
      out.write("          rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Template Main CSS File -->\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/main_css/main.css\" rel=\"stylesheet\">\r\n");
      out.write(" <script src=\"https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("        <section class=\"section register min-vh-80 d-flex flex-column align-items-center justify-content-center py-4\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row justify-content-center\">\r\n");
      out.write("                    <div class=\"col-lg-4 col-md-6 d-flex flex-column align-items-center justify-content-center\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"d-flex justify-content-center py-4\">\r\n");
      out.write("                            <a href=\"main.do\" class=\"logo d-flex align-items-center w-auto\">\r\n");
      out.write("                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/upload/logo.jpg\" alt=\"\">\r\n");
      out.write("                                <span class=\"d-none d-lg-block\">주당들</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div><!-- End Logo -->\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"card mb-3\">\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"pt-4 pb-2\">\r\n");
      out.write("                                    <h4 class=\"card-title text-center fw-bold pb-0 fs-3\">구매 상세정보</h4>\r\n");
      out.write("                                    <p class=\"text-center small\">Enter your details to purchase</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <form class=\"row g-3 needs-validation\" onsubmit=\"return false;\" id=\"register_detail_form\" novalidate>\r\n");
      out.write("                                    <div class=\"col-12\">\r\n");
      out.write("                                        <label for=\"user1_nickname\" class=\"form-label\">구매 내역</label>\r\n");
      out.write("                                        <input type=\"text\" name=\"user1_nickname\" class=\"form-control\" id=\"user1_nickname\"\r\n");
      out.write("                                               required>\r\n");
      out.write("                                        <div class=\"valid-feedback\">Good!</div>\r\n");
      out.write("                                        <div class=\"invalid-feedback\"></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"col-12\">\r\n");
      out.write("                                        <label for=\"user1_phonenumber\" class=\"form-label\">전화번호</label>\r\n");
      out.write("                                        <input type=\"text\" name=\"user1_phonenumber\" class=\"form-control\"\r\n");
      out.write("                                               id=\"user1_phonenumber\"\r\n");
      out.write("                                               required>\r\n");
      out.write("                                        <div class=\"valid-feedback\">Good!</div>\r\n");
      out.write("                                        <div class=\"invalid-feedback\">ex)010-9962-1671</div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"col-12\">\r\n");
      out.write("                                        <label class=\"form-label\">주소</label>\r\n");
      out.write("                                        <div>\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" id=\"sample4_postcode\"\r\n");
      out.write("                                                   placeholder=\"우편번호\" required readonly>\r\n");
      out.write("                                            <div class=\"valid-feedback\"></div>\r\n");
      out.write("                                            <div class=\"invalid-feedback\"></div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-12\">\r\n");
      out.write("                                            <input type=\"button\" class=\"form-control btn btn-success fw-bold\"\r\n");
      out.write("                                                   onclick=\"sample4_execDaumPostcode();\"\r\n");
      out.write("                                                   value=\"우편번호 찾기\"><br>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"sample4_roadAddress\"\r\n");
      out.write("                                               placeholder=\"도로명주소\" required readonly>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"sample4_jibunAddress\"\r\n");
      out.write("                                               placeholder=\"지번주소\" required readonly>\r\n");
      out.write("                                        <span id=\"guide\" class=\"form-control\" style=\"color:#999;display:none\"></span>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"sample4_detailAddress\"\r\n");
      out.write("                                               placeholder=\"상세주소\" required>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"sample4_extraAddress\"\r\n");
      out.write("                                               placeholder=\"참고항목\" required readonly>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <input type=\"hidden\" name=\"user1_name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.user1_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("                                        <input type=\"hidden\" name=\"user1_pwd\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.user1_pwd}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("                                        <input type=\"hidden\" name=\"user1_email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.user1_email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("                                        <input type=\"hidden\" name=\"user1_birthdate\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.user1_birthdate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("                                        <input type=\"hidden\" name=\"user1_addr\" value=\"\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"col-12\">\r\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary w-100\" id=\"submit\"\r\n");
      out.write("                                                onclick='send(this.form);'>결제하기</button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </form>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"credits\">\r\n");
      out.write("                            Designed by <a href=\"#\">GoodCheese92 &amp BootstrapMade</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.4.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/register/mainjs.js\"></script>\r\n");
      out.write("<!-- Vendor JS Files -->\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("        integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/main_js/main.js\"></script>\r\n");
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
