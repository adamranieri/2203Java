import java.util.Set;
import java.util.TreeSet;

public class SortPlayground {

    public static void main(String[] args) {
        // if you were to compare each element in set to every other element. How negative or positive would it be overall
        // and that defines your ordering
        Person adam = new Person("Adam", "Ranieri", 19); // -1 -1 = -2
        Person bill = new Person("Bill", "Kris", 25); // 1 1 = 2
        Person ted = new Person("Ted", "Smith", 22); //1 -1 = 0

        Set<Person> peopleSet = new TreeSet(); // sorted version of set will use that comparable method for sorting
        peopleSet.add(adam);
        peopleSet.add(bill);
        peopleSet.add(ted);

//        for(Person p: peopleSet){
//            System.out.println(p);
//        }

        Person mike = new Person("Mike", "Lang", 22); // if a comparison is equal
        // and a set does not have duplicates.... mike will not bed added
        peopleSet.add(mike);

        for(Person p: peopleSet){
            System.out.println(p);
        }

        String a = "A";
        String z = "Z";
        String c = "C";
        String m = "M";

        // the natural order/comparable of strings is to sort alphanumerically
        Set<String> letters = new TreeSet();
        letters.add(a);
        letters.add(z);
        letters.add(c);
        letters.add(m);

        for(String l: letters){
            System.out.println(l);
        }

        

    }
}
