package Struct;

import java.util.Arrays;

public class insertsort {
    public static void main(String[] args) {
        int[] arr = new int[] {3,6,4,8,1,2,9,7,6,0};
       insertsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertsort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                int tmp = arr[i];
                int j;
                for (j = i - 1; j >= 0 && arr[j] > tmp; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[j + 1] = tmp;
            }
        }
    }
}
