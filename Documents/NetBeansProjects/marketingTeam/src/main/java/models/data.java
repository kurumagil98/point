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
public class data {
    public String empId;
   public String name;
   public String nic;
   public int age;
   public String department;
   public String designation;
   public int phoneNumber;
   public String team;
   
    
    public data(String empId,String name,String nic,int age,String department,String designation,int phoneNumber,String team)
    {
    this.empId=empId;
    this.name=name;
    this.nic=nic;
    this.age=age;
    this.department=department;
    this.designation=designation;
    this.phoneNumber=phoneNumber;
    this.team=team;
    }
    public void add(String Id,String n,String ic,int a,String depar,String des,int no,String te)
    {
    empId=Id;
    name=n;
    nic=ic;
    age=a;
    department=depar;
    designation=des;
    phoneNumber=no;
    team=te;
    }
    public String update(String it,String change)
    {
        return change;
    }
    public void delete(String empId)
    {
        
    }
    
}
