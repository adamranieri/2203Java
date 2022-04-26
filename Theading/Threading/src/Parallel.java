import java.util.Arrays;

public class Parallel {

    static double totalTime = 0;

    public static void main(String[] args) {

        Runnable doSort = ()->{
            long start = System.nanoTime();
            sort(100_000);
            long end = System.nanoTime();

            System.out.println("Time to fiish sorting for this thread " + (end-start));
            totalTime+= (end-start);// add the time this thread took to complete to total time
            System.out.println("Total time spent sorting by all threads " + totalTime/1_000_000_000);
        };

        Thread thread1 = new Thread(doSort);
        Thread thread2 = new Thread(doSort);
        Thread thread3 = new Thread(doSort);
        Thread thread4 = new Thread(doSort);

        // start will spawn a new thread
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        // run will NOT spawn a new thread. The lambda will just execute sequentially
//        thread1.run();
//        thread2.run();
//        thread3.run();
//        thread4.run();

        //0.09 ~ hundreth of a second while 4 work in parallel
        //0.02 when executing one after another // faster to only have one thread
        // switching between threads is something that slows down your application

    }

    // creates an array of that size. Generates random numbers in that array
    // Then sorts the array smallest to largest
    static void sort(int count) {

        double [] nums = new double[count];

        for(int i = 0; i <nums.length; i++){
            nums[i] = Math.random();
        }

        Arrays.sort(nums);

    }

    StringBuilder b = new StringBuilder();
    StringBuffer b2 = new StringBuffer();
}
