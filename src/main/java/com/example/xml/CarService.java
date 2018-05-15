package com.example.xml;


/**
 * 构造器注入测试
 */
public class CarService {

    private Moveable moveable;

    public CarService(Moveable moveable) {
        this.moveable = moveable;
    }

    public void move(){
        moveable.move();
    }


}
