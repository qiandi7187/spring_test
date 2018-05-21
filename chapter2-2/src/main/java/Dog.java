import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Dog implements Pet{

    private final Logger loggrer = LoggerFactory.getLogger(this.getClass());

    private Integer count = 0;

    public void shout() {
        loggrer.info("汪汪汪！！！");

        System.out.println(count++);
    }
}
