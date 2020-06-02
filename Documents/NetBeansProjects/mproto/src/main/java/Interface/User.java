/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author User
 */
class User {
    public String empId;
   public String name;
   public String nic;
   public String age;
   public String department;
   public String designation;
   public String phoneNumber;
   public User(String empId,String name,String nic,String age,String department,String designation,String phoneNumber)
    {
    this.empId=empId;
    this.name=name;
    this.nic=nic;
    this.age=age;
    this.department=department;
    this.designation=designation;
    this.phoneNumber=phoneNumber;
    }
   
   public String getid(){
       return empId;
   }
   public String getname(){
       return name;
   }
   public String getnic(){
       return nic;
   }
   public String getage(){
       return age;
   }
   public String getde(){
       return designation;
   }
   public String getds(){
       return department;
   }
   public String getno(){
       return phoneNumber;
   }
}
