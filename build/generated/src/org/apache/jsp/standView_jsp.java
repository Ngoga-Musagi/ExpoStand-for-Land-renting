package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import model.ExpoStands;
import dao.ExpoStandDao;

public final class standView_jsp extends org.apache.jasper.runtime.HttpJspBase
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

ExpoStandDao da= new ExpoStandDao();
List<ExpoStands> l= da.getExpos();

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table>\n");
      out.write("            <th>StandNo</th>\n");
      out.write("            <th>RentingCompany</th>\n");
      out.write("            <th>Length</th>\n");
      out.write("            <th>Width</th>\n");
      out.write("            <th>Area</th>\n");
      out.write("            <th>RentingDate</th>\n");
      out.write("            <th>RentingPrice</th>\n");
      out.write("            \n");
      out.write("            ");
 
            
            for(ExpoStands ex:l){
      out.write("\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(ex.getStandNo() );
      out.write("</td> \n");
      out.write("                <td>");
      out.print(ex.getRentingCompany() );
      out.write("</td> \n");
      out.write("                <td>");
      out.print(ex.getStandLength() );
      out.write("</td> \n");
      out.write("                 <td>");
      out.print(ex.getStandWidth() );
      out.write("</td> \n");
      out.write("                 <td>");
      out.print(ex.getStandArea() );
      out.write("</td> \n");
      out.write("                 <td>");
      out.print(ex.getRentingDate() );
      out.write("</td>\n");
      out.write("                 <td>");
      out.print(ex.getRentingPrice() );
      out.write("</td> \n");
      out.write("                 \n");
      out.write("            </tr>   \n");
      out.write("            \n");
      out.write("            ");
}
            
            
      out.write("\n");
      out.write("        </table>\n");
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
