/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package officeview;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import org.bson.types.ObjectId;

/**
 *
 * @author Mike
 */
public class Professor{
    
    @JsonProperty("_id")
    private ObjectId key = null;
    
    /** Order system id */
    protected Integer id = -1;
    
    /** Order system update date */
    protected Date updateDate = null;

    private String firstName = null;
    private String lastName = null;
    private Schedule schedule = null;
    private String announcement = null;
    private String userName = null;
    private int passwordHash = 0;
    /* status key: 
     * 0 = not available
     * 1 = available
     * 2 = Busy
     * 3 = be back soon
     */
    private int status = 0;
    
    public Professor(){}
    
    public Professor(String userName){
        this.userName = userName;
        id = userName.hashCode();
    }
    
    public Professor(String firstName, String lastName, Schedule schedule, String announcement, String userName, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.schedule = schedule;
        this.announcement = announcement;
        this.userName = userName;
        id = userName.hashCode();
        passwordHash = password.hashCode();
    }
    
    public Integer getId() {
        return this.id;
    }
    
    private void setId() {
        id = userName.hashCode();
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
    
    public String getStatus(){
        String temp = "";
        switch(this.status)
        {
            case '1': temp =  "Available"; break;
            case '2': temp =  "Busy"; break;
            case '3': temp =  "Be Back Soon"; break;
            default: temp =  "Not Available";
                
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
        setId();
    }
    
    public int getPasswordHash(){
        return passwordHash;
    }
    
    public void setPasswordHash(int i){
        passwordHash = i;
    }
}
