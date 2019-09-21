import java.util.Arrays;

//import java.util.Arrays;

//数组转字符
// public class Test5{
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4};
//         System.out.println(toString(arr));
//     }
//     public static String toString(int[] arr){
//         String ret = "[";
//         for(int i = 0; i < arr.length; i++){
//             ret = ret + arr[i];
//             if(i != arr.length - 1){
//                 ret = ret + ",";
//             }
//         }
//         ret = ret + "]";
//         return ret;
//     }
// }

// public class Test5{
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4};
//         String newarr = Arrays.toString(arr);
//         System.out.println(newarr);
//     }
// }

//数组拷贝
public class Test5{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(copy(arr)));
    }
    public static int[] copy(int[] arr){
        int[] ret = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            ret[i] = arr[i];
        }
        return ret;
    }
}

// public class Test5{
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4};
//         int[] newarr = Arrays.copyOf(arr, arr.length);
//         System.out.println(Arrays.toString(newarr));
//     }
// }