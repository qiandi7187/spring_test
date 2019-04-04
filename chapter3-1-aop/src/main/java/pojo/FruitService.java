package pojo;

import org.springframework.beans.factory.annotation.Autowired;


public class FruitService {

    private Fruit fruit;

    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    public void grow(){
        fruit.grow();
    }


    public String showStr() {
        return "abc";
    }

}
