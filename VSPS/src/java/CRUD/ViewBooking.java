/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import comman.BookingBean;
import comman.CusBean;
import comman.EmpBean;
import comman.InvenBean;
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
public class ViewBooking {
    
    
    public static void main(String[] args) {
        
        ViewBooking vemp=new ViewBooking();
        vemp.getValue();
    }
    
    public List<BookingBean> getValue(){
    
        dbUtils dbObj=new dbUtils();
        Connection connection=dbObj.getCon();
        
        PreparedStatement ps=null;
        ResultSet rs=null;
                
        List<BookingBean> list=new ArrayList<BookingBean>();

        try {
                    String query="select * from booking"; 
                    ps=connection.prepareStatement(query);
                    rs=ps.executeQuery();
                    
                    while(rs.next()){
                    
                        BookingBean obj=new BookingBean();
                        
                       
                        
                        obj.setId(rs.getString("id"));
                        obj.setName(rs.getString("name"));
                        obj.setOrganization(rs.getString("organization"));
                        obj.setTown(rs.getString("town"));
                        obj.setfAmount(rs.getString("fAmount"));
                        obj.setAdvance(rs.getString("advance"));
                        
                        
                        
                        list.add(obj);
                        
                        
                        
                    }
                                      
        } catch (Exception e) {
        }
        return list;
    }  
    
    
}
