package com.xml.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
