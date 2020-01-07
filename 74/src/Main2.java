import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
            int i = 0;
            int c = a;
            while (i != n) {
                if (c >= b[i]) {
                    c += b[i];
                } else {
                    int poewr = Max_gongyinshu(c, b[i]);
                    c += poewr;
                }
                i++;
            }
            System.out.println(c);
        }
        scanner.close();
    }

    private static int Max_gongyinshu(int a, int b) {
        if (b > a) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        int c = a % b;
        while (c != 0) {
            a = b;
            b = c;
            c = a % b;
        }
        return b;
    }
}



















