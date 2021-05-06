package example.ioc.javaConfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Dog implements Pet{

    private final Logger loggrer = LoggerFactory.getLogger(this.getClass());

    public void shout() {

        loggrer.info("汪汪汪！！！");

    }
}
