package inheritance;

import java.util.Objects;

public class ObjectPlayground {

    public static void main(String[] args) {
        // Every class inherits from The Object Class. You do not have to do this explicitly
        // The Object Class has some very helpful methods that any object can use
        Object tc = new TravelCard(0,1000,"Adam");
        Object obj = new Object();

        // commonly overridden methods in the object class
        // toString() -> String Representation of an object. Used anytime you print the object
        // the default implementation prints out the memory address
        Person adam = new Person("Adam","Ranieri",19);
        Person adam2 = new Person("Adam","Ranieri",19);
        System.out.println(adam);
        Object bill = new Person("Bill", "Smith", 40);
        System.out.println(bill);// The actual object determines what version of toString() is used NOT the refernce Type

        // Hashcode
        // Unique identifier of the Object's state
        System.out.println(adam.hashCode());
        System.out.println(adam2 == adam);// false different objects
        System.out.println(adam.hashCode() == adam2.hashCode());//true same hashvalue generated

        System.out.println(bill.hashCode());

        // Equals
        // returns a true or false
        System.out.println(adam.equals(adam2));

    }
}

class Person{
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override // arguably the MOST overridden method in all of Java
    public String toString(){
        return "FirstName: " + this.firstName+ " LastName: " + this.lastName + " Age: " + this.age;
    }

    @Override // hashcode is based on the values in the fields. NOT random
    // if two objects have the same hashcode then they would have fields with identical values
    public int hashCode() {
       return this.firstName.hashCode()* this.lastName.hashCode()*this.age;
    }

    @Override// a way to get a true or false if your object is EQUAL (however you define equal to another object)
    public boolean equals(Object obj){
        return this.hashCode() == obj.hashCode();
    }
}


