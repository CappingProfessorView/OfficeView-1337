/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package officeview;

import com.mongodb.*;
import org.jongo.*;
//import com.mongodb.Mongo;
//import com.mongodb.MongoColle
import java.net.UnknownHostException;
//import org.jongo.Jongo;

/**
 *
 * @author Mike
 */
public class OfficeView {
    
    static DB db;
    static Jongo jongo;
    static MongoCollection professors;
    public enum School {
        COMMUNICATION_ARTS ("Communication & the Arts"),
        COMPUTER_SCIENCE_MATH ("Computer Science & Mathematics"),
        GLOBAL_PROFESSIONAL_PROGRAMS ("Global and Professional Programs"),
        LIBERAL_ARTS ("Liberal Arts"),
        MANAGEMENT ("Management"),
        SCIENCE ("Science"),
        SOCIAL_BEHAVIORAL_SCIENCES ("Social & Behavioral Sciences");
        
        private String school;        
        School (String school){
            this.school = school;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException {
        // TODO code application logic here
        //MongoHelper.setDB("officeview");
        db = new Mongo().getDB("officeview");
        jongo = new Jongo(db);
        professors = jongo.getCollection("professors");
        LaunchFrame start = new LaunchFrame();
        start.setVisible(true);
    }
}
