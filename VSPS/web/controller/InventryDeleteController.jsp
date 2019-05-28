<%-- 
    Document   : InventryDeleteController
    Created on : May 20, 2019, 1:26:55 PM
    Author     : kavindu
--%>

<%@page import="CRUD.DeleteInventry"%>
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
            DeleteInventry obj_Delete_values=new DeleteInventry();
            obj_Delete_values.delete_value(code);
            
        %>
     <script type="text/javascript">
            
            window.location.href="http://localhost:8080/VSPS/AddInven.jsp";
    </script>    
       
    </body>
</html>
