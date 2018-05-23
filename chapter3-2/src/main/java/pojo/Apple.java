package pojo;

import org.springframework.stereotype.Component;

@Component
public class Apple implements Fruit {



    public void grow() {
        System.out.println("Apple is growing!!!");

    }

    @Override
    public void count(int i) {
        System.out.println(i);
    }


    @Override
    public void count(int i,String s,boolean b) {
        System.out.println(i+"   "+s);
    }
}
