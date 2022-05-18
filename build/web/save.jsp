<%-- 
    Document   : save
    Created on : May 8, 2022, 7:15:10 PM
    Author     : hp
--%>

<%@page import="model.Validate"%>
<%@page import="dao.ExpoStandDao"%>
<%@page import="model.ExpoStands"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            
            Validate v=(Validate) request.getAttribute("valid");
            if(v==null){
             v=new Validate();
             request.setAttribute("valid", v);
}
            RequestDispatcher rq = request.getRequestDispatcher("newStand.jsp");
            
        String id=request.getParameter("no");
        String company=request.getParameter("rc");
        String l=request.getParameter("l");
        String w=request.getParameter("w");
        String dat=request.getParameter("rd");
        
        ExpoStands ex = new ExpoStands();
        ex.setStandNo(id);
        ex.setRentingCompany(company);
        ex.setStandLength(l);
        ex.setStandWidth(w);
        ex.setRentingDate(dat);
        ex.setStandArea(l, w);
        
        ex.setRentingPrice();
        v.saved(ex); 
        rq.forward(request, response);
//        ExpoStandDao da= new ExpoStandDao();
//        da.Save(ex);
        %>
    </body>
</html>
