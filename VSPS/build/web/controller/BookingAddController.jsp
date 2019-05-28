<%-- 
    Document   : BookingAddController
    Created on : May 20, 2019, 5:14:23 AM
    Author     : kavindu
--%>

<%@page import="CRUD.AddBooking"%>
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
            String pname=request.getParameter("pname");
            String organization=request.getParameter("organization");
            String town=request.getParameter("town");
            String fAmount=request.getParameter("fAmount");
            String advance=request.getParameter("advance");
            
            out.println(id);
            out.println(pname);
            out.println(organization);
            out.println(town);
            out.println(fAmount);
            out.println(advance);

            AddBooking addObj=new AddBooking();
            addObj.insertValues(id,pname,organization,town,fAmount,advance);
            
         %>    
     
         
    <script type="text/javascript">
            
            window.location.href="http://localhost:8080/VSPS/AddBooking.jsp";
    </script>    
       
       
        
        
    </body>
</html>
