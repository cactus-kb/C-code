package Struct;

import java.util.Arrays;

public class shellsort {
    public static void main(String[] args) {
        int[] arr = new int[] {3,5,2,7,1,0,8,9,4};
        shellsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void shellsort(int[] arr) {
        for (int d = arr.length / 2; d > 0; d = d / 2) {
            for (int i = d; i < arr.length; i ++) {
                for (int j = i - d; j >= 0; j = j - d) {
                    if (arr[j] > arr[j + d]) {
                        int tmp = arr[j];
                        arr[j] = arr[j + d];
                        arr[j + d] = tmp;
                    }
                }
            }
        }
    }
}
