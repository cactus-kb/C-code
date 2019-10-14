import java.util.Arrays;

public class guibingsort {
    public static void main(String[] args) {
        int[] arr = new int[] {1,3,5,4,6,3,6,8,0,2,9,13};
        System.out.println(Arrays.toString(arr));
        mergesort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    //归并程序
    public static void mergesort(int[] arr,int low,int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            //处理左边
            mergesort(arr, low, mid);
            //处理右边
            mergesort(arr, mid + 1, high);
            //归并
            merget(arr, low, mid, high);
        }
    }
    public static void merget(int[] arr, int low,int mid,int high) {
        //用于存储归并后的临时数组
        int[] tmp = new int[high - low + 1];
        //记录第一个数组中需要遍历的下标
        int i = low;
        //记录第二个数组中需要遍历的下标
        int j = mid + 1;
        //记录在临时数组中的下标
        int index = 0;
        //遍历两个数组取出小的数字，放入临时数组中
        while (i <= mid && j <= high) {
            //第一个数组的数据更小
            if (arr[i] <= arr[j]) {
                //把小的数据放入临时数组中
                tmp[index] = arr[i];
                //下标后移
                i++;
            }
            else {
                tmp[index] = arr[j];
                j++;
            }
            index++;
        }
        //处理多余的数据
        while (j <= high) {
            tmp[index] = arr[j];
            j++;
            index++;
        }
        while (i <= mid) {
            tmp[index] = arr[i];
            i++;
            index++;
        }
        //把临时数组中的数据重新存入原数组
        for (int k = 0; k < tmp.length; k++) {
            arr[k + low] = tmp[k];
        }
    }
}
