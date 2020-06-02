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
public class Student_Bsc_Degree_Qualifications {
    
    String Qualification;
    String year;
    String university;
    String field;
    String BSc_Class_GPA;


 public Student_Bsc_Degree_Qualifications(String Qualification,String year,String university,String field,String BSc_Class_GPA) {

        this.Qualification=Qualification;
        this.year=year;
        this.university=university;
        this.field=field;
        this.BSc_Class_GPA=BSc_Class_GPA;
    }

    public String getQualification()
    {
        return Qualification;
    }
    
     public String getyear()
    {
        return year;
    }
     
      public String getuniversity()
    {
        return university;
    }
      
    public String getfield()
    {
        return field;
    }
    
     public String BSc_Class_GPA()
    {
        return BSc_Class_GPA;
    }
     
}     