package pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:App.properties")
public class FruitConfig {

    @Autowired
    private Environment env;

    @Bean
    public FruitService fruitService(Fruit fruit){
        FruitService service = new FruitService();
        service.setFruit(fruit);
        return service;
    }


    @Bean
    public Fruit fruit(@Value("${count}") int  count ,@Value("${password}") String password ){
        Apple apple = new Apple();
        apple.setCount(count);
        return apple;
    }

    //有这个bean才能使用占位符
    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }



}
