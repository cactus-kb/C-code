import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[] {3,2,5,4,6,7,8,9,0,7,1,10};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("=====================");

    }

    private static void bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i ++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
