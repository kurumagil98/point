/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author User
 */
public class accept {
   public String empId;
   public String name;
   public String nic;
   public String age;
   public String department;
   public String designation;
   public String phoneNumber;
   public String team;
   public String task;
   public String date;
   
   
    
    public accept(String empId,String name,String nic,String age,String department,
            String designation,String phoneNumber,String task,String date)
    {
    this.empId=empId;
    this.name=name;
    this.nic=nic;
    this.age=age;
    this.department=department;
    this.designation=designation;
    this.phoneNumber=phoneNumber;
    }

    
}
