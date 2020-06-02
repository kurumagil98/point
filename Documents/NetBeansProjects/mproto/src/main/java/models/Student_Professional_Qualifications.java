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
public class Student_Professional_Qualifications {
    
    String Professional_Qualification;
    String Awarded_Institute;
    String Date_awarded;
    String Specialization;
     


public Student_Professional_Qualifications(String Professional_Qualification,String Awarded_Institute,String Date_awarded,String Specialization) {

        this.Professional_Qualification=Professional_Qualification;
        this.Awarded_Institute=Awarded_Institute;
        this.Date_awarded=Date_awarded;
        this.Specialization=Specialization;
       
    }

    public String getProfessional_Qualification()
    {
        return Professional_Qualification;
    }
    
     public String getAwarded_Institute()
    {
        return Awarded_Institute;
    }
     
      public String getDate_awarded()
    {
        return Date_awarded;
    }
      
    public String getSpecialization()
    {
        return Specialization;
    }
    
    
     
}     