package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import comman.CusBean;
import CRUD.ViewCus;
import java.util.Iterator;
import comman.EmpBean;
import java.util.List;
import CRUD.ViewEmp;

public final class AddCus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("    \n");
      out.write("        <style>\n");
      out.write("           table {\n");
      out.write("  border-collapse: collapse;\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("th, td {\n");
      out.write("  text-align: left;\n");
      out.write("  padding: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr:nth-child(even) {background-color: #f2f2f2;}\n");
      out.write("            tr:hover {background-color: #f5f5f5;}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("             <button type=\"button\" style=\"margin-left: 10px; width: 140px; margin-top: 5px;\"  onclick=\"location.href = 'http://localhost:8080/VSPS/AddEmp.jsp';\" class=\"btn btn-outline-warning\">Emplyee</button>\n");
      out.write("            <button type=\"button\" style=\"margin-left: 170px; width: 140px; margin-top: 5px;\"  onclick=\"location.href = 'http://localhost:8080/VSPS/AddCus.jsp';\" class=\"btn btn-outline-warning\">Customer</button>\n");
      out.write("            <button type=\"button\" style=\"margin-left: 160px; width: 140px; margin-top: 5px;\"  onclick=\"location.href = 'http://localhost:8080/VSPS/AddInven.jsp';\" class=\"btn btn-outline-warning\">Inventry</button>\n");
      out.write("            <button type=\"button\" style=\"margin-left: 190px; width: 140px; margin-top: 5px;\"  onclick=\"location.href = 'http://localhost:8080/VSPS/AddBooking.jsp';\" class=\"btn btn-outline-warning\">Booking</button>\n");
      out.write("            <div class=\"card\" style=\"margin-top: 4px;\">\n");
      out.write("                <h3 style=\"text-align: center;margin-top: 10px;\">Customer Handling</h3>\n");
      out.write("                <hr>\n");
      out.write("                <form action=\"controller/CusAddController.jsp\">\n");
      out.write("                <div class=\"form-group\"style=\"margin-left: 70px;\">\n");
      out.write("                    <label for=\"exampleInputEmail1\" style=\"font-size: 15px;\">ID</label>\n");
      out.write("                    <input type=\"text\" style=\"width: 400px; height: 30px;\" name=\"id\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Enter ID\" > \n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\"style=\"margin-left: 70px;\">\n");
      out.write("                  <label for=\"exampleInputEmail1\" style=\"font-size: 15px;\">First Name</label>\n");
      out.write("                  <input type=\"text\" style=\"width: 400px; height: 30px;\" name=\"fname\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Enter First Name\" > \n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\"style=\"margin-left: 70px;\">\n");
      out.write("                  <label for=\"exampleInputEmail1\" style=\"font-size: 15px;\">Last Name</label>\n");
      out.write("                  <input type=\"text\" style=\"width: 400px; height: 30px;\" name=\"lname\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Enter Last Name\" > \n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\" style=\"margin-left: 600px; margin-top: -230px;\">\n");
      out.write("                  <label for=\"exampleInputEmail1\" style=\"font-size: 15px;\"s>Town</label>\n");
      out.write("                  <input type=\"text\" style=\"width: 400px; height: 30px;\" name=\"town\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Enter Home Town\" > \n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\" style=\"margin-left: 600px;\">\n");
      out.write("                  <label for=\"exampleInputEmail1\" style=\"font-size: 15px;\">NIC</label>\n");
      out.write("                  <input type=\"text\" style=\"width: 400px; height: 30px;\" name=\"nic\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Enter Nic\" > \n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\" style=\"margin-left: 600px;\">\n");
      out.write("                  <label for=\"exampleInputEmail1\" style=\"font-size: 15px;\">Mobile</label>\n");
      out.write("                  <input type=\"text\" style=\"width: 400px; height: 30px;\" name=\"mobile\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Enter Mobile number\" > \n");
      out.write("                </div>\n");
      out.write("                <div style=\"margin-top: 2px;\">\n");
      out.write("                <button type=\"submit\"  class=\"btn btn-primary\" style=\"width: 100px;margin-bottom:  5px; margin-left: 485px;\">Add</button>\n");
      out.write("               \n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            ");

               ViewCus obj=new ViewCus();
               List<CusBean> list=obj.getValue();
               
               Iterator<CusBean> it_list=list.iterator();
                            
               
      out.write("\n");
      out.write("            <table border=\"1\" style=\" margin-left: 0px;width: 100% ; margin-top: 30px;\">\n");
      out.write("                ");

                    
      out.write("\n");
      out.write("                    \n");
      out.write("                    <tr style=\"background-color: skyblue\">\n");
      out.write("                        <td style=\"text-align: center\"> id</td>\n");
      out.write("                        <td style=\"text-align: center\"> fname</td>\n");
      out.write("                        <td style=\"text-align: center\"> lname</td>\n");
      out.write("                        <td style=\"text-align: center\"> town</td>\n");
      out.write("                        <td style=\"text-align: center\"> nic</td>\n");
      out.write("                        <td style=\"text-align: center\"> mobile</td>\n");
      out.write("                        \n");
      out.write("                        <td style=\"text-align: center\"> Edit</td>\n");
      out.write("                        <td style=\"text-align: center\"> Delete</td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

               
               while(it_list.hasNext()){
                   CusBean obbean=new CusBean();
                   obbean=it_list.next();
                   
                   
                   
      out.write("\n");
      out.write("                   \n");
      out.write("                   <tr>\n");
      out.write("                       <td style=\"text-align: center\">");
      out.print( obbean.getId() );
      out.write("</td>\n");
      out.write("                       <td style=\"text-align: center\">");
      out.print( obbean.getFname());
      out.write("</td>\n");
      out.write("                       <td style=\"text-align: center\">");
      out.print( obbean.getLname());
      out.write("</td>\n");
      out.write("                       <td style=\"text-align: center\">");
      out.print( obbean.getTown());
      out.write("</td>\n");
      out.write("                       <td style=\"text-align: center\">");
      out.print( obbean.getNic());
      out.write("</td>\n");
      out.write("                       <td style=\"text-align: center\">");
      out.print( obbean.getMobile());
      out.write("</td>\n");
      out.write("                      \n");
      out.write("                    \n");
      out.write("                       <td style=\"text-align: center;height: 45px\"><button type=\"button\" style=\"width: 80px;\" onclick=\"location.href='EditEmp.jsp?id=");
      out.print( obbean.getId());
      out.write("';\" class=\"btn btn-success\" >Edit</button></td>\n");
      out.write("                       <td style=\"text-align: center\"><button type=\"button\" style=\"\" onclick=\"location.href='controller/CusDeleteController.jsp?id=");
      out.print( obbean.getId());
      out.write("';\" class=\"btn btn-danger\">Delete</button></td>\n");
      out.write("                    </tr>\n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("               ");

               }
                
             
      out.write("   \n");
      out.write("             </table>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
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
