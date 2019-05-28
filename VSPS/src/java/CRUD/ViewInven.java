/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import comman.CusBean;
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
public class ViewInven {
    
    public static void main(String[] args) {
        
        ViewInven vemp=new ViewInven();
        vemp.getValue();
    }
    
     public List<InvenBean> getValue(){
    
        dbUtils dbObj=new dbUtils();
        Connection connection=dbObj.getCon();
        
        PreparedStatement ps=null;
        ResultSet rs=null;
                
        List<InvenBean> list=new ArrayList<InvenBean>();

        try {
                    String query="select * from inventry"; 
                    ps=connection.prepareStatement(query);
                    rs=ps.executeQuery();
                    
                    while(rs.next()){
                    
                        InvenBean obj=new InvenBean();
                        
                        obj.setCode(rs.getString("code"));
                        obj.setName(rs.getString("name"));
                        obj.setManufacture(rs.getString("manufacture"));
                        obj.setQty(rs.getString("qty"));
                        
                        list.add(obj);
                        
                    }
                                      
        } catch (Exception e) {
        }
        return list;
    }
    
}
