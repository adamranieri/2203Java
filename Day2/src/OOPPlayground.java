public class OOPPlayground {

    public static void main(String [] args){

        Car ascent = new Car("Subaru", "Ascent", 900);
        ascent.describeSelf();

    }
}
// Java has 4 variable scopes.
// Java has NO GLOBAL SCOPE. Global variables are a source of name pollution.
// Accidentally naming varaibles the same and messing with each other
// Scope =  lifecycle/location of a variable

// instance = attached to an object
// static/class = attached to the class itself
// method = variable defined as a paramter in a method
// local = varaible defined WITHIN a method. Bounded by the {} it is defined in


class Car{

    static String desc = "A car is vehicle with 4 wheels";// static vairables can be used OUTSIDE of any object

    int mileage; // instance variables exist attached to an object
    String make;
    String model;

    // Constructors are special methods that create an instance of the class
    // 1. The name MUST be the same as the class
    // 2. The only methods in Java that do not have a return type
    // By default any object can be created from a class with no args// new Car()
    // but ONLY if there is no constructor already defined.
    // If you do not have a constructor one will be provided for you.
    Car(String paramMake, String paramModel, int paramMileage){
        System.out.println("Building a car to your specs");
        this.make = paramMake;
        this.model = paramModel;
        this.mileage = paramMileage;
    }

    // miles is the method scope variable. miles could be used ANYWHERE within the function
    static double milesToKilometers(double miles){
        double conversionRate = 1.6;// conversionRate is a LOCAL variable
        return conversionRate*miles;
    }

    void describeSelf(){
        System.out.println("Make: " + this.make + " Model: " + this.model + "Mileage: " + this.mileage);
    }

}

