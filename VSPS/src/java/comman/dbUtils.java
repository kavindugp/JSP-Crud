/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comman;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author kavindu
 */
public class dbUtils {
    
    
   public static Connection con;
    
    public static Connection getCon(){
    
        
       try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/vsps","root","");

        } catch (Exception e) {
        }
       
        return con;  
    
       
    }
    
}
