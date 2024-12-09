public class String_Builder {  // you can change string
    public static void main(String[] args) {
        java.lang.StringBuilder str = new java.lang.StringBuilder("Hello");
        System.out.println(str);
        //append()
        str.append("Tilak Mahore");
        System.out.println(str);
        //insert()
        str.insert(5," ");
        System.out.println(str);
        //delete()
        str.delete(6,12);//12-6=6
        System.out.println(str);
        //reverse()
        str.reverse();
        System.out.println(str);
        //length()
        System.out.println(str.length());
        // covert to string
        String z = str.toString();
        System.out.println(z);
        //reverse()
        str.reverse();
        System.out.println(str);
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(6));
        str.setCharAt(0, 'T');
        System.out.println(str);
        str.setCharAt(6, 'K');
        System.out.println(str);
        str.replace(4,5,"amz");
     //   System.out.println(str);
        System.out.println(z.toUpperCase());
        System.out.println(z.toLowerCase());
        String str1 = "Hello";
        String str2 = " World";

        // Concatenate using concat() method
        String result = str1.concat(str2);

        // Output the concatenated string
        System.out.println("Concatenated String: " + result);

        String str3 = "hello cat world cat hi cat is pet ";
        String xyz = str3.replaceAll("cat", "dog");
        System.out.println(xyz);

        String s1 = "hello";
        String s2 = "World";
        String s3 = String.join("-->",s1,s2);
        System.out.println(s3);

        String s4 = String.join("-","Thor","tony","hulk");
        System.out.println(s4);

        char arr[] = {'2','4','6','8','9','2','7','3','1','5'};
        System.out.println(arr);
        String st = "hello world";
        st.getChars(6,11,arr,4);
        System.out.println(arr);

        String ss = "abcdef";
        byte b[] = ss.getBytes();
        for (int i = 0; i <b.length ; i++) {
            System.out.println(b[i]);
        }
        String sss = " Rohit Thakur ";
        String xy = sss.replaceAll(" ","");
        System.out.println(xy);


     }
}
