/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import comman.CusBean;
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
public class ViewCus {
    
    
    public static void main(String[] args) {
        
        ViewCus vemp=new ViewCus();
        vemp.getValue();
    }
    
    public List<CusBean> getValue(){
    
        dbUtils dbObj=new dbUtils();
        Connection connection=dbObj.getCon();
        
        PreparedStatement ps=null;
        ResultSet rs=null;
        
        
        List<CusBean> list=new ArrayList<CusBean>();

    
        try {
                    String query="select * from customer"; 
                    ps=connection.prepareStatement(query);
                    rs=ps.executeQuery();
                    
                    while(rs.next()){
                    
                        CusBean obj=new CusBean();
                        
                        
//                        System.out.println(rs.getString("id"));
//                        System.out.println(rs.getString("fname"));
//                        System.out.println(rs.getString("lname"));
//                        System.out.println(rs.getString("town"));
//                        System.out.println(rs.getString("nic"));
//                        System.out.println(rs.getString("mobile"));
//                        
                        
                        //int newid=Integer.parseInt("id");
                        
                       
                        obj.setId(rs.getString("id"));
                        obj.setFname(rs.getString("fname"));
                        obj.setLname(rs.getString("lname"));
                        obj.setTown(rs.getString("town"));
                        obj.setNic(rs.getString("nic"));
                        obj.setMobile(rs.getString("mobile"));
                        
                       
                        list.add(obj);
                        
                    }
                    
                    
        } catch (Exception e) {
        }
        return list;
    }
    
}
