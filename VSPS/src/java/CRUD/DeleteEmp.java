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
public class DeleteEmp {
    
    public void delete_value(String id){
	       dbUtils obdb=new dbUtils();
               Connection connection=obdb.getCon();
               PreparedStatement ps=null;
	try {
            String query="delete from employee where id=?";
            ps=connection.prepareStatement(query);		
            ps.setString(1, id);
            ps.executeUpdate();
            
	} catch (Exception e) {
	 
	}
	}
}
