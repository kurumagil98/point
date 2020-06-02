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
public class Student_Employment_History {
    
    String Start_date;
    String End_date;
    String Position_held;
    String Details;
    
public Student_Employment_History(String Start_date,String End_date,String Position_held,String Details) {

        this.Start_date=Start_date;
        this.End_date=End_date;
        this.Position_held=Position_held;
        this.Details=Details;
       
    }

    public String getStart_date()
    {
        return Start_date;
    }
    
     public String End_date()
    {
        return End_date;
    }
     
      public String getPosition_held()
    {
        return Position_held;
    }
      
    public String getDetails()
    {
        return Details;
    }
    
    
     
}     
