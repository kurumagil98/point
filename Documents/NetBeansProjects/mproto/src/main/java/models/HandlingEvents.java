/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author DELL
 */
public class HandlingEvents {
 
    
    int eventID;
    int nop;
    public String eType;
    public String eName;
    public String eventHandler;
    public String venue;
    
    public String PID;
    public String PName;
    int PAge;
    int PMobno;
    int PLandno;
    char Pgender;
    public String PEmail;
    
    int CrewID;
    public String CrName;
    public String CrLeader;
    int Nof_CrMem;
    
      
    
    
    
    
    public void EventDetails(int eventID, int nop, String eventName, String eType, String eventhandler, String venue){
        
      this.eventID=eventID;
      this.eName=eventName;
      this.eType=eType;
      this.nop=nop;
      this.eventHandler=eventhandler;
      this.venue=venue;
    }
    
    public void Participants(String PID, String PName , int PAge,int PMobno , int PLandno, char Pgender, String PEmail){
    
    this.PID = PID;
    this.PName = PName;
    this.PAge = PAge;
    this.PMobno = PMobno;
    this.PLandno= PLandno;
    this.Pgender = Pgender;
    this.PEmail = PEmail;
    }
    
    public void Crew( int CrewID, String CrName,String CrLeader,int Nof_CrMem){
    this.CrewID = CrewID;
    this.CrName = CrName;
    this.CrLeader = CrLeader;
    this.Nof_CrMem = Nof_CrMem;
    }
    
    public String geteName(){
    return eName;
    }
    
    public int eventID(){
    return eventID;
    }
    public int nop(){
    return nop;
    }
    
    public String eType(){
    return eType;
    }
   
    public String eventHandler(){
    return eventHandler;
    }
    
    public String venue(){
    return venue;
    } 
    
    public String PID(){
    return PID;
    }
    
    public String PName(){
    return PName;
    }
    
    int PAge(){
    return PAge;
    }
    
    int PMobno(){
    return PMobno;
    }
    
    int PLandno(){
    return PLandno;
    }
    
    char Pgender(){
    return Pgender;
    }
    
    public String PEmail(){
    return PEmail;
    }
    
    int CrewID(){
    return CrewID;
    }
    
    public String CrName(){
    return CrName;
    }
    
    public String CrLeader(){
    return CrLeader;
    }
    
    int Nof_CrMem(){
    return Nof_CrMem;
    }
    
}
