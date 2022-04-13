import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalPlayground {

    // Functional programming
    // paradigm of programming like OOP
    // a function is a nippet of code you can invoke. It might have parameters. It might have a return
    // a function is stand-alone. It is not attached to an object or even a class

    public static void main(String[] args) {

        // very clunky to design code like this from a functional interface
//        Greeter greeter1 = new EnglishGreeting();
//        greeter1.greet("Adam");
//
//        Greeter greeter2 = new SpanishGreeting();
//        greeter2.greet("Adam");

        // Lambda I can on the spot define an implementation for that functional interface
//        Greeter frenchGreeting = (String name) ->{
//            System.out.println("Bonjour " + name);
//        };
//
//        frenchGreeting.greet("Jack");

        // code itself can now be treated as a variable. It can be passed into other methods (callback method)
        // you can dynamically craft code. function factories
        // leads to succint and powerful ways of writing programs

        // collections are an EXCELLENT place to see the usefulnes of lambdas

        List<String> names = new ArrayList();
        names.add("Adam");
        names.add("Kim");
        names.add("Janet");

        // imperative approach using a for loop
        for(String name : names){
            System.out.println(name);
        }

//        Consumer<String> gutentag = (String name) -> {
//            System.out.println("Gutentag " + name);
//        };
        // for lambdas you do not have to label the type of a parameter in Java. It can be safely inferred by Java
//        Consumer<String> gutentag = (name) -> {
//            System.out.println("Gutentag " + name);
//        };
        // lambdas do not need parentheses if you only have one parameter
        Consumer<String> gutentag = name -> {
            System.out.println("Gutentag " + name);
        };
        names.forEach(gutentag);

        // anonymous functions are lambdas created on the spot
        names.forEach(n -> {
            System.out.println("Hello" + n);
        });




    }
}
