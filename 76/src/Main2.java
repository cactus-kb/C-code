import java.util.Scanner;

public class Main2 {


    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int x = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                if (x == arr[i]) {
                    System.out.println(i);
                    break;
                }
                if (i == arr.length - 1) {
                    System.out.println("-1");
                }
            }
        }
        scanner.close();
    }

}
