/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author TOSHIBA
 */
public class Student_Personal_Details1 {
    
    String Name_Initials;
    String Full_Name;
    String Status;
    String NIC;
    String day_of_birth;
    String month_of_birth;
    String year_of_birth;
    String Address;
    String Nationality;
    String Marital_Status;
    String mobile;
    String r_mobile;
    String E_mail;
 
  public Student_Personal_Details1(String Name_Initials,String Full_Name,String Status, String NIC,String day_of_birth, String month_of_birth,String year_of_birth, String Address, String Nationality, String Marital_Status,String mobile,String r_mobile,String E_mail)  
    
  {
  
      this.Name_Initials=Name_Initials;
      this.Full_Name=Full_Name;
      this.Status=Status;
      this.NIC=NIC;
      this.day_of_birth=day_of_birth;
      this.month_of_birth=month_of_birth;
      this.year_of_birth=year_of_birth;
      this.Address=Address;
      this.Nationality=Nationality;
      this.Marital_Status=Marital_Status;
      this.mobile=mobile;
      this.r_mobile=r_mobile;
      this.E_mail=E_mail;
     
  }
    
    
   public String getName_Initials()
    {
        return Name_Initials;
    }
    
     public String getFull_Name()
    {
        return Full_Name;
    }
     
      public String getStatus()
    {
        return Status;
    }
    
       public String getNIC()
    {
        return NIC;
    }
    
     public String getday_of_birth()
    {
        return day_of_birth;
    }
     
      public String getmonth_of_birth()
    {
        return month_of_birth;
    }
    
       public String getyear_of_birth()
    {
        return year_of_birth;
    }
    
     public String getAddress()
    {
        return Address;
    }
     
      public String getNationality()
    {
        return Nationality;
    }
     
     public String getMarital_Status()
    {
        return Marital_Status;
    }
    
     public String getmobile()
    {
        return mobile;
    }
     
      public String getr_mobile()
    {
        return r_mobile;
    }  
      
       public String getE_mail()
    {
        return E_mail;
    }
    
    
      
      
      
      
      
}

