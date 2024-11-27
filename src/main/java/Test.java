public class Test {
    public static void main(String[] args) {
        int a = 667;
        int b;
        b = a % 10;
        for (int i = 0; i < 3; i++) {
            b %=10;
            System.out.println(b);
        }
    }
}
