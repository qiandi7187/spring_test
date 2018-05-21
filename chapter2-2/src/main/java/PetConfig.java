import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;

import java.util.Random;


/**
 * spring 匹配规则：按类型或者名称 自动匹配
 * 方法名即为id
 * 如果有两个类型的对象 为避免混淆 可以限定对象名称
 */
@Configuration
public class PetConfig {

    @Bean
    public Person person(@Qualifier("dog") Pet pet){
        Person person =  new Person();
        person.setPet(pet);
        return person;
    }


    @Bean
    @Qualifier("cat")
    public Pet cat(){
        return new Cat();
    }

    @Bean
    //@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Qualifier("dog")
    public Pet dog(){
        return new Dog();
    }




}
