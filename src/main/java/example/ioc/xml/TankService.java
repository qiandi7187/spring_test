package example.ioc.xml;

/**
 * 构造器注入测试
 */
public class TankService {


    private Moveable moveable;

    public Moveable getMoveable() {
        return moveable;
    }

    public void setMoveable(Moveable moveable) {
        this.moveable = moveable;
    }

    public void move(){
        moveable.move();
    }




}
