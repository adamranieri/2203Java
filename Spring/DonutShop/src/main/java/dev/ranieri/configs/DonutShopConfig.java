package dev.ranieri.configs;

import dev.ranieri.models.Donut;
import dev.ranieri.models.Jelly;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class DonutShopConfig {

    @Bean(name = "StrawberryJelly")
    public Jelly strawberry(){
        Jelly jelly = new Jelly("Organic Stawberry Jam");
        return jelly;
    }

    @Bean(name = "BlueberryJelly")
    public Jelly blueberry(){
        Jelly jelly = new Jelly("Gluten Free Blueberry Jam");
        return jelly;
    }

    @Bean(name = "StrawberryBoom")
    public Donut strawberryDonut(){
        // Dependency injection
        // Creating an object and passing in its dependencies, in this case strawberry jelly
        // This is called Constructor Dependency injection
        Donut donut = new Donut("Strawberry Boom",2.99,this.strawberry());
        return donut;
    }

    @Bean(name = "BlueberryBloom")
    public Donut blueberryDonut(){
        // Setter dependency injection
        Donut donut = new Donut();
        donut.setName("Blueberry Bloom");
        donut.setCost(1.95);
        donut.setJelly(this.blueberry());
        return donut;
    }
}
