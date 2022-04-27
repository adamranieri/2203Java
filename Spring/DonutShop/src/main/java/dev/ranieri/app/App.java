package dev.ranieri.app;

import dev.ranieri.configs.BoxConfig;
import dev.ranieri.configs.DonutShopConfig;
import dev.ranieri.models.Box;
import dev.ranieri.models.Donut;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        // create an application context populated with the beans defined in that config file
        ApplicationContext ac = new AnnotationConfigApplicationContext(DonutShopConfig.class);
        Donut donut = ac.getBean("BlueberryBloom", Donut.class);
        System.out.println(donut);
//
//        Box box2 = ac.getBean("BigBox", Box.class);
//
//        System.out.println(box2);
//
//        //beans are default singletons. Only one of that bean ever exists in the Applicaiton Context
//        //prototype beans will be a new bean object everytime you get them from the AC
//        Box a = ac.getBean("TinyBox", Box.class);
//        Box b = ac.getBean("TinyBox", Box.class);
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(a==b);// true if the memory address is the same and therfore the same object



    }
}
