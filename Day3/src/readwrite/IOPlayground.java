package readwrite;

import java.io.*;

// IO Input Output
// How you get data into and out of your program
// Scanner can be used to get user input for instance
public class IOPlayground {

    public static void main(String[] args) {
        File f = new File("C:\\Users\\AdamRanieri\\Desktop\\hello.txt");// Creates a file object

        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);// class that is more specifically designed to read text file
            System.out.println(br.readLine());
        } catch (FileNotFoundException e) { // what if the file does not ext
            e.printStackTrace();
            System.out.println("Oh no file does not exist!!!!!!!");
        } catch (IOException e) {// what if there is a problem while reading it
            e.printStackTrace();
        }

        File out = new File("C:\\users\\AdamRanieri\\Desktop\\out.txt");

        try {
            FileWriter fw = new FileWriter(out);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Appended to the end of the file");
            bw.close();// if we do not close our writer it will not write to the file

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
