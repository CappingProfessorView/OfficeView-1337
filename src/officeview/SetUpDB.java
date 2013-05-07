/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package officeview;

//import order.util.MongoHelper;
//import officeview.OfficeView.School;
import com.mongodb.*;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jongo.*;

/**
 *
 * @author jcooney7722
 */
public class SetUpDB {
    
    public SetUpDB() {}
    
    public static void main(String[] args){
        
        DB db = null;
        Jongo jongo = null;
        MongoCollection professors = null;
        try {
            db = new Mongo().getDB("officeview");
            jongo = new Jongo(db);
            professors = jongo.getCollection("professors");
        } catch (UnknownHostException ex) {
            Logger.getLogger(SetUpDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        //MongoHelper.setDB("officeview");
        
        //MongoHelper.getCollection("professors").drop();
        professors.drop();
        
        Professor professor = new Professor("steve","smith",null,null,"","steve.smith", "bluh", "Liberal Arts");
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
        
        Professor professor2 = new Professor("ron","coleman",null,null,"","ron.coleman", "ronspw","Computer Science & Mathematics");
        TimeNode rct1 = new TimeNode(4,0,"pm",6,0,"pm");
        Day rcmonday = new Day();
        Day rctuesday = new Day();
        Schedule rcsched = new Schedule();
        rcsched.setMonday(rcmonday);
        rcmonday.setTimes(rct1);
        rcsched.setTuesday(rctuesday);
        rctuesday.setTimes(rct1);
        professor2.setSchedule(rcsched);
        
        
        Professor professor3 = new Professor("alan","labouseur",null,null,"","alan.labouseur", "axq1u","Computer Science & Mathematics");
        Professor professor4 = new Professor("ben","carle",null,null,"","ben.carle", "redE4anything","Computer Science & Mathematics");
        Professor professor5 = new Professor("robert","smith",null,null,"","robert.smith", "teddyBear","Management");
        
        professors.save(professor);
        professors.save(professor2);
        professors.save(professor3);
        professors.save(professor4);
        professors.save(professor5);
    }
}
