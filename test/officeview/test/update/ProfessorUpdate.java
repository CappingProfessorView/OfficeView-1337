
package officeview.test.update;

import java.util.Random;
import officeview.Professor;
import officeview.test.util.TestHelper;
import order.util.MongoHelper;
import org.junit.*;

/**
 * This case updates a newly created professor.
 * @author Ron Coleman
 */
public class ProfessorUpdate {
    
    public ProfessorUpdate() {
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
        
        MongoHelper.save(new Professor(),"professors");         
    }
    
    @After
    public void tearDown() {
        TestHelper.signoff(this);
    }

    @Test
    public void test() {
        Professor professor =
                (Professor) MongoHelper.fetch(new Professor(0),"professors");
        
        if(professor == null) {
            TestHelper.failed("professor not found");
        }
        
        
        if(!MongoHelper.save(professor, "professors")) {
            TestHelper.failed("update failed");
        }
        
        Professor copy =
            (Professor) MongoHelper.fetch(new Professor(professor.getId()),"professors");
                
        TestHelper.asserting(copy.getId().equals(professor.getId()));
        
        System.out.println("updated professor id = "+professor.getId());
        
        TestHelper.passed();
    }    
}
