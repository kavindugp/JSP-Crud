<%-- 
    Document   : AddEmp
    Created on : May 18, 2019, 10:34:42 AM
    Author     : kavindu
--%>

<%@page import="comman.InvenBean"%>
<%@page import="CRUD.ViewInven"%>
<%@page import="java.util.Iterator"%>
<%@page import="comman.EmpBean"%>
<%@page import="java.util.List"%>
<%@page import="CRUD.ViewEmp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    
        <style>
           table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {background-color: #f2f2f2;}
            tr:hover {background-color: #f5f5f5;}
        </style>
    </head>
    
    
    <body>
        
        <div class="container">
            <button type="button" style="margin-left: 10px; width: 140px; margin-top: 5px;"  onclick="location.href = 'http://localhost:8080/VSPS/AddEmp.jsp';" class="btn btn-outline-warning">Emplyee</button>
            <button type="button" style="margin-left: 170px; width: 140px; margin-top: 5px;"  onclick="location.href = 'www.yoursite.com';" class="btn btn-outline-warning">Customer</button>
            <button type="button" style="margin-left: 160px; width: 140px; margin-top: 5px;"  onclick="location.href = 'www.yoursite.com';" class="btn btn-outline-warning">Inventry</button>
            <button type="button" style="margin-left: 190px; width: 140px; margin-top: 5px;"  onclick="location.href = 'www.yoursite.com';" class="btn btn-outline-warning">Booking</button>
            <div class="card" style="margin-top: 4px;height: 300px;">
                <h3 style="text-align: center;margin-top: 10px;">Inventry Handling</h3>
                <hr>
                <form action="controller/InvenAddController.jsp">
                <div class="form-group"style="margin-left: 70px;">
                    <label for="exampleInputEmail1" style="font-size: 15px;">Code</label>
                    <input type="text" style="width: 400px; height: 30px;" name="code" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Item code" > 
                </div>
                <div class="form-group"style="margin-left: 70px;">
                  <label for="exampleInputEmail1" style="font-size: 15px;">Name</label>
                  <input type="text" style="width: 400px; height: 30px;" name="name" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Name" > 
                </div>
                
                <div class="form-group" style="margin-left: 600px; margin-top: -153px;">
                  <label for="exampleInputEmail1" style="font-size: 15px;">Manufacture</label>
                  <input type="text" style="width: 400px; height: 30px;" name="manufacture" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Manufacture" > 
                </div>
                <div class="form-group" style="margin-left: 600px;">
                  <label for="exampleInputEmail1" style="font-size: 15px;">QTY</label>
                  <input type="text" style="width: 400px; height: 30px;" name="qty" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Quntity" > 
                </div>
                
                <div style="margin-top: 2px;">
                <button type="submit"  class="btn btn-primary" style="width: 100px;margin-bottom:  5px; margin-left: 485px;">Add</button>
               
                </div>
            </form>
            </div>
             <%
               ViewInven obj=new ViewInven();
               List<InvenBean> list=obj.getValue();
               
               Iterator<InvenBean> it_list=list.iterator();
                            
               %>
            <table border="1" style=" margin-left: 0px;width: 100% ; margin-top: 30px;">
                <%
                    %>
                    
                    <tr style="background-color: skyblue">
                        <td style="text-align: center"> code</td>
                        <td style="text-align: center"> name</td>
                        <td style="text-align: center"> manufacture</td>
                        <td style="text-align: center"> qty</td>
                        
                        
                        <td style="text-align: center"> Edit</td>
                        <td style="text-align: center"> Delete</td>
                    </tr>
                    <%
               
               while(it_list.hasNext()){
                   InvenBean obbean=new InvenBean();
                   obbean=it_list.next();
                   
                   %>
                   
                   <tr>
                       <td style="text-align: center"><%= obbean.getCode()%></td>
                       <td style="text-align: center"><%= obbean.getName()%></td>
                       <td style="text-align: center"><%= obbean.getManufacture()%></td>
                       <td style="text-align: center"><%= obbean.getQty()%></td>
                      
                    
                       <td style="text-align: center;height: 45px"><button type="button" style="width: 80px;" onclick="location.href='EditEmp.jsp?id=<%= obbean.getCode()%>';" class="btn btn-success" >Edit</button></td>
                       <td style="text-align: center"><button type="button" style="" onclick="location.href='controller/InventryDeleteController.jsp?id=<%= obbean.getCode()%>';" class="btn btn-danger">Delete</button></td>
                    </tr>
                   
                   
               <%
               }
                
             %>   
             </table>
           
        </div>
        
    </body>
</html>
