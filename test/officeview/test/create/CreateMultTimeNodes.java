
package officeview.test.create;

//import order.entry.Product;
//import order.entry.Supply;
import officeview.Day;
import officeview.Professor;
import officeview.Schedule;
import officeview.TimeNode;
import officeview.test.util.TestHelper;
import order.util.MongoHelper;
import static org.junit.Assert.fail;
import org.junit.*;

/**
 * This case creates multiple, linked entries in the database.
 * @author Ron Coleman, Ph.D.
 */
public class CreateMultTimeNodes {
    
    /*private Product[] products = {
        new Product("westinghouse","three-light fixture",39.89),
        new Product("kenroy home","areo 2-light",46.80),
        new Product("lithonia","26-watt single-light fluorescent",56.08),
        new Product("design house","2-light ceiling mount",58.88)
    };*/    
    public CreateMultTimeNodes() {
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
    }
    
    @After
    public void tearDown() {
        TestHelper.signoff(this);
    }

    @Test
    public void test() {
        
        TimeNode n1 = new TimeNode(3, 15, "pm", 3, 30, "pm");
        TimeNode n2 = new TimeNode(6, 0, "pm", 6, 30, "pm");
        TimeNode n3 = new TimeNode(8, 30, "pm", 9, 45, "pm");
        Professor bob = new Professor();
        Schedule sched = new Schedule();
        Day today = new Day();
        
        n1.setNext(n2);
        n2.setNext(n3);
        today.setTimes(n1);
        sched.setMonday(today);
        bob.setSchedule(sched);
        for(int i=0; i < n1.getSize()-1; i++) {
            if(!MongoHelper.save(bob, "professors")) {
                TestHelper.failed("save nodes["+i+"] failed!");
            }
        }
        TestHelper.passed();
    }
}
