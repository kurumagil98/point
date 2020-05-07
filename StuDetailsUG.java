package Models;

public class StudentDetailsUG {
    String name;
    String age;
    String gender;
    String address;
    String sid;
    String c_num;
    String username;
    String password;
    
    public StudentDetailsUG(String name,String age,String gender,String address,String sid,String c_num,String username)
    {
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.address=address;
        this.sid=sid;
        this.c_num=c_num;
        this.username =username;
        
    }
    public String getName(){
        return name;
    }
    public String getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public String getAddress(){
        return address;
    }
    public String getID(){
        return sid;
    }
    public String getContact(){
        return c_num;
    }
    public String getUsername(){
        return username;
    }
}
