<%-- 
    Document   : EditEmp
    Created on : May 18, 2019, 12:36:16 PM
    Author     : kavindu
--%>

<%@page import="comman.EmpBean"%>
<%@page import="CRUD.EditEmp"%>
<%@page import="java.sql.Connection"%>
<%@page import="comman.dbUtils"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body>
        
        
        
        <%
            String id=(String)request.getParameter("id");
            
            EditEmp editobj=new EditEmp();
            EmpBean empbeanobj=editobj.getValuesOfEmp(id);
            
            
          %>  
        
        
        
       <div class="container">
        <div class="card" style=" height: 360px; ">
                <h3 style="text-align: center;margin-top: 10px;">Edit Employee</h3>
                <hr>
                <form action="controller/EmpEditController.jsp">
                <div class="form-group"style="margin-left: 70px;">
                    <label for="exampleInputEmail1" style="font-size: 15px;">ID</label>
                    <input type="text" style="width: 400px; height: 30px;" name="id" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter First Name" value=" <%= id %> " > 
                </div>
                <div class="form-group"style="margin-left: 70px;">
                  <label for="exampleInputEmail1" style="font-size: 15px;">First Name</label>
                  <input type="text" style="width: 400px; height: 30px;" name="fname" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Last Name" value="<%= empbeanobj.getFname() %>"> 
                </div>
                <div class="form-group"style="margin-left: 70px;">
                  <label for="exampleInputEmail1" style="font-size: 15px;">Last Name</label>
                  <input type="text" style="width: 400px; height: 30px;" name="lname" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Date of Birth" value=" <%= empbeanobj.getLname() %>"> 
                </div>
                <div class="form-group" style="margin-left: 600px; margin-top: -230px;">
                  <label for="exampleInputEmail1" style="font-size: 15px;"s>DOB</label>
                  <input type="text" style="width: 400px; height: 30px;" name="dob" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter NIC" value=" <%= empbeanobj.getDob()%>"> 
                </div>
                <div class="form-group" style="margin-left: 600px;">
                  <label for="exampleInputEmail1" style="font-size: 15px;">NIC</label>
                  <input type="text" style="width: 400px; height: 30px;" name="nic" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Mobile Number" value="<%= empbeanobj.getNic()%>"> 
                </div>
                <div class="form-group" style="margin-left: 600px;">
                  <label for="exampleInputEmail1" style="font-size: 15px;">Mobile</label>
                  <input type="text" style="width: 400px; height: 30px;" name="mobile" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Home Town" value="<%= empbeanobj.getMobile()%>"> 
                </div>
                <div style="margin-top: 2px;">
                <button type="submit" class="btn btn-primary" style="width: 100px; margin-left: 490px;">Save</button>
                
                </div>
            </form>
            </div>
        </div>
    </body>
</html>
