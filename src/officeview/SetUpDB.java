/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package officeview;

import order.util.MongoHelper;
import officeview.OfficeView.School;

/**
 *
 * @author jcooney7722
 */
public class SetUpDB {
    
    public SetUpDB() {}
    
    public static void main(String[] args){
        
        MongoHelper.setDB("officeview");
        
        MongoHelper.getCollection("professors").drop();
        
        Professor professor = new Professor("steve","smith",null,null,"","steve.smith", "bluh", 3);
        TimeNode sst1 = new TimeNode(1,0,"pm",3,30,"pm");
        TimeNode sst2 = new TimeNode(2,0,"pm",3,0,"pm");
        Day ssmonday = new Day();
        Day ssthursday = new Day();
        Schedule sssched = new Schedule();
        sssched.setMonday(ssmonday);
        ssmonday.setTimes(sst1);
        sssched.setThursday(ssthursday);
        ssthursday.setTimes(sst2);
        professor.setSchedule(sssched);
        
        Professor professor2 = new Professor("ron","coleman",null,null,"","ron.coleman", "ronspw",1);
        TimeNode rct1 = new TimeNode(4,0,"pm",6,0,"pm");
        Day rcmonday = new Day();
        Day rctuesday = new Day();
        Schedule rcsched = new Schedule();
        rcsched.setMonday(rcmonday);
        rcmonday.setTimes(rct1);
        rcsched.setTuesday(rctuesday);
        rctuesday.setTimes(rct1);
        professor2.setSchedule(rcsched);
        
        
        Professor professor3 = new Professor("alan","labouseur",null,null,"","alan.labouseur", "axq1u",1);
        Professor professor4 = new Professor("ben","carle",null,null,"","ben.carle", "redE4anything",1);
        Professor professor5 = new Professor("robert","smith",null,null,"","robert.smith", "teddyBear",4);
        
        MongoHelper.save(professor,"professors");
        MongoHelper.save(professor2,"professors");
        MongoHelper.save(professor3,"professors");
        MongoHelper.save(professor4,"professors");
        MongoHelper.save(professor5,"professors");
    }
}
