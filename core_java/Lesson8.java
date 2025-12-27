// Multithreading is used for parallel operations. A CPU has multiple
// cores. Java, by default only runs on one core. Multithreading is
// used to make use of more cores thereby increasing efficiancy and
// throughput of the program.

// Threads are single line of execution of program. By default there
// is only one thread. There are 2 ways to create a thread.

// Threads can be created by extending the Thread class and overriding
// the run method.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread1 extends Thread {
  @Override
  public void run() {
    System.out.println("Running 1");
  }
}

class MyThread2 {
  public void createThread() {
    // The other mehthod to create a thread is to use the new keyword.
    // A closure implementing the Runnable interface must be supplied
    // in this case.
    Thread t = new Thread(() -> System.out.println("Running 2"));
    try {
      // join method is used on the thread to wait for its completion.
      // This method can throw InterruptedException which must be
      // handled.
      t.join();
    } catch (InterruptedException e) {
      System.out.println("Thread interrupted while running.");
    }
  }
}

public class Lesson8 {
  // Thread safety refers to a quality of a function that guarantees
  // no adverse effects (deadlocks, starvations) when calling
  // concurrently from multiple threads. There are multiple methods
  // to ensure thread safety like locks, mutexes, semaphores, etc.

  // Volatile keyword is used to signal the JVM to not to cache the
  // value. This is done in case multiple threads must access the
  // value and no guarantees can be made that the value is not
  // mutated between 2 accesses.
  volatile boolean running = true;

  // synchronized keyword is used with a method to indicate that
  // the monitor lock of the attached object must be acquired
  // before calling the method.
  synchronized void increment() {}

  void method() {
    // synchronized block is similar to synchronized method but
    // it only locks the object for the critical section of the
    // code.
    synchronized (this) {
      // block sync
    }
  }

  public static void main(String[] args) {
    // Executors are used to create a available pool of Threads
    // which can be assigned taskes using execute method. The
    // supplied closure must implement Runnable interface.
    ExecutorService es = Executors.newFixedThreadPool(2);
    es.execute(() -> System.out.println("Task"));
    es.shutdown();
  }
}
