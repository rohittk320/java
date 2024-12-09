public class Statement {
    public static void main(String[] args) {
        int age = 4;
        if (age >= 18) {
            System.out.println("you can vote");
        } else {
            System.out.println("you can not vote");
        }
        int a = 40;
        int b = 10;
        int c = 20;
        if (a > b) {   // cheak one by one
            System.out.println("a is larger than b");
               if (a > c) {
                   System.out.println("a is largest " +a);
               }
               else {
                   System.out.println(c);

               }
           }
        else {
            System.out.println("b is larger than a ");
        }
    }
}
