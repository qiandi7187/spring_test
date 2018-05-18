package example.ioc.autowire;


import org.springframework.stereotype.Component;

@Component
public class Apple implements Fruit {

    public void grow() {
        System.out.println("Apple is growing!!!");
    }
}
