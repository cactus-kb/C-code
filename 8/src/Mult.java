public class Mult {
    public static void main(String[] args) {
        int n = 5;
        int ret = mult(n);
        System.out.println("ret = " + ret);
    }

    public static int mult(int n) {
        if (n == 1) {
            return 1;
        }
        return n * mult(n - 1);
    }
}
