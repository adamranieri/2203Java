package dev.ranieri.configs;

import dev.ranieri.models.Box;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// without making application context these annotations do absolutely nothing
// The application Context uses reflection to read the annotations and construct the beans

@Component // Mark a class as an important to read for the Application Context
@Configuration// Stereotype. What is the purpose of this class.
// @Configuration is a class used from defining beans for the application context
public class BoxConfig {

    @Bean(name = "BigBox")
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON) // one instance and only ever one instace
    public Box highValueBox(){
        System.out.println("BigBox bean created");
        Box bigBox = new Box(100);
        return bigBox;
    }

    @Bean(name = "TinyBox")
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE) // create an instance EACH TIME you get it from the AC
    public Box lowValueBox(){
        System.out.println("Tiny box bean created");// singleton beans are created when the application context is created
        Box  smallBox = new Box(2);
        return smallBox;
    }

}
