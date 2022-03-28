
// Classes serve 2 roles in Java
// 1. Classes are a nampespace to uniquely identify methods/functions in Java
// 2. Classes are a template to build an object.
// An object is a data structure that has its own properties and methods that act on those properties

public class Playground {
    // A program COULD have multiple main methods. One of them you have to select to start
    public static void main (String [] args){
        System.out.println("Hello the application started");

        Person bill = new Person();
        bill.age = 20;
        bill.firstName = "Bill";

        Person steve = new Person();
        steve.age = 30;
        steve.firstName = "Steven";

        System.out.println(bill.firstName);
        System.out.println(steve.firstName);
        bill.introduceSelf();
        steve.introduceSelf();
        English.hello();
        Spanish.hello();
    }
}
// namespace
class English{

    // Static says that the method DOES NOT belong to an object created from this class
    // The method is directly callable from the class namespace
    // static methods are NOT tied to objects
    public static void hello(){
        System.out.println("Greetings");
    }
}
// int x =0; all code is written in a class
// namespace
class Spanish{

    public static void hello(){
        System.out.println("Hola");
    }
}
// Template for an object
class Person{

    int age;
    String firstName;// STRING IS NOT A PRIMTIVE

    // this function does not make sense OUTSIDE of an object
    public void introduceSelf(){
        // this keyword refers to the current object
        System.out.println("Hello my name is " + this.firstName);
    }
}