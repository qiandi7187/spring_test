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

    @Test
    public void testFruit(){
        fruit.grow();
    }



}
