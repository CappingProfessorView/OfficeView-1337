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
        
        Professor professor = new Professor("steve","smith","",null,"","steve.smith", "stevespw", "Liberal Arts", false);
        TimeNode sst1 = new TimeNode("1","00","PM","3","30","PM");
        TimeNode sst1_5 = new TimeNode("5","00","PM","6","15","PM");
        sst1.setNext(sst1_5);
        TimeNode sst2 = new TimeNode("2","00","PM","3","00","PM");
        Day ssmonday = new Day();
        Day ssthursday = new Day();
        Schedule sssched = new Schedule();
        sssched.setMonday(ssmonday);
        ssmonday.setTimes(sst1);
        sssched.setThursday(ssthursday);
        ssthursday.setTimes(sst2);
        professor.setSchedule(sssched);
        
        Professor professor2 = new Professor("ron","coleman","",null,"","ron.coleman", "ronspw","Computer Science & Mathematics", false);
        TimeNode rct1 = new TimeNode("4","00","PM","6","00","PM");
        Day rcmonday = new Day();
        Day rctuesday = new Day();
        Schedule rcsched = new Schedule();
        rcsched.setMonday(rcmonday);
        rcmonday.setTimes(rct1);
        rcsched.setTuesday(rctuesday);
        rctuesday.setTimes(rct1);
        professor2.setSchedule(rcsched);
        
        
        Professor professor3 = new Professor("alan","labouseur","",null,"","alan.labouseur", "alanspw","Computer Science & Mathematics", false);
        Professor professor4 = new Professor("ben","carle","",null,"","ben.carle", "benspw","Computer Science & Mathematics", false);
        Professor professor5 = new Professor("robert","smith","",null,"","robert.smith", "robertspw","Management", false);
        Professor professor6 = new Professor("bob","smith","",null,"","bob.smith", "bobspw","Computer Science & Mathematics", false);
        Professor admin = new Professor("","Administrator","",null,"","admin","analpacaatemybanana1","",true);
        
        professors.save(professor);
        professors.save(professor2);
        professors.save(professor3);
        professors.save(professor4);
        professors.save(professor5);
        professors.save(professor6);
        professors.save(admin);
    }
}
