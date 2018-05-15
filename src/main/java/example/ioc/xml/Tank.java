package example.ioc.xml;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tank implements Moveable{

    private final Logger logger= LoggerFactory.getLogger(this.getClass());

    public void move() {
        logger.info("Tank is moving");
    }
}
