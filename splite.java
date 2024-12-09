public class splite {
    public static void main(String[] args) {
        String str = " hello1 Hello5 Hhhh5 skff kkk";
        String arr[] = str.split("\\d");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
