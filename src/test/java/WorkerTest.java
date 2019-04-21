import com.sda.first_project.production.Worker;
import com.sda.first_project.production.WorkerMotto;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/test-application-context.xml")
public class WorkerTest {

 @Autowired
 private Worker worker;

// @Before
//    public void setUp() throws Exception {
//     worker = new Worker(20, "karateka", new WorkerMotto("Too young to be stupid"));
// }
//
// @After
// public void tearDown() throws Exception{
//     worker = null;
//     }

  @Test
  public void getTools(){
      Assert.assertNotNull(worker);
      Assert.assertNotNull(worker.getTools());
  }

  @Test
    public void getProfession(){
      Assert.assertNotNull(worker);
      Assert.assertEquals(worker.getProfession(), "Programator");

  }
  @Test
    public void getAge(){
      Assert.assertEquals(worker.getAge(),25);

  }

 }




