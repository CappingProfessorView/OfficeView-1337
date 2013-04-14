package officeview.test.read;

import officeview.Professor;
import officeview.test.util.TestHelper;
import order.util.MongoHelper;
import org.junit.*;

/**
 * This case reads back a newly created entry.
 * @author Ron Coleman
 */
public class ReadProfessor {
    
    public ReadProfessor() {
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
        Professor professor = new Professor("Ron", null,2);
        
        //Long mode = Math.abs(new Random().nextLong());
        
        //contract.setPaymentMode(mode);
        
        if(!MongoHelper.save(professor,"professors")) {
            TestHelper.failed("save failed");
        }
        
        Professor copy =
            (Professor) MongoHelper.fetch(new Professor(professor.getId()),"professors");
        
        System.out.println("professor id = "+professor.getId()+" copy id = "+copy.getId());
        
        TestHelper.asserting(copy.getId().equals(professor.getId()));
        
        TestHelper.passed();
    }
}
