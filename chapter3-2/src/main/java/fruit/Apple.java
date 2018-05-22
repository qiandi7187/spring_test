package fruit;

import fruit.Fruit;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
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
}
