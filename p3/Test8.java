//import java.util.Arrays;

// public class Test8{
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5};
//         reverse(arr);
//         System.out.println(Arrays.toString(arr));
      
//     }
//     public static void reverse(int[] arr){
//         int left = 0;
//         int right = arr.length - 1;
//         while(left < right){
//             int tmp = arr[left];
//             arr[left] = arr[right];
//             arr[right] = tmp;
//             left++;
//             right--;
//         }
//     }
// }

public class Test8{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(find(arr,5));
    }
    public static int find(int[] arr, int tofind){
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(tofind > arr[mid]){
                left = mid + 1;
            }
            else if(tofind < arr[mid]){
                right = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}