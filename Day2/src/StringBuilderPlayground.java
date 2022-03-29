public class StringBuilderPlayground {

    public static void main(String[] args) {
        // StringBuilder is the mutable version of String
        // YOU CAN directly edit a StringBuilder

        StringBuilder sb1 = new StringBuilder("Hello");// You must always use the new keyword with StringBuilder
        // it does not share objects with the same value
        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println(sb1 == sb2);// compares whether two variables are the same object

        sb1.reverse();// the characters are directly mutated and flipped
        System.out.println(sb1);

        // String vs StringBuilder
        // String: character data that is shared or not edited too much
        // StringBuilder: character data that you need to do manipulations on

        String lengthy = "";
        long start = System.nanoTime();
        for(int i =0; i <100;i++){
            lengthy = lengthy + "a"; // 100 differnt strings were generated during this process "a", "aa", "aaa", "aaaa"
        }
        long end = System.nanoTime();
        long diff = end -start;
        System.out.println(lengthy);
        System.out.println(diff); // 173,300 nanoseconds

        StringBuilder lengthy2 = new StringBuilder("");

        start = System.nanoTime();
        for(int i =0; i <100;i++){
            lengthy2.append("a");
        }
        end = System.nanoTime();
        diff = end - start;
        System.out.println(lengthy2);
        System.out.println(diff);// 29,400 about 10x faster


    }
}
