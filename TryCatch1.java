public class TryCatch1 {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int division = 10/0;  // This will cause an ArithmeticException
            System.out.println("Result: " + division);
        } catch (ArithmeticException e) {
            // Code to handle the exception
            System.out.println("Error: Division by zero is not allowed. "+ "e output "+ e.getMessage());
        }
    }

}
