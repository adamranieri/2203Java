package inputs;

import java.util.Scanner;

public class InputPlayground {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// build a scanner that watches the keyborad for input
//        System.out.println("Please type in your name!");
//        String name = scan.nextLine();
//        System.out.println("Welcome " + name);

        System.out.println("Type in number 1");
        int n1 = scan.nextInt();// automatically turn the next input into an int
        System.out.println("Type in number 2");
        int n2 = scan.nextInt();

        System.out.println("The sum is " + (n1+n2));


    }
}
