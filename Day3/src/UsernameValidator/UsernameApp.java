package UsernameValidator;

import sun.reflect.annotation.ExceptionProxy;

import java.util.Scanner;

public class UsernameApp {

    // this app will validate that a ussername is valid for an application
    //1. username must be a least 6 characters long
    //2. username cannot contain illegal characters !, #
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your username");
        String username = scan.nextLine();

        try{
            boolean isValid = UsernameApp.isValidUsername(username);// Checked Exception enforce try/catch and error handling
            System.out.println("Username was valid");
        }catch (InvalidUsernameException e) {
            e.printStackTrace();
            System.out.println("Username was invalid");
        }catch (InvalidLengthException e){
            e.printStackTrace();
            System.out.println("Username was invalid");
        }finally {
            System.out.println("Thank you for using my program");
        }


        // Java is a language that REALLY enforces scalability and making your code protect itself. Defensive programming
        // CheckedExceptions = Exceptions that are REQUIRED to be caught or at the very least added to a method signature
        // to warn that this Exception might occur when running the code
        // Runtime = DOES NOT REQUIRE a try catch for Java to compile
        // Checked Which exception is = DOES require try/catch

    }

    static boolean isValidUsername(String name) throws InvalidUsernameException, InvalidLengthException {
        if(name.length() <6){
            throw new InvalidLengthException(name.length());
        }
        if(name.contains("!") || name.contains("#")){
            throw new InvalidUsernameException("Contained an illegal character ! or #");
        }
        return true;
    }
}
// Exceptions and Errors exist because developers WANT THEM
// We want programs that give use detailed messages on failures
// Exceptions = Failure Message

// With custom excpetions we can be more selective with our error handling
class InvalidUsernameException extends  Exception{

    public InvalidUsernameException(String message){
        super(message);
    }

}

class InvalidLengthException extends Exception{

    public InvalidLengthException(int length){
        super("The username was too short it was " + length + " needs to be at least 6");
    }
}