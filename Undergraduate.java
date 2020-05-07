package Models;

public class UnderGraduate {
    String courseName;
    String cid;
    String tDuration;
    int cFee;
    
    public UnderGraduate(String courseName,String cid,String tDuration,int cFee)
    {
        this.courseName=courseName;
        this.cid=cid;
        this.tDuration=tDuration;
        this.cFee=cFee;
    }
    
    public String getCoursename(){
        return courseName;
    }
    public String getCid(){
        return cid;
    }
    public String getDuration(){
        return tDuration;
    }
    public int getCfee(){
        return cFee;
    }
}
