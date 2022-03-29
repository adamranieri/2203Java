package example;

// A Java Bean is a class where all the fields are private
// there are public getters and setters
// there is a no-args constructor
public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(){

    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // getters and setters are public methods for interacting with your encapsulated private data
    // By using getters and setters we prevent the data from holding values that do not make sense
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName == null){
            this.firstName = "no first name";
        }else{
            this.firstName = firstName;
        }

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName == null){
            this.lastName = "no last name";
        }else{
            this.lastName = lastName;
        }

    }

    public int getAge() {
        return age;
    }

    // I can prevent negative ages from ever appearing in the code
    public void setAge(int age) {
        if(age <0){
            this.age = 0 ;
        }else{
            this.age = age;
        }

    }

}
