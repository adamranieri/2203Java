import java.util.Objects;

// We can define a natural order to a class by adding the Comparable interface
// adds one method to the class we must override
public class Person implements Comparable<Person> {

    private String fname;
    private String lname;
    private int age;

    public Person() {
    }

    public Person(String fname, String lname, int age) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                '}';
    }

    // You are returning a -1, 0 ,1
    // if the object you are comapring it to is "smaller". The current object is bigger so return 1
    // if the object you are comparing it io is "larger". The current object is smaller so return -1
    // if the object you are comparing it to is the same size return
    @Override
    public int compareTo(Person otherPerson) {
        if(this.age > otherPerson.getAge() ){
            return 1;
        }

        if(this.age < otherPerson.getAge()){
            return -1;
        }

        return 0;
    }
}
