import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[] {2,3,5,7,3,8,12,1,9,0,4,6};
        shellsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void shellsort(int[] arr) {
        //遍历所有步长
        for (int d = arr.length / 2; d > 0; d /= 2) {
            //遍历所有元素
            for (int i = d; i < arr.length; i++) {
                //遍历本组中所有元素
                for (int j = i - d; j >=  0; j -= d) {
                    //若当前元素大于加上步长后的那个元素
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
