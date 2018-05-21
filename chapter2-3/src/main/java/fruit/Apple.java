package fruit;

import fruit.Fruit;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Apple implements Fruit {

    private int count;

    public void grow() {
        System.out.println("Apple is growing!!!");
        System.out.println(count++);
    }
}
