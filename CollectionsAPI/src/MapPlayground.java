import java.util.HashMap;
import java.util.Map;

public class MapPlayground {

    // 1. Key Value pairs
    // 2. no real order of insertion
    // 3. no uniueness of the values (all the keys are unique)
    public static void main(String[] args) {
        Person adam = new Person("Adam", "Ranieri", 19);
        Person bill = new Person("Bill", "Kris", 25);
        Person ted = new Person("Ted", "Smith", 22);

        Map<String, Person> personMap = new HashMap();

        personMap.put("Ray", adam);
        personMap.put("Billy", bill);
        personMap.put("Teddy", ted);

        System.out.println(personMap.get("Teddy"));

        // There is NO iterating directly over map
        // there is a method for getting the values
        // defeats the purpose of a map. probably not what you want
        for(Person p : personMap.values()){
            System.out.println(p);
        }


    }
}
