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
public class DeleteInventry {
    
    
    public void delete_value(String code){
	       dbUtils obdb=new dbUtils();
               Connection connection=obdb.getCon();
               PreparedStatement ps=null;
	try {
            String query="delete from inventry where code=?";
            ps=connection.prepareStatement(query);		
            ps.setString(1, code);
            ps.executeUpdate();
            
	} catch (Exception e) {
	 
	}
	}
}
