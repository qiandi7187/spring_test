package com.example.javaConfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cat implements Pet{

    private final Logger loggrer = LoggerFactory.getLogger(this.getClass());

    public void shout() {
        loggrer.info("瞄！！！");
    }
}
