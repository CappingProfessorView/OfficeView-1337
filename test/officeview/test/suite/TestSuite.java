package officeview.test.suite;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Runs the entire suite of tests.
 * @author Ron Coleman
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    officeview.test.create.CreateDbEntry.class,
    officeview.test.create.CreateMultTimeNodes.class,
    officeview.test.create.CreateProfessorAnnouncement.class,
    
    officeview.test.delete.DeleteProfessor.class,
    officeview.test.delete.DeleteProfessorAnnouncement.class,
    officeview.test.delete.DeleteProfessorTimeNode.class,
    
    officeview.test.read.ReadProfessor.class,
    
    officeview.test.update.ProfessorUpdate.class
    
})

public class TestSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
