<%-- 
    Document   : newStand
    Created on : May 8, 2022, 7:09:37 PM
    Author     : hp
--%>
<%@page import="model.Validate"%>
<% 
Validate v=(Validate) request.getAttribute("valid");
            if(v==null){
             v=new Validate();
             request.setAttribute("valid", v);
            }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                background-color: rgb(0,88,0);
                color: rgb(255,255,0)
            }
            
        </style>
    </head>
    <body>
        <form action="save.jsp">
            <label><%=v.getMsg() +"  "+ v.getErrormsg()%></label><br>
            <label>StandNo:</label><input type="text" name="no"><br>
            <label>RentingCompany:</label><input type="text" name="rc"><br>
            <label>StandLength:</label><input type="text" name="l"><br>
            <label>StandWidth:</label><input type="text" name="w"><br>
            <label>rentingDate:</label><input type="date" name="rd"><br>
            <input type="submit" value="Save">
        </form>
        <a href="standView.jsp"><button>View ExpoStand</button></a>
    </body>
</html>
