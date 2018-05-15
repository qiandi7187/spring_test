import com.example.xml.CarService;
import com.example.xml.TankService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * 本例用来测试spring中xml方式初始化bean的方式
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:xmlToBean.xml")
public class XmlToBeanTest {

    private final Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CarService carService;
    @Autowired
    private TankService tankService;


    //测试构造方法注入
    @Test
    public void testCar(){
        carService.move();
        logger.info("{}", "testCar");
    }


    //测试set注入
    @Test
    public void testTank(){
        tankService.move();

    }



}
