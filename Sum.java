public class Sum {
    public static void main(String[] args) {
        int num[] = {1,3,6,5,4,7,9};
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println(sum);
    }
}
