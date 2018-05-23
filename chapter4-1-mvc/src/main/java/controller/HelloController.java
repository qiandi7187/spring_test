package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.Fruit;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping
    public String test(){
        return "index";
    }




}
