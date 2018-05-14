package com.xml.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Car implements Moveable{

    private final Logger logger= LoggerFactory.getLogger(this.getClass());

    public void move() {
        logger.info("Car is moving");
    }
}
