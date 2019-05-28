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
public class AddBooking {
    public void insertValues(String id,String pname,String organization,String town,String fAmount,String advance){
    
        dbUtils dbObj=new dbUtils();
        Connection connection=dbObj.getCon();
        
        
        
        PreparedStatement ps=null;
     
        try {
            
       String query="insert into booking(id,pname,organization,town,fAmount,advance) values(?,?,?,?,?,?)";
        
        ps=connection.prepareStatement(query);
        
        ps.setString(1, id);                                                                                                                                                                                                                                                                                    
        ps.setString(2, pname);
        ps.setString(3, organization);
        ps.setString(4, town);
        ps.setString(5, fAmount);
        ps.setString(6, advance);
        
        ps.executeUpdate();
        
        
        } catch (Exception e) {
            System.out.println(e);
        }
    }
   
    
    
}
