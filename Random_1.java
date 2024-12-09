import java.util.Random;
public class Random_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(100);
        System.out.println(x);

        int y = (int)(Math.random()*101);
        System.out.println(y);
    }
}