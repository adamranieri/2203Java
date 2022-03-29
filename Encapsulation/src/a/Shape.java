package a;

public class Shape {
    // same scope but DIFFERENT levels of ACCESS
    // 4 levels of ACCESS Modifiers in Java
    // They determine WHERE a method or variable can be reached/ is visible from

    // Can be accessed ANYWHERE in the application
    public static void pubHello(){
        System.out.println("Hello from a public method");
    }

    // default + (Inherenting subclasses in other packages)
    protected static void proHello(){
        System.out.println("Hello from my protected method");
    }

    // Can be accessed only within the PACKAGE
    static void defaultHello(){
        System.out.println("Hello from a default access modifier method");
    }

    // Can be accessed only within the class
    private static void privHello(){
        System.out.println("Hello from a private method");
    }

}
