import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * 本例用来测试qualifier
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PetConfig.class)
@ActiveProfiles("test")
public class JavaConfigToBeanTest {

    private final Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Person person;

    @Autowired
    @Qualifier("dog")
    private Pet pet;




    @Test
    public void testPerson(){
        person.getPet().shout();

    }

    @Test
    public void testPet(){
        pet.shout();

    }






}
