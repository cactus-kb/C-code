public class Demo1 {
    public static void quiksort(int[] arr,int start,int end) {
        if (start < end) {
            int stard = arr[start];
            int low = start;
            int high = end;
            while(low < high) {
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
            quiksort(arr,start,low);
            quiksort(arr,low + 1,end);
        }
    }
}



