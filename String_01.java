public class String_01 {
    public static void main(String[] args) {
        String y = "Twinkle, twinkle, little 2024 star, How I wonder 50 what you are. Up above the world so high, Like a diamond 13 in the sky. ";
        int vcount = 0;
        int ccount = 0;
        for (int i = 0; i < y.length(); i++) {
            if (y.charAt(i) == 'a' || y.charAt(i) == 'A' || y.charAt(i) == 'e' || y.charAt(i) == 'E' || y.charAt(i) == 'i' || y.charAt(i) == 'I' || y.charAt(i) == 'o' || y.charAt(i) == 'O' || y.charAt(i) == 'u' || y.charAt(i) == 'U') {
                vcount++;

            } else {
                ccount++;
            }
        }
        System.out.println("no of vowel is " + vcount);
        System.out.println("no of consonant "+ ccount);
    }
}
