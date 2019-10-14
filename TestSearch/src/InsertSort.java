import java.util.Arrays;

public class InsertSort {
    //插入排序
    public static void main(String[] args) {
        int[] arr = new int[] {3,5,6,4,1,2,8,0,9,4,5};
        insertsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertsort(int[] arr) {
        //遍历所有的数字
        for (int i = 1; i < arr.length; i++) {
            //如果当前数字比前一个数字小
            if (arr[i] < arr[i - 1]) {
                //把当前数字存起来
                int tmp = arr[i];
                //遍历当前数字前面的所有数字,从后往前遍历
                int j;
                for (j = i - 1; j >= 0 && arr[j] > tmp; j--) {
                    //把前一个数字赋给后一个数字
                    arr[j + 1] = arr[j];
                }
                arr[j + 1] = tmp;
            }
        }
    }
}
