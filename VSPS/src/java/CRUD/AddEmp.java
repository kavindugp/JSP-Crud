/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import comman.dbUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author kavindu
 */
public class AddEmp {
    
    public void insertValues(String id,String fname,String lname,String dob,String nic,String mobile){
    
        dbUtils dbObj=new dbUtils();
        Connection connection=dbObj.getCon();
        
        
        PreparedStatement ps=null;
     
        try {
            
        String query="insert into employee(id,fname,lname,dob,nic,mobile) values (?,?,?,?,?,?)";
        
        ps=connection.prepareStatement(query);
        
        ps.setString(1, id);
        ps.setString(2, fname);
        ps.setString(3, lname);
        ps.setString(4, dob);
        ps.setString(5, nic);
        ps.setString(6, mobile);
        
        ps.executeUpdate();
        
        
        } catch (Exception e) {
        }
    }
    
}
