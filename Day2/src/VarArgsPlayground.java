public class VarArgsPlayground {

    public static void main(String... args) {
        double [] ray = {12.4, 51.3, 100.1};
        System.out.println(Calculator.sum(ray));

        int _ = 100; // would not reccomend
        int __ = 2;
        int $ = 1000;
        String ke$ha = "Ke$ha";
        System.out.println(_*__-$);

    }

}

class Calculator{

    // var args syntax, the incoming paramter is an array
    //And it accepts an array
    static double sum(double... nums){

        double total = 0;
        for(double d : nums){
            total += d;
        }
        return  total;

    }

}
