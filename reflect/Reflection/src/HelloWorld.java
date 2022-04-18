import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class HelloWorld {

    // annotations do NOTHING by themselves
    // Sky is the limit when you use reflection
    @Default
    public static String greeting;


    public static void main(String[] args) {
        setUp(); // method that reads annotations you put in your code and uses it to programmaticaly configure your app
        System.out.println(greeting);
    }

    public static void setUp(){
        try {
            Field field = HelloWorld.class.getField("greeting");
            Annotation[] annotations = field.getDeclaredAnnotations();
            for(Annotation a: annotations){
                System.out.println(a);
            }
            field.set(null,"Hello with a basic greeting");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
