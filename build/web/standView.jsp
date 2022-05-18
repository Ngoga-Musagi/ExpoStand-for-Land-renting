<%-- 
    Document   : standView
    Created on : May 8, 2022, 7:25:09 PM
    Author     : hp
--%>
<%@page import="model.Validate"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.ExpoStands"%>
<%@page import="dao.ExpoStandDao"%>
<%
ExpoStandDao da= new ExpoStandDao();
List<ExpoStands> l= da.getExpos();

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
        <title>Expo_Stand Management</title>
         <style>
            body{
                background-color: rgb(0,88,0);
                color: rgb(255,255,0)
            }
            
        </style>
    </head>
    <body>
        <a href="newStand.jsp"><button>New ExpoStand</button></a>
        <table border="1">
            <th>StandNo</th>
            <th>RentingCompany</th>
            <th>Length</th>
            <th>Width</th>
            <th>Area</th>
            <th>RentingDate</th>
            <th>RentingPrice</th>
            
            <% 
            
            for(ExpoStands ex:l){%>
            
            <tr>
                <td><%=ex.getStandNo() %></td> 
                <td><%=ex.getRentingCompany() %></td> 
                <td><%=ex.getStandLength()+"m" %></td> 
                 <td><%=ex.getStandWidth()+"m" %></td> 
                 <td><%=ex.getStandArea()+"m^2" %></td> 
                 <td><%=ex.getRentingDate() %></td>
                 <td><%=ex.getRentingPrice()+"RWF" %></td> 
                 
            </tr>   
            
            <%}
            
            %>
        </table>
    </body>
</html>
