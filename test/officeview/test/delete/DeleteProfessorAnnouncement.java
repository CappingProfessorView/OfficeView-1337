
package officeview.test.delete;
import officeview.Professor;

import officeview.test.util.TestHelper;
import order.util.MongoHelper;
import org.junit.*;

/**
 * This case deletes an entry in the database and to test the delete, tries to
 * read it back. If the read fails, the test succeeds.
 * @author Ron Coleman, Ph.D.
 */
public class DeleteProfessorAnnouncement {
    
    public DeleteProfessorAnnouncement() {
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
        
        //if(!MongoHelper.save(new Professor(),"professors"))
        //    TestHelper.failed("professor save failed!");
    }
    
    @After
    public void tearDown() {
        TestHelper.signoff(this);
    }

    @Test
    public void test() {
        Professor professor = new Professor("Ron", null, 6);
        professor.setAnnouncement("This is a test announcement");
        
        if(!MongoHelper.save(professor, "professors"))
            TestHelper.failed("save failed");
        
        Professor testProf = (Professor) MongoHelper.fetch(professor,"professors");
       
        testProf.deleteAnnouncement();
        
        if(testProf.getAnnouncement() != null)
            TestHelper.failed("delete failed");
        
        if(!MongoHelper.save(testProf, "professors"))
            TestHelper.failed("save failed");
        
        System.out.println("deleted professor announcement = "+ professor.getAnnouncement());
        
        TestHelper.passed();
    }
}
