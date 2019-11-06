package Struct;

public class quicksort {
    public static void main(String[] args) {

    }

    public static void quicksort(int[] arr, int start,int end) {
        if (start < end) {
            int stard = arr[start];
            int low = stard;
            int high = end;
            while (low < high) {
                while (low < high && stard <= arr[high]) {
                    high--;
                }
                arr[low] = arr[high];
                while (low < high && arr[low] <= stard) {
                    low++;
                }
                arr[high] = arr[low];
            }
            arr[low] = stard;
            quicksort(arr,start,low);
            quicksort(arr,low + 1,end);
        }
    }
}
