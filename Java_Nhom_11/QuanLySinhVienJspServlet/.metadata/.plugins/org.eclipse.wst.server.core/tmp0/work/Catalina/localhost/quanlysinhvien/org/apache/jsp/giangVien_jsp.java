/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.52
 * Generated at: 2023-07-01 05:52:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class giangVien_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Giảng Viên</title>\r\n");
      out.write("<link href=\"./style.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"./table.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"./form.css\" rel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\"\r\n");
      out.write("\tintegrity=\"sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"Navbar-Container\">\r\n");
      out.write("\t\t<div class=\"d-flex gap-3 \">\r\n");
      out.write("\t\t\t<a href=\"menu?action=home\" class=\"link\"> Home </a> <a\r\n");
      out.write("\t\t\t\thref=\"menu?action=khoa\" class=\"link\"> Khoa </a> <a\r\n");
      out.write("\t\t\t\thref=\"menu?action=monHoc\" class=\"link\"> Môn Học </a> <a\r\n");
      out.write("\t\t\t\thref=\"menu?action=giangVien\" class=\"link\"> Giảng Viên </a> <a\r\n");
      out.write("\t\t\t\thref=\"menu?action=timKiemSinhVien\" class=\"link\"> Tìm Kiếm Sinh\r\n");
      out.write("\t\t\t\tViên </a> <a href=\"menu?action=taiKhoan\" class=\"link\"> Tài Khoản </a> <a\r\n");
      out.write("\t\t\t\thref=\"thoat\" class=\"link\"> Thoát </a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ requestScope.errorThemGiangVien  }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("\t<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ requestScope.errorXoaGiangVien  }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<form action=\"themgiangvien\" class=\"form-container\">\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"inputgiangvien\">Mã Giảng Viên</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\tclass=\"form-control\" id=\"inputgiangvien\"\r\n");
      out.write("\t\t\t\t\taria-describedby=\"emailHelp\" placeholder=\"Nhập mã giảng viên\"\r\n");
      out.write("\t\t\t\t\tname=\"maGV\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"inputtengiangvien\">Tên Giảng Viên</label> <input\r\n");
      out.write("\t\t\t\t\ttype=\"text\" class=\"form-control\" id=\"inputtengiangvien\"\r\n");
      out.write("\t\t\t\t\taria-describedby=\"emailHelp\" placeholder=\"Nhập tên giảng viên\"\r\n");
      out.write("\t\t\t\t\tname=\"tenGV\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"InputTenkhoa\">Giới Tính</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\tclass=\"form-control\" id=\"InputTenkhoa\" placeholder=\"Nhập giới tính\"\r\n");
      out.write("\t\t\t\t\tname=\"gioiTinh\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"Inputdiachi\">Địa Chỉ</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\tclass=\"form-control\" id=\"Inputdiachi\" placeholder=\"Nhập địa chỉ\"\r\n");
      out.write("\t\t\t\t\tname=\"diaChi\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"Inputsodienthoai\">Số Điện Thoại</label> <input\r\n");
      out.write("\t\t\t\t\ttype=\"text\" class=\"form-control\" id=\"Inputsodienthoai\"\r\n");
      out.write("\t\t\t\t\tplaceholder=\"Nhập Điện thoại\" name=\"SDT\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"Inputemail\">Email</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\tclass=\"form-control\" id=\"Inputemail\" placeholder=\"Nhập Email\"\r\n");
      out.write("\t\t\t\t\tname=\"email\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<button type=\"submit\" class=\"btn btn-primary\" value=\"Thêm\">Thêm</button>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"d-flex table-containers\">\r\n");
      out.write("\t\t\t<table class=\"table-container\">\r\n");
      out.write("\t\t\t\t<thead class=\"bg-info\">\r\n");
      out.write("\t\t\t\t\t<tr class=\"tr-heading\">\r\n");
      out.write("\t\t\t\t\t\t<th>Mã Giảng Viên</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Tên Giảng Viên</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Giới Tính</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Địa Chỉ</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Số Điện Thoại</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Email</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Xóa</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /giangVien.jsp(93,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("list");
    // /giangVien.jsp(93,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/giangVien.jsp(93,4) '${ requestScope.listGV }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${ requestScope.listGV }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<tr class=\"tr-heading\">\r\n");
          out.write("\t\t\t\t\t\t<th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ list.maGV }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</th>\r\n");
          out.write("\t\t\t\t\t\t<th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ list.tenGV }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</th>\r\n");
          out.write("\t\t\t\t\t\t<th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ list.gioiTinh }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</th>\r\n");
          out.write("\t\t\t\t\t\t<th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ list.diaChi }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</th>\r\n");
          out.write("\t\t\t\t\t\t<th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ list.sdt }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</th>\r\n");
          out.write("\t\t\t\t\t\t<th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ list.email }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</th>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<th><a href=\"menu?action=xoaGiangVien&ID_GV=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ list.maGV }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\"\r\n");
          out.write("\t\t\t\t\t\t\tclass=\"delete\"> Xóa </a></th>\r\n");
          out.write("\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
