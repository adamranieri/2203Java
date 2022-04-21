import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streaming {

    //Streams API, Streams package very helpful library for dealing with lambas
    // allows us to turn many things into steams which can then be modified with lambdas
    public static void main(String[] args) {
        List<String> names = new ArrayList();
        names.add("Adam");
        names.add("Bob");
        names.add("Catherine");

        List<String> shortNames = names.stream()
                .filter(s -> s.length()<5)
                .map(n -> "Mr " + n)
                .map(n -> n +" Smith")
                .collect(Collectors.toList());// remove elements that are false

        List<Integer> nums = new ArrayList();
        nums.add(10);
        nums.add(-5);
        nums.add(7);
        nums.add(9);
        nums.add(16);

        List<Integer> postiveOddNumbers = nums.stream().filter(n -> n%2 ==1).filter(n -> n>0).collect(Collectors.toList());
        System.out.println(postiveOddNumbers);
    }
}
