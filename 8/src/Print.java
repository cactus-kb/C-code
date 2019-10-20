public class Print {
    public static void main(String[] args) {
        int n = 1234;
        print(n);
    }

    public static void print(int n ) {
        if (n > 9) {
            print(n / 10);
        }
        System.out.println(n % 10);
    }
}
