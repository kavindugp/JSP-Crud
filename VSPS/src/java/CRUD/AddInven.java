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
public class AddInven {
    
    public void InsertInven(String code,String name,String manufacture,String qty){
    
        dbUtils obdb=new dbUtils();
        Connection con=obdb.getCon();
        
        PreparedStatement ps=null;
        
        try {
            
            
        String query="insert into inventry(code,name,manufacture,qty) values(?,?,?,?)";
        
        ps=con.prepareStatement(query);
        
        ps.setString(1, code);
        ps.setString(2, name);
        ps.setString(3, manufacture);
        ps.setString(4, qty);
        
        ps.executeUpdate();
        
        
            
        } catch (Exception e) {
        }
    }
    
}
