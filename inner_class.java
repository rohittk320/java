class outer {
    int x = 10;
    class inner {
        int y = 20;
    }
}

public class inner_class {
    public static void main(String[] args) {
        outer myouter = new outer();
        outer.inner myinner = myouter.new inner();
        System.out.println(myouter.x + myinner.y);
    }

}
