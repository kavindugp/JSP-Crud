<%-- 
    Document   : EmpAddController
    Created on : May 18, 2019, 11:00:36 AM
    Author     : kavindu
--%>


<%@page import="CRUD.EditEmp"%>
<%@page import="comman.EmpBean"%>
<%@page import="CRUD.AddEmp"%>
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
            String dob=request.getParameter("dob");
            String nic=request.getParameter("nic");
            String mobile=request.getParameter("mobile");
            
            //out.println(fname);

            EmpBean objemp=new EmpBean();
            
            objemp.setId(id);
            objemp.setFname(fname);
            objemp.setLname(lname);
            objemp.setDob(dob);
            objemp.setNic(nic);
            objemp.setMobile(mobile);
            
            EditEmp editempobj=new EditEmp();
            
            editempobj.editEmp(objemp);
            
            
//            AddEmp addObj=new AddEmp();
//            addObj.insertValues(id, fname, lname, dob, nic, mobile);
            
        %>    
        <script type="text/javascript">
            
            window.location.href="http://localhost:8080/VSPS/AddEmp.jsp";
    </script>    
       
        
    </body>
</html>
