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
public class Enroll_Postgraduate_Degrees {
    
    String Username;
    String SID;
    String CID;


    public Enroll_Postgraduate_Degrees(String Username,String SID,String CID) {

        this.Username=Username;
        this.SID=SID;
        this.CID=CID;
    }

    public String getUsername()
    {
        return Username;
    }
    
     public String getSID()
    {
        return SID;
    }
     
      public String getCID()
    {
        return CID;
    }
    
}