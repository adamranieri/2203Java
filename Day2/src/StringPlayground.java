import java.util.Locale;

public class StringPlayground {

    public static void main(String[] args) {
        // Character data and sequences are ubiquitous in the real world and programming
        // dealing with this data soley in character arrays would be tedious and prone to errors
        // Java has in built classes for dealing with character data
        // 1. String.
        // Strings are immutable. Once created. They cannot be change
        // Strings of the SAME value are the SAME object in memory

        String adam = "Adam";// notice the lack of news
        System.out.println(adam);
        String newString = adam.toUpperCase();// this does not mutuate the string. It returns a new string that is uppercase. the original is untouched

        // ==  returns true if two variables are of the same value for PRIMITVES
        System.out.println('f'=='g');// false
        // == returns true if two variables are the same OBJECT in memory for OBJECTS
        Car c1 = new Car("Subaru","Crosstrek",100);
        Car c2 = new Car("Subaru","Crosstrek",100);// anytime you use the new keyword
        // you are brand new object in memory
        System.out.println(c1 == c2);// false because they are seperate object
        String otherAdam = "Adam";
        System.out.println(adam == otherAdam);// true

        String tim = new String("Tim"); // There is 0 reason to ever do this
        String tim2 = new String("Tim");
        System.out.println(tim == tim2); //false


    }
}
