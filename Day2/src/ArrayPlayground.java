public class ArrayPlayground {

    public static void main(String[] args) {

        // Arrays are data structures where individual values are indexed by their position within the array
        // Arrays are 0 indexed in Java.
        // Arrays are of a fixed size.
        int [] nums = {10,20,30,40,50};// array literal syntax. handy if you need to create an array with determined values

        for(int i =0; i< nums.length; i++){
            System.out.println(i);
        }

        // same exact output as the previous  for loop
        // if you are every iterating once over an entire array i reccomend an enhanced for loop
        // most use cases for an enhanced for are readonly
        for(int n : nums){
            System.out.println(n);
        }

        char [] chars = {'A','d','a','m'}; // Strings are like character arrays that have extra abilities
        System.out.println(chars);

        for(int i = 0; i <chars.length; i++){
            if(chars[i] > 96){
                chars[i] = (char) (chars[i] - 32);
            }
        }
        System.out.println(chars);

        char [] fname = {'T','o','m'};
        char [] lname = {'S','m','i','t','h'};

        char [] fullName = new char[1+fname.length+lname.length];

        double [] dubs = new double[5];// Creates an empty array with 5 blank slots for doubles
        dubs[2] = 100.3;
        dubs[3]= 88.4;
//        dubs[100] = 9.4;// error because you are accessing a slot that does not exist
        System.out.println(dubs);

        for(double d : dubs){
            System.out.println(d);
        }
        // Java has default values, for primitives they all default to 0, boolean false, any objects it is null

    }
}
