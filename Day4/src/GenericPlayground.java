public class GenericPlayground {

    public static void main(String[] args) {
        Box<String> a = new Box<String>();
        String adam = "Adam";
        a.store(adam);
        System.out.println(a.isFull());
        String s = a.retrieve();// a box is designed to hold an object. not all objects are strings
        Box<Integer> b = new Box<Integer>();
        // Generics allow you to dynamically specify types in your code
        Integer x = 1000;
        b.store(x);
    }
}

// Imagine you have a box
// You want to put something in the box and take something out of the box
// We can use Generics to specify the type of variables/methods when creating the instance
// T will default to the Object class
class Box<T>{

    private T thing;

    public T retrieve(){
        return this.thing;
    }

    public boolean isFull(){
        return this.thing != null;
    }

    public void store(T object){
        if(this.isFull()){
            System.out.println("Object not stored");
        }else{
            System.out.println("Object stored in box");
            this.thing = object;
        }
    }

}


