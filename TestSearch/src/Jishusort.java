import java.util.Arrays;

public class Jishusort {
    //基数排序
    public static void main(String[] args) {
        int[] arr = new int[] {23,8,345,678,34,23,67,0,578,34,65,654,4,345};
        redixsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void redixsort(int [] arr) {
        //存数组中最大的数字
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        //求最大数字是几位数
        int maxlength = (max + "").length();
        //用于临时存储数据的数组
        int [][] tmp = new int[10][arr.length];
        //用于记录在tmp中相应的数组中存放的数字的数量
        int[] counts = new int[10];
        //根据最大长度的数决定比较的次数
        for (int i = 0,n = 1; i < maxlength; i++,n *= 10) {
            //把每一个数字分别计算余数
            for (int j = 0; j < arr.length; j++) {
                //计算余数
                int yushu = arr[j] / n % 10;
                //把当前遍历的数据放入指定的数组中
                tmp[yushu][counts[yushu]] = arr[j];
                //记录数量
                counts[yushu]++;
            }
            //记录取的元素需要放的位置
            int index = 0;
            //把数字取出来
            for (int k = 0; k < counts.length; k++) {
                if (counts[k] != 0) {
                    //循环取出元素
                    for (int l = 0; l < counts[k]; l++) {
                        arr[index] = tmp[k][l];
                        index++;
                    }
                    //把数量置为0
                    counts[k] = 0;
                }
            }
        }
    }
}
