public class Sum {
    public static void main(String[] args) {
        int n = 12345;
        int ret = sum(n);
        System.out.println("ret = " + ret);
    }

    public static int sum(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + sum(n / 10);
    }
}
