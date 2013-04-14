/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package officeview;

/**
 *
 * @author Mike
 */
public class Schedule{
     
    private Day monday, tuesday, wednesday, thursday, friday;
    
    public Schedule(){
        this.monday = null;
        this.tuesday = null;
        this.wednesday = null;
        this.thursday = null;
        this.friday = null;
    }
    
    public Schedule(Day monday, Day tuesday, Day wednesday, Day thursday, Day friday){
        this.monday = monday;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
    }
    
    public Day getMonday(){
      return this.monday;
    }

    public Day getTuesday(){
      return this.tuesday;
    }

    public Day getWednesday(){
      return this.wednesday;
    }

    public Day getThursday(){
      return this.thursday;
    }

    public Day getFriday(){
      return this.friday;
    }

    public void setMonday(Day d){
      this.monday = d;
    }

    public void setTuesday(Day d){
      this.tuesday = d;
    }

    public void setWednesday(Day d){
      this.wednesday = d;
    }

    public void setThursday(Day d){
      this.thursday = d;
    }

    public void setFriday(Day d){
      this.friday = d;
    }
}
