package Models;

public class Certificate {
     String cName;
     String courseId;
     String timeDuration;
     int courseFee;
    
    public Certificate(String cName,String courseId,String timeDuration,int courseFee)
    {
        this.cName=cName;
        this.courseId=courseId;
        this.timeDuration=timeDuration;
        this.courseFee=courseFee;
    }
    
    public String getCoursename(){
        return cName;
    }
    public String getCid(){
        return courseId;
    }
    public String getDuration(){
        return timeDuration;
    }
    public int getCfee(){
        return courseFee;
    }
}
