class threading1 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread 1...");
        System.out.println("Thread 1...");
        System.out.println("Thread 1...");
        System.out.println("Thread 1...");
        System.out.println("Thread 1...");
        System.out.println("Thread 1...");
        System.out.println("Thread 1...");
        System.out.println("Thread 1...");
    }
}
class threading2 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread 2...");
        System.out.println("Thread 2...");
        System.out.println("Thread 2...");
        System.out.println("Thread 2...");
        System.out.println("Thread 2...");
        System.out.println("Thread 2...");
        System.out.println("Thread 2...");
        System.out.println("Thread 2...");
    }
}
public class Thread_0 {
    public static void main(String[] args) {
      threading1 obj1 = new threading1();
      threading2 obj2 = new threading2();
      obj1.start();
      obj2.start();
    }
}
