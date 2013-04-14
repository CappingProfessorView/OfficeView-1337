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

    private String name = null;
    private Schedule schedule = null;
    private String announcement = null; 
    /* status key: 
     * 0 = not available
     * 1 = available
     * 2 = Busy
     * 3 = be back soon
     */
    private int status = 0;
    
    public Professor(){
        
    }
    
    public Professor(Integer id){
        this.id = id;
    }
    
    public Professor(String name, Schedule schedule, Integer id){
        this.name = name;
        this.schedule = schedule;
        this.id = id;
    }
    
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
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
    
}
