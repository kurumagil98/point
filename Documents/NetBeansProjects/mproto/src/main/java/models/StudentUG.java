package models;


public class StudentUG {
        
    String Name;
    int Age;
    String Address;
    String Gender;
    String Contact;
    String Email;
    String Course;
    
    public StudentUG(String Name,int Age,String Address,String Gender,String ID,String Contact,String Email,String Course)
    {
        this.Name=Name;
        this.Age=Age;
        this.Address=Address;
        this.Gender=Gender;
        this.Contact=Contact;
        this.Email=Email;
        this.Course=Course;
        
    }
    public String getName(){
        return Name;
    }
        public int getAge(){
        return Age;
    }
    public String getAddress(){
        return Address;
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
