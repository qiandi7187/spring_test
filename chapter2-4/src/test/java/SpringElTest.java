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
public class SpringElTest {

    private final Logger logger= LoggerFactory.getLogger(this.getClass());

    @Value("#{1}")
    private  int spEl1;

    @Test
    public void testSpEl1(){
        System.out.println(spEl1);
    }

    @Value("#{3.1415926}")
    private  double spEl2;

    @Test
    public void testSpEl2(){
        System.out.println(spEl2);
    }

    //调用对象属性
    @Value("#{fruitService.fruit}")
    private Fruit spEl3;

    @Test
    public void testSpEl3(){
      spEl3.grow();
    }

    //调用对象方法返回值
    @Value("#{fruitService.showStr().toUpperCase()}")
    private String spEl4;

    @Test
    public void testSpEl4(){
        System.out.println(spEl4);
    }

    //调用类
    @Value("#{T(java.lang.Math).PI*2}")
    private Double spEl5;

    @Test
    public void testSpEl5(){
        System.out.println(spEl5);
    }

    //条件判断
    @Value("#{fruitService.showStr()=='abc'}")
    private Object spEl6;

    @Test
    public void testSpEl6(){
        System.out.println(spEl6);
    }


    //三目运算
    @Value("#{fruitService.showStr()=='abc'?'1':'2'}")
    private Object spEl7;

    @Test
    public void testSpEl7(){
        System.out.println(spEl7);
    }


}
