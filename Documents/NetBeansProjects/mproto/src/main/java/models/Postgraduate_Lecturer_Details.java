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
public class Postgraduate_Lecturer_Details {
    
    String Name;
    String Lecturer_ID;
    String Faculty;
    String Subject;
    String Qualification;
    
 public Postgraduate_Lecturer_Details(String Name,String Lecturer_ID,String Faculty,String Subject,String Qualification)
    {
        this.Name=Name;
        this.Lecturer_ID=Lecturer_ID;
        this.Faculty=Faculty;
        this.Subject=Subject;
        this.Qualification=Qualification;
    }
    
    public String getName()
    {
        return Name;
    }
    
    public String getLecturer_ID()
    {
        return Lecturer_ID;
    }
    
    public String getFaculty()
    {
        return Faculty;
    }
    
    public String getSubject()
    {
        return Subject;
    }
    
     public String getQualification()
    {
        return Qualification;
    }
     
}