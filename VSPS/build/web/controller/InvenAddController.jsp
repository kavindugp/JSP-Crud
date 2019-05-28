<%-- 
    Document   : InvenAddController
    Created on : May 19, 2019, 3:48:30 PM
    Author     : kavindu
--%>

<%@page import="CRUD.AddInven"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    
        <%
            
           String code=request.getParameter("code");
           String name=request.getParameter("name");
           String manufacture=request.getParameter("manufacture");
           String qty=request.getParameter("qty");
            

           AddInven addInvenObj=new AddInven();
           addInvenObj.InsertInven(code,name,manufacture,qty);
            
         %>   
        
        <script type="text/javascript">
            
            window.location.href="http://localhost:8080/VSPS/AddInven.jsp";
    </script>    
       
    </body>
</html>
