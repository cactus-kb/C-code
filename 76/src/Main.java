import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = scanner.next();
        }
        int vote = scanner.nextInt();
        String[] str2 = new String[vote];
        for (int i = 0; i < vote; i++) {
            str2[i] = scanner.next();
        }
        int[] arr = new int[n];
        for (int i = 0; i < vote; i++) {
            for (int j = 0; j < n; j++) {
                if (str2[i].equals(str[j])) {
                    arr[j] += 1;
                    break;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(str[i] + " : " + arr[i]);
        }
        int ret = 0;
        for (int i = 0; i < n; i++) {
            ret += arr[i];
        }
        System.out.println("Invalid : " + ret);
    }


    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(fun(n) + " " + fun(n * n));
    }

    private static int fun(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int Pingfang = n * n;
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        while (n != 0) {
            if (n < 10) {
                list.add(n);
            }
            n = n % 10;
        }
        while (Pingfang != 0) {
            if (Pingfang < 10) {
                list2.add(Pingfang);
            }
            Pingfang = Pingfang % 10;
        }
        int ret = 0;
        for (int i = 0; i < list.size(); i++) {
            ret += list.get(i);
        }
        int ret2 = 0;
        for (int i = 0; i < list2.size(); i++) {
            ret2 += list2.get(i);
        }
        System.out.print(ret + " " + ret2);
    }


}
