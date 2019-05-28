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
public class ViewEmp {
    
    public static void main(String[] args) {
        
        ViewEmp vemp=new ViewEmp();
        vemp.getValue();
    }
    
    
    public List<EmpBean> getValue(){
    
        dbUtils dbObj=new dbUtils();
        Connection connection=dbObj.getCon();
        
        PreparedStatement ps=null;
        ResultSet rs=null;
        
        
        List<EmpBean> list=new ArrayList<EmpBean>();

    
        try {
                    String query="select * from employee"; 
                    ps=connection.prepareStatement(query);
                    rs=ps.executeQuery();
                    
                    while(rs.next()){
                    
                        EmpBean obj=new EmpBean();
                        
                        
                        System.out.println(rs.getString("id"));
                        System.out.println(rs.getString("fname"));
                        System.out.println(rs.getString("lname"));
                        System.out.println(rs.getString("dob"));
                        System.out.println(rs.getString("nic"));
                        System.out.println(rs.getString("mobile"));
                        
                        
                        //int newid=Integer.parseInt("id");
                        
//                      String newId=Integer.toString("id");
                        obj.setId(rs.getString("id"));
                        obj.setFname(rs.getString("fname"));
                        obj.setLname(rs.getString("lname"));
                        obj.setDob(rs.getString("dob"));
                        obj.setNic(rs.getString("nic"));
                        obj.setMobile(rs.getString("mobile"));
                        
                       
                        list.add(obj);
                        
                    }
                    
                    
        } catch (Exception e) {
        }
        return list;
    }
    
}
