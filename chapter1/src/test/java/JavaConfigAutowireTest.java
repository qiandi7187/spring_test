import example.ioc.autowire.Fruit;
import example.ioc.autowire.FruitConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * 本例用来测试spring中JavaConfig方式Autowire初始化bean的方式
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = FruitConfig.class)
public class JavaConfigAutowireTest {

    private final Logger logger= LoggerFactory.getLogger(this.getClass());


    @Autowired
    private Fruit fruit;




    @Test
    public void testPerson(){
        fruit.grow();
    }



}
