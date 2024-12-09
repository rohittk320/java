class inexp {
    int x = 100;
}
class rdj extends inexp {
    String y = "Tony";

    public static void main(String[] args) {
        rdj obj = new rdj();
        System.out.println(obj.x);
        System.out.println(obj.y);
    }
}