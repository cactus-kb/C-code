import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[] {5,3,7,1,8,4,9,3,0,2};
        quicksort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quicksort(int[] arr, int start, int end) {
        if (start < end) {
            //把数组中的第0个作为标准数
            int stard = arr[start];
            //记录需要排序的下标
            int low = start;
            int high = end;
            while (low < high) {
                //右边的数字比标准数大
                while (low < high && stard <= arr[high]) {
                    high--;
                }
                arr[low] = arr[high];
                while (low < high && arr[low] <= stard) {
                    low++;
                }
                arr[high] = arr[low];
            }
            //当low和high重合时，将标准数赋给这个重合的位置的数
            arr[low] = stard;
            //处理比标准数小的数字
            quicksort(arr, start, low);
            //处理比标准数大的数字
            quicksort(arr, low + 1, end);
        }
    }
}
