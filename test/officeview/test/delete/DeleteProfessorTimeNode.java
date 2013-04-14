
package officeview.test.delete;
import officeview.Professor;
import officeview.Schedule;
import officeview.Day;
import officeview.TimeNode;

import officeview.test.util.TestHelper;
import order.util.MongoHelper;
import org.junit.*;

/**
 * This case deletes an entry in the database and to test the delete, tries to
 * read it back. If the read fails, the test succeeds.
 * @author Ron Coleman, Ph.D.
 */
public class DeleteProfessorTimeNode {
    
    public DeleteProfessorTimeNode() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        TestHelper.signon(this);
        
        MongoHelper.setDB("officeview");
        
        MongoHelper.getCollection("professors").drop();
        
        if(!MongoHelper.save(new Professor(),"professors"))
            TestHelper.failed("professor save failed!");
    }
    
    @After
    public void tearDown() {
        TestHelper.signoff(this);
    }

    @Test
    public void test() {
        Professor professor = new Professor("Ron", null, 5);
        Schedule testSched = new Schedule();
        Day testDay = new Day();
        TimeNode testTn = new TimeNode(3,00,"pm", 5,00,"pm");
        TimeNode testTn2 = new TimeNode(7,00,"pm", 8,00,"pm");
        testTn.setNext(testTn2);
        professor.setSchedule(testSched);
        testSched.setMonday(testDay);
        testDay.setTimes(testTn);
        
        if(!MongoHelper.save(professor, "professors"))
            TestHelper.failed("save failed");
        
        Professor testProf = (Professor) MongoHelper.fetch(professor,"professors");
       
        testProf.getSchedule().getMonday().getTimes().setNext(null);
        
        if(!MongoHelper.save(testProf, "professors"))
            TestHelper.failed("save failed");
        
        Professor testProfNew = (Professor) MongoHelper.fetch(professor,"professors");
       
        
        if(testProfNew.getSchedule().getMonday().getTimes().getNext() != null)
            TestHelper.failed("delete failed");
        
        //System.out.println("deleted professor  = "+ professor.getAnnouncement());
        
        TestHelper.passed();
    }
}
