
public class Method {    //method is block of code Methods are used to perform certain actions
                         // define the code once, and use its many times
    static void main (int x) {  // method run when it called
        if (x%400==0) {
            System.out.println("leap Year");
        }
        else if (x%4==0 && x%100!=0) {
            System.out.println("leap Year");
        }
        else {
            System.out.println("Normal Year");
        }
    }

    public static void main(String[] args) {
        main(2021);
    }
}
