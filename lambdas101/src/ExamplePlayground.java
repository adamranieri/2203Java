import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ExamplePlayground {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList();
        numbers.add(10);
        numbers.add(20);
        numbers.add(-15);
        numbers.add(101);
        numbers.add(-40);

//        for(Integer i : numbers){
//            System.out.println("Integer value is " +i);
//        }
        // passing in a lambda with what to do for each number
        numbers.forEach(num ->{
            System.out.println("Integer value is " + num);
        });

        // remove all the negative numbers
        // imperative approach using a for loop
//        for(int i = 0; i<numbers.size();i++){
//            if(numbers.get(i)<0){
//                numbers.remove(i);
//            }
//        }
//        System.out.println(numbers);

        // Predicate function
        // Takes in a object of any type. we can specify the type using a generic;
        // the function must return a boolean
//        Predicate<Integer> isNegative = num ->{
//            return num<0;
//        };

        // lambdas have a really succinct syntax
        // if the function is ONE LINE. It has an implicit return and curly brackets are unnecessary
        //Predicate<Integer> isPositive = n -> n>0 ;

        //numbers.removeIf(isPositive);// identical functionality to the loop

        numbers.removeIf(n -> n%2==1 );// removes all odd number
        System.out.println(numbers);

    }
}
