
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
public class DeleteProfessor {
    
    public DeleteProfessor() {
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
        Professor professor = new Professor("Steve", null, 6);
        
        if(!MongoHelper.save(professor, "professors"))
            TestHelper.failed("save failed");
        
        //Professor testProf = (Professor) MongoHelper.fetch(professor,"professors");
       
         if(!MongoHelper.delete(professor, "professors"))
            TestHelper.failed("delete failed");
        
        if(MongoHelper.fetch(professor,"professors") != null)
            TestHelper.failed("professor was not deleted!");
        
        System.out.println("deleted professor id = "+professor.getId());
        
        TestHelper.passed();
    }
}
