public class StringDuplicate {
    public static void main(String[] args) {
     String str = "Hello World";
     int count = 0;
     char ch[]= str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (ch[i] == ch[j]) {
                    System.out.println("duplicate charater is "+ ch[j]);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
