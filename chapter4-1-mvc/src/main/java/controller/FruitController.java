package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pojo.Fruit;

@RestController
@RequestMapping("/fruit")
public class FruitController {

    @Autowired
    private Fruit fruit;

    @RequestMapping("/show")
    public Object show(){
        fruit.grow();
        return fruit;
    }

    @RequestMapping("/test")
    public String test(){
        return "test";
    }



}
