package Models;

public class StudentDetailsUG{
    String fname;
    String lname;
    int age;
    String gender;
    String address;
    String nic;
    int mnum;
    String email;
    //String password;
    
    public StudentDetailsUG(String fname,String lname,int age,String gender,String address,String nic,int mnum ,String email)//String c_num,String username)
    {
        this.fname=fname;
        this.lname=lname;
        this.age=age;
        this.gender=gender;
        this.address=address;
        this.nic=nic;
        this.mnum=mnum;
        this.email = email;
        
    }
    public String getFname(){
        return fname;
    }
    public String getLname(){
        return lname;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public String getAddress(){
        return address;
    }
    public String getnic(){
        return nic;
    }
    public int getMnum(){
        return mnum;
    }
    public String getEmail(){
       return email;
    }
}
