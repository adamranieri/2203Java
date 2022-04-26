public class ThreadingPlayground {
// Thread is a running path of execution in your application
// Every application has a main thread from which other threads could spawn from
// Many applications only have one thread. Many languages only support a single thread JS
// Java is a multi-threaded language. Java can run multiple paths of execution in parallel/ simultaneously
// the Thread class is the main class responsible for doing threading in Java
//

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start");
        System.out.println(Thread.currentThread()); // Allows you to see what method you are currently on
        System.out.println("Middle");
        hello();
        System.out.println(Thread.currentThread());
        Thread.sleep(2000);// cause that thread to stop executing for a specific amount of time
        System.out.println("End");
    }

    static void hello(){
        System.out.println(Thread.currentThread());
        System.out.println("Hello from this method");
    }

}
