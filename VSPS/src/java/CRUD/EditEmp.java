/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import comman.EmpBean;
import comman.dbUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kavindu
 */
public class EditEmp {
 
    
    public EmpBean getValuesOfEmp(String id){
    
         dbUtils dbObj=new dbUtils();
        Connection connection=dbObj.getCon();
        
        
        PreparedStatement ps=null;
        ResultSet rs=null;
         EmpBean obj=new EmpBean();
        
        
        try {
                    String query="select * from employee where id=?"; 
                    ps=connection.prepareStatement(query);
                    ps.setString(1, id);
                    rs=ps.executeQuery();
                    
                    
                    while(rs.next()){
                    
//                        String newId=Integer.toString("id");
                        obj.setId(rs.getString("id"));
                        obj.setFname(rs.getString("fname"));
                        obj.setLname(rs.getString("lname"));
                        obj.setDob(rs.getString("dob"));
                        obj.setNic(rs.getString("nic"));
                        obj.setMobile(rs.getString("mobile"));
                        
                    }
                    
                    
        } catch (Exception e) {
        }
        return obj;
    }
    
    
    ///////////////////////////////////////////////////////////////////////////////////////////
    
    
    
     public  void editEmp(EmpBean objEmpBean){
    
         dbUtils dbObj=new dbUtils();
         Connection connection=dbObj.getCon();
        
        
         PreparedStatement ps=null;
       
        // EmpBean obj=new EmpBean();
        
        
        try {
                    String query="update employee set id=?,fname=?,lname=?,dob=?,nic=?,mobile=? where id =? "; 
                    ps=connection.prepareStatement(query);
                    ps.setString(1, objEmpBean.getId());
                    ps.setString(2, objEmpBean.getFname());
                    ps.setString(3, objEmpBean.getLname());
                    ps.setString(4, objEmpBean.getDob());
                    ps.setString(5, objEmpBean.getNic());
                    ps.setString(6, objEmpBean.getMobile());
                    ps.executeUpdate();
                    
                    
        } catch (Exception e) {
            
        }
     
    }
}
