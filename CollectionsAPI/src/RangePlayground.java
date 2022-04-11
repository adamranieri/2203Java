public class RangePlayground {

    public static void main(String[] args) {
        Range r = new Range(10);
        // Range is iterable and therefor can be used in a for each loop
        for (Integer i : r){
            System.out.println(i);
        }
    }
}
