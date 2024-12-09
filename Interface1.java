interface clint {
    int x = 5;  // // public + abstract + final + static
    void input();  // public + abstract
    void  output();
}
class tony implements clint {
    // x=7;  // can not change , x is final
   public void input ()  // need strong modifier
   {
       System.out.println(" input ");
   }
   public void output(){
       System.out.println(" output ");
   }
    public static void main(String[] args) {
        clint c= new tony();  // creat object refrence
        c.input();
        c.output();
        System.out.println(clint.x); // because x is static
    }
}

