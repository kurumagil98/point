package models;

public class StudentC {
        
    String Name;
    String Gender;
    String Contact;
    String Email;
    String Course;
    
    public StudentC(String Name,String Gender,String ID,String Contact,String Email,String Course)
    {
        this.Name=Name;
        this.Gender=Gender;
        this.Contact=Contact;
        this.Email=Email;
        this.Course=Course;
        
    }
    public String getName(){
        return Name;
    }
    public String getGender(){
        return Gender;
    }
    public String getCourse(){
        return Course;
    }
    public String getContact(){
        return Contact;
    }
    public String getEmail(){
        return Email;
    }
}
