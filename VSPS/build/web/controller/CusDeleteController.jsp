<%-- 
    Document   : CusDeleteController
    Created on : May 20, 2019, 1:20:04 PM
    Author     : kavindu
--%>

<%@page import="CRUD.DeleteCus"%>
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
            DeleteCus obj_Delete_values=new DeleteCus();
            obj_Delete_values.delete_value(id);
            
        %>
     <script type="text/javascript">
            
            window.location.href="http://localhost:8080/VSPS/AddCus.jsp";
    </script>    
       
        
    </body>
</html>
