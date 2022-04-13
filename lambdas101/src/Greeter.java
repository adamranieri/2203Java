
@FunctionalInterface // an interface with one an ONLY one abstract method. Used as a template to makes functions
// aka as LAMBDAS in Java
public interface Greeter {

    void greet(String name);


}
// very OOP apprach to building different implementations
// the only way to do it until Lambdas were introduced in Java 8
class EnglishGreeting implements Greeter{

    @Override
    public void greet(String name) {
        System.out.println("Greetings " + name);
    }
}

class SpanishGreeting implements Greeter{

    @Override
    public void greet(String name) {
        System.out.println("Hola " + name);
    }
}