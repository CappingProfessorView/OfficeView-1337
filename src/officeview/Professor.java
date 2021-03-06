/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package officeview;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
//import officeview.OfficeView.School;
import org.bson.types.ObjectId;

/**
 *
 * @author Mike
 */
public class Professor{
    
    //@JsonProperty("_id")
    //private ObjectId key = null;
    
    /** Order system id */
    //protected Integer id = -1;
    
    /** Order system update date */
    //protected Date updateDate = null;

    private String firstName = null;
    private String lastName = null;
    private Schedule schedule = null;
    private String announcement = "";
    private String userName = null;
    private int passwordHash = 0;
    private String location = "";
    private String school = "";
    private boolean isAdmin;
    /* status key: 
     * 0 = not available
     * 1 = available
     * 2 = Busy
     * 3 = be back soon
     */
    private int status = 0;
    
    public Professor(){}
    
    public Professor(String firstName, String lastName, String location, Schedule schedule, 
                    String announcement, String userName, String password, String school,
                    boolean isAdmin){
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.schedule = schedule;
        this.announcement = announcement;
        this.userName = userName;
        this.passwordHash = password.hashCode();
        this.school = school;
        this.isAdmin = isAdmin;
        //setId();
    }
    
    public String getProfessor(){
        return this.getFirstName() + " " + this.getLastName() + "\n" + 
                    this.getLocation() + "\n" + this.getStatus();
    }
    
    /*public Integer getId() {
        return this.id;
    }*/
    
    /*private void setId() {
        id = userName.hashCode();
    }*/
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String fn){
        firstName = fn;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String ln){
        lastName = ln;
    }
    
    public String setAnnouncement(String psa){
        this.announcement = psa;
        return psa;
    }

    public String getAnnouncement(){
        return announcement;
    }

    public void deleteAnnouncement(){
        this.announcement = null;
    }

    public void setSchedule(Schedule sched) {
        this.schedule = sched;
    }
    
    public Schedule getSchedule() {
        return schedule;
    }
    
    public String getLocation(){
        return location;
    }
    
    public void setLocation(String loc){
        this.location = loc;
    }
    
    public void setStatus(int status){
        this.status = status;
    }
    
    public String getStatus(){
        String temp = "";
        switch(this.status)
        {
            case 0: temp = "Not Available"; break;
            case 1: temp =  "Available"; break;
            case 2: temp =  "Busy"; break;
            case 3: temp =  "Be Back Soon"; break;
            default: temp =  "Not Available"; break;
                
        }
        return temp;
    }
    
    /*public void setStatus(int i){
        if(i >= 1 && i <= 3)
            status = i;
        else
            System.out.println("invalid input");
    }*/
    
    public String getUserName(){
        return userName;
    }
    
    public void setUserName(String un){
        userName = un;
        //setId();
    }
    
    public int getPasswordHash(){
        return passwordHash;
    }
    
    public void setPasswordHash(int i){
        passwordHash = i;
    }
    
    @Override
    public String toString (){
        if(this.getSchedule() != null){
            return "<html>" + this.getFirstName() + " " + this.getLastName() + "<br>" + 
                    this.getStatus() + "<br>" + this.getSchedule() + this.getLocation() +
                    "<br>" +this.getSchool() + "<br>" + this.getAnnouncement() + "</html>";
        }
        return "<html>" + this.getFirstName() + " " + this.getLastName() + "<br>" +
                this.getStatus() + "<br>Office hours not available.<br>" + this.getSchool() + 
                "<br>" + this.getAnnouncement() + "</html>";
    }
    
    public String getSchool(){
        return this.school;
    }
    
    public void setSchool(String school){
        this.school = school;
    }
    
    public boolean getIsAdmin(){
        return isAdmin;
    }
    
    public void setIsAdmin(boolean set){
        isAdmin = set;
    }
}
