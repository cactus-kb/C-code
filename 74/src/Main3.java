import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int[] score = new int[N];
            for (int i = 0; i < N; i++) {
                score[i] = scanner.nextInt();
            }
            for (int j = 0; j < M; j++) {
                String str = scanner.next();
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                compare(str, a, b, score);
            }
        }
        scanner.close();
    }

    private static void compare(String str, int a, int b, int[] score) {
        int begin, end;
        if (str.equals("Q")) {
            end = Math.max(a, b);
            begin = Math.min(a, b) - 1;
            int max = score[begin];
            for (int i = begin; i < end; i++) {
                if (max < score[i]) {
                    max = score[i];
                }
            }
            System.out.println(max);
        } else if (str.equals("U")) {
            score[a - 1] = b;
        }
    }
}
