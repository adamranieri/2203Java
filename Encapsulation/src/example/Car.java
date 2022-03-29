package example;

public class Car {

    String make;
    String model;

    static int counter = 0;

    int miles;

    // static methods CAN only use Static variables
    // Static methods are used directly from the class not from an object
    // therefore the 'this' refers to nothing.
    static void showMileage(){
        // System.out.println(this.miles);
        System.out.println(Car.counter);
    }
    // static can only use static
    // instances may use static methods

}
