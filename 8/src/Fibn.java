public class Fibn {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fibn(n));
    }

    public static int fibn(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibn(n - 1)+ fibn(n - 2);
    }
}
