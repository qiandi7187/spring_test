import fruit.Fruit;
import fruit.FruitConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
    private Fruit fruit2;

    @Test
    public void testPerson(){
        fruit.grow();
    }


    /**
     * 测试默认模式下 是scope是singleton  创建多个则需修改为protoType
     */
    @Test
    public void testScope(){

        for(int i=0;i<3;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            fruit.grow();

        }
        System.out.println("------------fruit2---------------");
        for(int i=0;i<2;i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            fruit2.grow();
        }



    }



}
