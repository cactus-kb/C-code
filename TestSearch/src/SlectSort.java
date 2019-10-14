import java.util.Arrays;

public class SlectSort {
    //选择排序
    public static void main(String[] args) {
        int[] arr = new int[] {4,2,5,7,6,8,0,9,3,120,1,2,6};
        selectsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectsort(int[] arr) {
        //遍历 所有的数
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            //把当前遍历的数和后面所有的数依次进行比较，并记录下最小数的下标
            for (int j = i + 1; j < arr.length;j++) {
                //如果后面比较的数字比记录的最下的数小
                if (arr[minIndex] > arr[j]) {
                    //记录最小的数的下标
                    minIndex = j;
                }
            }
            //如果最小的数和当前遍历数的下标不一致，说明下表为minIndex的数要比当前遍历的数小
            if (i != minIndex) {
                int tmp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = tmp;
            }
        }
    }
}
