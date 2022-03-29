public class QuirkyPlayground {

    public static void main(String[] args) {
        boolean run = false;
        // wrapper values DO share the same object within byte range
//        Integer x = 500;
//        Integer y = 500;
//
//        System.out.println(x == y);

//        while(false){
//            System.out.println("I am code that can never execute!!!!");// java will not compile if it detects
//            // unreachable code
//        }

        if(run){
            System.out.println("Also unreachable but I still compile!");
        }


    }

}
