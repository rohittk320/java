package Practice;

 class prct6 {
   private int age;
   private String name;

     public int getAge() {
         return age;
     }

     public String getName() {
         return name;
     }
     public void setName(int x , String y) {
         this.age=x;
         this.name=y;
     }
     public static void main(String[] args) {
         prct6 obj =  new prct6();
         obj.setName(10,"rohit");
         System.out.println(obj.getName());
         System.out.println(obj.getAge());

     }
 }
