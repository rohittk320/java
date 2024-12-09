package Practice;

interface Practice_01 {
    int x = 10;
    void input();
    void output();
}
class abc implements Practice_01 {

    @Override
    public void input() {
        System.out.println("Input " +x);
    }

    @Override
    public void output() {
        System.out.println("Output Here");
    }

    public static void main(String[] args) {
        Practice_01 obj = new abc();
        obj.input();
        obj.output();
    }
}
