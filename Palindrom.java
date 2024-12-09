public class Palindrom {
    public static void main(String[] args) {
        int num,rev=0,temp,rem;
        num=121;
        temp=num;
        while (num > 0) {
            rem=num%10;
            rev= rev*10 + rem;
            num=num/10;
        }
        if (rev == temp) {
            System.out.println("num is palindrome "+rev);
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
