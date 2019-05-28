<%-- 
    Document   : CusAddController
    Created on : May 19, 2019, 1:56:38 PM
    Author     : kavindu
--%>

<%@page import="CRUD.AddCus"%>
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
            String fname=request.getParameter("fname");
            String lname=request.getParameter("lname");
            String town=request.getParameter("town");
            String nic=request.getParameter("nic");
            String mobile=request.getParameter("mobile");
            
            out.println(id);
            out.println(fname);
            out.println(lname);
            out.println(town);
            out.println(nic);
            out.println(mobile);

            AddCus addObj=new AddCus();
            addObj.insertValues(id,fname,lname,town,nic,mobile);
            
         %>    
     
         
        <script type="text/javascript">
            
            window.location.href="http://localhost:8080/VSPS/AddCus.jsp";
    </script>    
       
        
    </body>
</html>
