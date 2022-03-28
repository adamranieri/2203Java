// Every Java File MUST have a class with the name of the file in it
// Primitives
// Other than imports all code MUST be written in a class. This forces your code to modular and organized

public class Primitives {

    // Every Java program begins execution from the main method
    public static void main(String [] args){
        // Primtives are datatypes that are NOT objects
        // Name comes from the fact they store "primtive" basic data types, numbers,booleans, char

        boolean b = true;
        byte y = 0; // 1 byte stores values from -128 127
        short s = 100; // 2 bytes
        char c = 'c'; // 2 bytes
        int i = 1000; // 4 bytes
        float f = 200.1f; // 4 bytes (holds decimal values)
        long l = 500; // 8 bytes (whole numbers)
        double d = 900.4; // 8 bytes (holds decimals// )

        // STRINGS are NOT A PRIMTIVE
        // I will disown you for saying Strings are a primitive

        // chars are really just numeric values that have an ASCII representation
        char c1 = 'a';
        char c2 = (char) (c1 +1);
        System.out.println(c2);

        // Wrapper classes are OBJECT versions of primitives
        // They have methods attached to them which make them more useful
        // They start with a capital letter and are not highlighted like primtives
        Integer ii = 100;
        Double dd = 100.5;

        long start = System.nanoTime();
        for(Integer x = 0; x <10000; x++){
        }
        long end = System.nanoTime();
        long diff = end - start;
        System.out.println(diff); // 182600  0.00182600 seconds
                                 //  1781100   10 times slower

        // wrappers and primtives are very interchangeable
        // Wrapper => primitive unboxing
        // Primitive => Wrapper Autoboxing
        // Happens automtically
        Integer k1 = 100;
        Integer k2 = 100;
        Primitives.add(k1,k2);// unboxing

        int m1 = 1000;
        int m2 = 1000;
        Primitives.subtract(m1,m2);// Autoboxing
    }

    public static void add(int a, int b){
        System.out.println(a+b);
    }

    public  static void subtract(Integer a, Integer b){
        System.out.println(a -b);
    }


}
