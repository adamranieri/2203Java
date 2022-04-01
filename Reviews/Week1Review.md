# Week 1

## Java High Level
- Created in 1995
- Designed for **Scalability**
- Compiled Language
  - The entire source code is read and then an executable is created
    - Your IDE can do this automatically to make your life easier
  - **Java Compiler**
    - It will turn human readable Something.java into machine executable Something.class files
      - Somthing.class contains executable Java **Bytecode**
    - It makes performance optimizations to your code
    - It will verify and double check your code
      - Refuse to compile if you call methods that do not exist, or have mismatched types etc
- High Level Language
  - No pointers
  - No direct memory management
- Automatic Memory Management
  - Java has a **Garbage Collector**
  - This will delete objects that are no longer used in the program
    - local variables once the method finishes for example
  - You are not responsible for deallocating memory
  - **Stack**
    - The call stack
    - Where your methods are executed
    - It does have a small amount of memory
  - **Heap**
    - Portion of Java memory where all objects are stored
  - Why is int so much faster then Integer
    - Integer values have to live in the heap which takes a while to read.
    - int values can live in the stack (true for local variables)
- It is a very OOP Language
  - OOP design patterns promote modularity and scalabiliy
- Write Once Run Anywhere
  - Any Java program can on any machine that has a Java Runtime Environment
  - That portability was a killer feature
- **JDK vs JRE vs JVM**
  - JDK: Java Development Kit
    - Software tools for writing Java Applications
    - Contains the compiler
  - JRE: Java Runtime Environment
    - Java libraries for running Java Applications
    - If you are only running a Java Application. You have the JRE
  - JVM: Java Virtual machine
    - Virtual replica of a real computer
    - With it's own RAM and Processors
    - How Java executes the instructions in .class files
