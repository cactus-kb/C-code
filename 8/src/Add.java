public class Add {
    public static void main(String[] args) {
        int n = 10;
        int ret = add(n);
        System.out.println("ret = " + ret);
    }

    public static int add(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        return n + add(n - 1);
    }
}
