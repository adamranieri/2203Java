public class MultiThread {
// Multi Threading allows us to run several paths of execution that run at the same time
// while every program starts from a single thread you can have multiple
// Threads run at different speeds
// Trying to get threads to run in a predictable sequential way is DIFFICULT
// ways in which we can TRY to organize the order certain threads execute
    // 1. Threads can have a priority. The JVM will try to execute that thread earlier than others
    // 2. Synchronize threads. using the synchronized keyword
// Multithreading is inherently more complicated than a single threaded application
// Some applications benefit in performance from having multiple threads
    // web servers that can respond to simultaneous http requests

    public static void main(String[] args) {
        // A runnable is a lambda that contains a snippet of code that just runs
        // no return no parameters. Just execute a chunk of code
        Runnable hello = () -> {
            int counter = 0;

            for (int i =0; i < 10; i++){

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Hello from " + Thread.currentThread() + "counter is " + counter++);
            }

        };

        Runnable hola = () -> {

            int counter = 0;

            for (int i = 0; i <10; i++){

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Hola from " + Thread.currentThread() +" counter is " + counter++);
            }

        };

        // Makes thread objects. DOES NOT actually spawn a new thread that executes the runnable lambda
        Thread helloThread = new Thread(hello);
        Thread holaThread = new Thread(hola);
        helloThread.setPriority(1);// lower priortity
        holaThread.setPriority(10);// higher priority

        // Spawn a thread from the main and have it execute the runnable in the thread
        helloThread.start();
        holaThread.start();

        System.out.println("The main thread is " + Thread.currentThread());


    }


}
