# Threading
- **Thread**
  - A path of execution within a program
- **Multi-Threading**
  - Having multiple threads running concurrently in your application
  - Not all lanugages support this
    - Language with multi-threading
      - Java
      - Go
      - C
      - C++
    - Languages that do not support multi-threading
      - JavaScript
- Why multi-thread
  - *Performance*
  - *Performance*
  - *Performance*
  - Javalin uses a thread pool so that it can handle multiple requests simultaneously
- Why *NOT* to multi-thread
  - **It is difficult**
    - It is hard to program
    - It is hard to debug
    - Java Specific Threading 
      - synchronized
      - Thread priority
  - Not always performant
    - Having multiple threads can be slower
    - Application has more overhead trying to manage multiple threads and switch between the,
  - Threading related bugs
    - **Starvation**
      - A thread is ignored for too long and ceases to be processed and or relavent
        - An http request thread that was just ignored in priority in favor of others. never gets processed
    - **Deadlock**
      - Two threads have *owned* a resource and both refuse to give it up
        - A hostage exchange where no one trusts each other to give up the hostage first
        - One thread has a file and refuses to release it until it gets access to a file used by another thread
    - **Livelock**
      - *Canadian Lock* - made up by me
        - Two threads keep trying to give each the resource
        - Two people getting to the door at the same time and keep going "no Ill go after you"
          - The threads are too polite
        - Two threads keep letting the other thread access the file first

### Java Threading 
- Thread Class
  - Main class responsible for making and managaing threads
- Runnable
  - A lambda that can be used for creating threads
  - synchronized keyword
- StringBuilder vs StringBuffer
  - StringBuffer has synchronized versions of the StringBuilder methods
  - If you had multiple threads editing the same string how could you enforce the order
    - append + reverse != reverse + append
- Scheduler
  - A part of the JVM responsible for managing threads
  - Controls the creation and execution of threads
    - Looks at thread priortity
    - Manages synchroinzed threads

#### Thread States
1. new
   1. Thread that was just created
2. Runnable
   1. Thread that is running
3. Blocked
   1. Thread that was prevented from wating
4. Waiting
   1. Thread waiting for the scheduler to let it proceed
5. Timed Waiting
   1. Thread waiting for the scheulde to let it proceed up to a certain amout of time
6. Terminated
   1. Thread that has finsished

```Java

Runnable hello = ()->{
    System.out.println("Hello!!");
};

Thread thread = new Thread(hello);
thread.start();//spawn a new thread 

```