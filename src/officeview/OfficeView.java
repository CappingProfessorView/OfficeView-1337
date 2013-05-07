/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package officeview;

import com.mongodb.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import org.jongo.*;
//import com.mongodb.Mongo;
//import com.mongodb.MongoColle
import java.util.logging.Level;
import java.util.logging.Logger;
//import org.jongo.Jongo;

/**
 *
 * @author Mike
 */
public class OfficeView {
    
    static DB db;
    static Jongo jongo;
    static MongoCollection professors;
    static Dimension screensize;
    static String image = "icon2.png";
    /*static int currentUserID;
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
    }*/

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        screensize = Toolkit.getDefaultToolkit().getScreenSize();
        try {
            // TODO code application logic here
            //MongoHelper.setDB("officeview");
            db = new Mongo().getDB("officeview");
            jongo = new Jongo(db);
            professors = jongo.getCollection("professors");
            LaunchFrame start = new LaunchFrame();
            start.setVisible(true);
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            Logger.getLogger(OfficeView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
