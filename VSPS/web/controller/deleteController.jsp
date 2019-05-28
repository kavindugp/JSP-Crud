<%-- 
    Document   : deleteController
    Created on : May 18, 2019, 1:50:48 PM
    Author     : kavindu
--%>

<%@page import="CRUD.DeleteEmp"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String id=request.getParameter("id");
            DeleteEmp obj_Delete_values=new DeleteEmp();
            obj_Delete_values.delete_value(id);
            
        %>
     <script type="text/javascript">
            
            window.location.href="http://localhost:8080/VSPS/AddEmp.jsp";
    </script>    
       
    </body>
</html>
