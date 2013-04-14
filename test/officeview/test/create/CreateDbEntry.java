package officeview.test.create;

import officeview.Professor;
import officeview.test.util.TestHelper;
import order.util.MongoHelper;
import org.junit.*;

/**
 * This case creates an entry in the database.
 * @author Ron Coleman, Ph.D.
 */
public class CreateDbEntry {
    
    public CreateDbEntry() {
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
        //MongoHelper.getCollection("school").drop();
    }
    
    @After
    public void tearDown() {
        TestHelper.signoff(this);
        
    }

    @Test
    public void test() {              
        Professor professor = new Professor("Alan",null,1);
        
        //String test = Math.abs(new Random().nextLong());
        
        //professor.setPaymentMode(mode);
        
        if(!MongoHelper.save(professor,"professors")) {
            TestHelper.failed("save failed");
        }
        
        //System.out.println("saved professors id = "+contract.getId());
        
        TestHelper.passed();
    }
}
