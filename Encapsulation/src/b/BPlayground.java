package b;

// classes in other packages must be imported in order to be used
import a.Shape;// will allow me to use the shape class in another package

public class BPlayground {

    public static void main(String[] args) {
        // Shape.defaultHello();
        Shape.pubHello(); // a method or variable with public access is available anywhere in a Java Program
        // Shape.proHello();
        // Shape.privHello();

    }
}
