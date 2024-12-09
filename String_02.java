public class String_02 {
    public static void main(String[] args) {
        int count = 0;
        String y = "Twinkle, twinkle, little 2024 star, How I wonder 50 what you are. Up above the world so high, Like a diamond 13 in the sky. ";
        for (int i = 0; i < y.length(); i++) {
            if (y.charAt(i)==' '){
                count++;
            }
        }
        System.out.println("no of white space is "+count);
    }
}
