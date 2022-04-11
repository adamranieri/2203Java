import java.util.HashSet;
import java.util.Set;

public class SetPlayground {

    // 1. cannot have duplicates
    // 2. cannot get by an index
    // 3. not ordered by their insertion
    public static void main(String[] args) {

        Set<Person> peopleSet = new HashSet();

        Person adam = new Person("Adam", "Ranieri", 19);
        Person bill = new Person("Bill", "Kris", 25);
        Person ted = new Person("Ted", "Smith", 22);

       peopleSet.add(adam);
       peopleSet.add(bill);
       peopleSet.add(ted);
       peopleSet.add(adam); // no duplicates

        System.out.println(peopleSet);

        // to get something from a set you would have to iterate over it
        // you want an element based on something other than a position

        Person adam2 = null;
        for(Person p : peopleSet){
            if(p.getFname().equals("Adam")){
                adam2 = p;
            }
        }

    }
}
