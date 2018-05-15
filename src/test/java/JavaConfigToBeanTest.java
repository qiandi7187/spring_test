import com.example.javaConfig.Person;
import com.example.javaConfig.PetConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * 本例用来测试spring中JavaConfig方式初始化bean的方式
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PetConfig.class)
public class JavaConfigToBeanTest {

    private final Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Person person;

    @Autowired
    private Person person2;

    @Autowired
    @Qualifier("p3")
    private Person p3;

    //测试构造方法注入
    @Test
    public void testPerson(){
        person.getPet().shout();
        person2.getPet().shout();
        p3.getPet().shout();
    }



}
