import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaFest {

    public static void main(String[] args) {
        List<Integer> tempsFarenheit = new ArrayList();
        tempsFarenheit.add(101);
        tempsFarenheit.add(50);
        tempsFarenheit.add(30);
        tempsFarenheit.add(57);

        System.out.println(tempsFarenheit);

        // print out in celcius all the temperatures that are above freezing.
        tempsFarenheit.stream().filter(t -> t>32).map(t -> (t-32)*5/9).forEach(System.out::println);

//        tempsFarenheit.removeIf(t -> t<32); // remove below freezing
//        tempsFarenheit.stream().map(t -> (t-32)*5/9).forEach(t ->{
//            System.out.println("Celsius " + t);
//        });



    }
}
