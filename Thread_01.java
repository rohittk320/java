class run1 implements Runnable {   // execute multiple thread at the same time
    @Override
    public void run() {
        while (true) {
            System.out.println("Thrading....1");
        }
    }
}
class run2 implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("Threading....2");
        }
    }
}
public class Thread_01 {
    public static void main(String[] args) {
        run1 bullet1 = new run1();
        Thread gun1 = new Thread(bullet1);
        run2 bullet2 = new run2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
