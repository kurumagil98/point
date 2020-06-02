/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 *
 * @author User
 */

import Interface.addEmp;
import databaseLayer.DatabaseConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
public class add {
   
        private DatabaseConnection con;     
        public add ()     
        {
            con=DatabaseConnection.getSingleConnection();
        }      
         public boolean Addemployee(add a)     
         {         
         try        
         { 
//        String query="insert into add(empId,name,nic,age,department,designation,phoneNumber)values(?,?,?,?,?,?,?)";
//         PreparedStatement pst= con.prepareStatement(query);
//         pst.setString(1,a);
//         pst.setString(2,b);
//         pst.setString(3,c);
//         pst.setString(4,d);
//         pst.setString(5,e);
//         pst.setString(6,f);
//         pst.setString(7,g);
           String query="insert into Rider "+ "(Name,Age,Country,Weight,Height)"+ 
                   " values('"+ a+"',"+a+","+a+","+a+","+a+","+a+","+a+")"; 
          boolean result=con.Execute(query);   
          return result;         
         }catch(Exception sql)         
         {             
             System.out.println("Error "+sql.getMessage());            
             return false;          
         }                
         }         

    
}
