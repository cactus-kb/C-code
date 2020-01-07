import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
                if (i == N) {
                    break;
                }
            }
            int A1 = 0, A2 = 0, A3 = 0, A4 = 0, A5 = 0;
            int count2 = 0;
            int flg = 1;
            int a4 = 0;
            for (int i = 0; i < N; i++) {
                int ret = arr[i];
                if (ret % 5 == 0 && ret % 2 == 0) {
                    A1 += ret;
                }
                if (ret % 5 == 1) {
                    A2 += ret * flg;
                    flg = -flg;
                }
                if (ret % 5 == 2) {
                    A3 += 1;
                }
                if (ret % 5 == 3) {
                    count2++;
                    a4 += ret;
                }
                if (ret % 5 == 4) {
                    if (ret > A5) {
                        A5 = ret;
                    }
                }
            }
            int xs;
            int yu = (a4 % count2) * 10 / count2;
            if (yu * 10 / count2 >= 5) {
                xs = yu + 1;
            } else {
                xs = yu;
            }
            System.out.println(A1 + " " + A2 + " " + A3 + " " + (A4 / count2) + "." + xs + " " + A5);

        }
    }
}
