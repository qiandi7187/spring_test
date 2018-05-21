import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Random;


/**
 * spring 匹配规则：按类型或者名称 自动匹配
 * 方法名即为id
 * 如果有两个类型的对象 为避免混淆 可以限定对象名称
 */
@Configuration
public class PetConfig {

    @Bean
    public Person person(Pet cat){
        Person person =  new Person();
        person.setPet(cat);
        return person;
    }


    @Bean
    @Profile("dev")
    public Pet cat(){
        return new Cat();
    }

    @Bean
    @Profile("prod")
    public Pet dog(){
        return new Dog();
    }


    @Bean
    @Profile("test")
    public Pet randomPet(){
        int i = new Random().nextInt(2);
        return i==1?new Dog():new Cat();
    }


}
