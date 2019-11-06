package Struct;

import java.util.Arrays;

public class selectsort {
    public static void main(String[] args) {
        int[] arr = new int[] {3,5,4,1,0,8,9,7,2,5,6};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
                if (i != minIndex) {
                    int tmp = arr[i];
                    arr[i] = arr[minIndex];
                    arr[minIndex] = tmp;
                }
            }
        }
    }
}
