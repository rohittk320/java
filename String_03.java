public class String_03 {
    public static void main(String[] args) {
        int count = 0;
        String temp = "";
        String y = "Twinkle, twinkle, little 2024 star, How I wonder 50 what you are. Up above the world so high, Like a diamond 13 in the sky. ";
        for (int i = 0; i < y.length(); i++) {
            if (y.charAt(i) == '0' || y.charAt(i) == '1' || y.charAt(i) == '2' || y.charAt(i) == '3' || y.charAt(i) == '4' || y.charAt(i) == '5' || y.charAt(i) == '6' || y.charAt(i) == '7' || y.charAt(i) == '8' || y.charAt(i) == '9') {
                count++;
                temp += y.charAt(i);
            }
        }
        System.out.println("total no is " + count);
        System.out.println(temp);
    }
}