![JDK JRE JVM](https://miro.medium.com/max/1400/1*LuKOZMDCX8e1zDyGyMUu_w.png)
- Strongly and statically typed
  - **Static**: All variables must be given a type. All methods have a return type, parameters have a type
  - **Strong**: No implicit coercion of data into other types
- Pass by Value
  - Java is 100% pass by value
  - Objects and primtivies are NOT directly passed into methods as parameters
    - A copy of the primtive value
    - A copy of the memory address is passed in
    - 

## OOP
- Style or Paradigm of Programming
- **Class**
  - Blueprint for an Object
  - Classes are sometimes used to create a name space to avoid naming conflicts
- **Object**
  - A data structure 
    - **State**
      - fields containing data
    - **Behvior**
      - methods that use that state
- **4 pillars of OOP**
  - **Abstraction**
    - Hiding implementation
    - You do not need to know how something works to use it
    - Interfaces and abstract methods
  - **Polymorphism**
    - Many forms
    - One object can have many different labels
    - Reference types and Generics
  - **Inheritance**
    - Abililty to *copy/derive* code from another class
    - Creates an *is-a* relationship
    - extends keyword
  - **Encapuslation**
    - Protecting parts of our application from other parts of our code
    - NOT A SECUIRTY FEATURE
    - Access Modifiers, getters, setters
- DRY
  - Don't Repeat Yourself
  - OOP promtoes reusablity as much as possible
- **Composition vs Inheritance**
  - Composition
    - Object has other objects within it.
    - List has other objects inside of it
  - Inheritance
    - Derive state and behavior from another class
- **Multiple Inheritance**
  - The ability of a class to have more than 1 direct parent
  - Java does not support this
  - Grandfather problem
    - Inheriting the same method from 2 places and not knowing which one to use
- **Overloading**
  - You have a method with the same name but different parameters
```java

class Calculator{
    // Overloading
    double add(double num1, double num2){
        return num1 + num2;
    }

    double add(double num1, double num2, double num3){
        return num1+num2+num3;
    }

}
```
- **Overriding**
  - Same method signature
  - Different implementation in the child class
```Java
class CreditCard{
    void makePurchase(double amount){
        if(amount+ this.balance < creditLimit){
            this.balance += amount;
        }else{
            System.out.println("Transaction declined");
        }
    }
}
class TravelCard extends CreditCard{

    @Override
    void makePurchase(double amount){
        if(this.balance + amount< this.creditLimit){
            this.balance += amount;
            this.rewardPoints += amount*0.01;
            System.out.println("Current balance " + this.balance + " Current Reward Points " + this.rewardPoints);
        }else{
            System.out.println("Transaction Declined");
        }
    }
}

```

## Java Syntax and Programming



### Scopes
- Scopes define the life span of a variable
1. Class/static
2. Instance/object
3. Parameter
4. Local

- **Main Method**
    - The starting point of any Java application
    - the String [] args is the words passed in when executed via command prompt
```java
class Example{

    public static void main (String [] args){

    }
}
```

- **Primitive Types**
- The only data types that are NOT object
- STRING IS NOT A PRIMTIVE
```java
    boolean
    byte
    short
    char
    int
    float
    long
    double
```
- **Wrappers**
- Object versions of Primitives
- Additional functionality with methods
- They can also be used in Generics
- **Autoboxing**
  - Primtive => Wrapper
- **Unboxing**
  - Wrapper => Primitive

- **Strings**
  - Special OBJECT in Java
  - They support literal syntax
    - Being created WITHOUT the new keyword
  - Character Data
  - In memory all Strings of the same value *ARE* the same object
    - Saves memory
  - *Immutable*
    - They cannot be edited once created.
  
- **StringBuilder**
  - *Mutable*
    - Directly edit the characters in a StringBuilder
  - Every StringBuilder you make is it's own object
  - Preferred for operations that involve a lot of string manipulation

- **Arrays**
  - Are objects
  - Simple data structures that store primtives or objects
  - They are of a fixed size
```Java
    int [] nums = new int [10];// create an int array of size 10
```
- **Constructors**
  - Special methods that create an object from a class
  - They must be named the same as the class
  - They do not have a return type
  - Can be overloaded
  - Cannot be overriden
  - If no constructor is defined than Java provided a default no args constructor
  - First line of any constructor must be super to build the parent class
    - Not necessary for a class whose parent is Object
```Java
class Person{

    String fname;
    String lname;
    int age;

    // no args constructor
    Person(){

    }

    Person(String fname, String lname){
        this.fname = fname; // the this means instance variable 
        this.lname = lname;
        this.age = 0;
    }

    // Constructor
    Person(String fname, String lname, int age){
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }


}

Person p = new Person();// 
Person p2 = new Person("Adam", "Ranieri");//
Person p2 = new Person("Adam", "Ranieri", 19);//
```
  
- **Object Class**
  - Parent of all classes in Java
  - Everything is of type object
  - Important methods
    - **toString()**
      - String representation of an object
      - By default it is the memory address
    - **hashCode()**
      - Unique number generated from the fields of an object
      - Often used to check whether an object is unqiue
    - **equals(Object o)**
      - Returns a boolean whether an object is considered the same as another object
      - Up to the programmer to provide this and determine how equality is judge
      - == vs equals()
        - == compares the memory address
        - equals() custom comparison
- **JUnit**
  - Testing framework for Java code
  - It is *not* part of the Java Standard library
    - Must be added manually
- **Test Basics**
  - A test is considered passed if the test method finsihes without an Excpetion Escaping
    - An exception does escape the test fails
  - Assertions throw an Error if they are false
  - **Positive Test**
    - Verifies that something works correctly
  - **Negative Test**
    - Verifies that something fails correctly
      - Throws the proper exception
  - **Unit Test**
    - A test that tess a single method
  - **Integration test**
    - A test that tests multiple methods
- **TDD Test Driven Developement**
  1. Write the interace/design the code
  2. Create the tests
  3. Create an implementation
- Why TDD
  - Diagnose and spot your bugs earlier
    - Solving the problem takes way less time and is way less aggrevating than trying to figure out *where* the bug is

```Java
class MyTests{

    @Test
    void test_1(){
        System.out.println("Hello");
    }

    @Test
    void test_2(){
        throw new RuntimeExcpetion("failure");
    }

}
```
## Exceptions and Errors
- Exceptions and Errors are a programming design pattern
  - Exceptions and Errors are Just objects that contain information on why and where things went wrong
    - StackTrace
      - Red Text with a breakdown of where it occured
- **Exception**
  - Problem that can be handled 
  - Or at the very least responded to
    - InputMistmatchExeption
    - ArrayIndexOutOfBound
    - FileNotFound
  - **Checked Exceptions**
    - aka *compile time exceptions*
    - Required to be handled by try catch block or throws in the method signature
    - Enforces that a developers has contigencies if this exceptions occurrs.
      - **Defensive Programming**
  - **Runtime Exceptions**
    - *Unchecked Exceptions*
    - Are not required to be handled or have contigencies
    - If they happen they happen
      - Hopefully your program doesn't crash
-  **Errors**
   -  Catastrophic failures that you should not catch
   -  Typically hardware failures
      -  OutOfMemoryError
   -  Code flaws
      -  StackOverError
- **throw vs throws**
  - throw
    - want to send flying an excpetion
    - raise an exception for Java to deal with
  - throws
    - Goes on the method signature
    - Explicitly warns that calling this method could generate that excption
- **Throwable**
  - Root class of all excpetions and errors
  - Any class that inherits from it can be thrown and caught

```Java
class ExceptionExample{

    public static void main(String [] args){

        try{
            // Code that could throw an exception
        }catch(Excpetion e){
            // code to handle that exception
        }finally{
            // Code that always run
            // Closing resources. If you open a file make sure it is closed before continuing
        }

    }

}

```
![Exceptions Hierarchy](https://www.javamex.com/tutorials/exceptions/ExceptionHierarchy.png)

## Colletions 
- Objects designed to store other objects
  - Are a type of Data Structure
- List
  - Duplicate values
  - Elements are ordered by insertion
  - Elements are retievable by their index
- Set
  - No Duplicate values
  - NOT retrievable by an index
  - Sorted and unsorted version
- Queue
  - FIFO First in first out
  - Elements are retrieved in the order they are put in
- Stack
  - LIFO Last in first out
  - Elements are retrived from the last element added
- Map
  - Stores objects as Key Value pairs
  - Elements are added with a key
  - Elements are retrived by passing in that key


- **Generics**
- Allow you to specify a placehodler type in your classes/interfaces
- Used heavily in collections

```Java
class Box<T>{

    private T thing;

    public T getThing(){
        return this. thing;
    }

    public void setThing(T thing){
        this.thing = thing;
    }

}

Box<String> b = new Box<String>();
b.setThing("Hi"); // can only store strings


```
- **Abstract Class**
  - A class with the abstract keyword in front
  - Cannot be directly instantiated
  - MAY have *abstract methods*

- **Abstract Method**
  - A method that is just a signature 
  - No implementation code
  
- **Interface**
  - Have only abstract methods
  - have only public static final variables

- **Abstract class vs Interface**
  - Abstract class can have concrete/implemented methods
  - You can only inherit one abstract class
  - You can implement as many interfaces as you want

- **Access Modifiers**
  - Keywords responsible for creating encapsulation in Java
  - **public**
    - Visible anywhere
  - **protected**
    - default + child classes
  - **default (implied)**
    - package only
  - **private**
    - same class only