import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Playground {
    // Reflection library is a library that allows you to write Java code that READS your code!!!
    // very meta *reflective*

    public static void main(String[] args) {
        System.out.println(MathCalculator.add(20,15));
        // we can programmatically get information for another class
        Class mathClass = MathCalculator.class;// The Class class.
        // A class that holds infomration about a class
        Class stringClass = String.class;

//        Method[] methods = mathClass.getMethods();
//        for(Method m: methods){
//            System.out.println(m);
//        }

        Field[] fields = mathClass.getFields();

        for(Field f: fields){
            System.out.println(f);
        }
        try {
            System.out.println(MathCalculator.pi);
            Field f = mathClass.getField("pi");
            System.out.println(f);
            f.setDouble(null,5);
            System.out.println(MathCalculator.pi);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
