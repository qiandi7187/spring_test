import fruit.Fruit;
import fruit.FruitConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * 本例用来测试scope
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = FruitConfig.class)
public class JavaConfigAutowireTest {

    private final Logger logger= LoggerFactory.getLogger(this.getClass());


    @Autowired
    private Fruit fruit;

    @Autowired
    private Environment env;

    @Value("${password}")
    private String password;

    @Test
    public void testEnvironment(){
        System.out.println(env.getProperty("password"));
        int count = env.getProperty("count",Integer.class);
        System.out.println("count = " + count);
        System.out.println("count2 = " + env.getProperty("count2",Integer.class));
        System.out.println("count2 = " + env.getProperty("count2",Integer.class,30));
    }


    @Test
    public void test2(){
        fruit.grow();
    }


    @Test
    public void testPassword(){
        System.out.println(password);
    }




}
