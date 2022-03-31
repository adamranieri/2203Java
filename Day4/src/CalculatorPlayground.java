public class CalculatorPlayground {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();//
        FourFunction c2 = new Calculator();// as far as Java is concerned c2 ONLY has the methods defined
        // in the 4 function interface
        // how you label something limits how you can interact
        ScientificFunction c3 = new Calculator();
        // only has the methods in ScientificCalculator available

        ((Calculator)c2).logBase10(90);// works because this objcect when forced to be viewed as a calculator
        // it DOES actually have that method
        // casting is often seen as an anti-pattern. It's unsafe. Usually a sign of poor design.

        //System.out.println(c2.getClass());
    }
}
// Interfaces exist since Java 2
// A contract that has ONLY abstract methods.
// Can ce implemented on a class
// a class can implement as many interfaces as you want
interface FourFunction{

    final static double pi = 3.14; // redundant only final and static variables are allowed

    abstract double add(double num1, double num2);// redundant
    double subtract(double num1, double num2);
    double multiply(double num1, double num2);
    double divide(double num1, double num2);

}

interface ScientificFunction{

    double logBase10(double num);
    double squareRoot(double num);
}

// Calculator MUST implement these four functions.
class Calculator implements  FourFunction, ScientificFunction{

    @Override
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double subtract(double num1, double num2) {
        return num1 -num2;
    }

    @Override
    public double multiply(double num1, double num2) {
        return num1*num2;
    }

    @Override
    public double divide(double num1, double num2) {
        return num1/num2;
    }

    @Override
    public double logBase10(double num) {
        return  Math.log1p(num);
    }

    @Override
    public double squareRoot(double num) {
        return Math.sqrt(num);
    }
}
