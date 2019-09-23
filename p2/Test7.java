import java.util.Arrays;

// public class Test7{
//     public static void main(String[] args) {
//         int[] arr = {1,2,3};
//         System.out.println(arr.length);
//         System.out.println(arr[0]);
//         System.out.println(arr[1]);
//         arr[2] = 5;
//         System.out.println(arr[2]);
//         System.out.println(arr[3]);//下标越界
//     }
// }

// public class Test7{
//     public static void main(String[] args) {
//         int [] arr = {1,2,3,4,5,};
//         for(int i = 0; i < arr.length; i++){
//             System.out.println(arr[i]);
//         }
//     }
// }

// public class Test7{
//     public static void main(String[] args) {
//         int [] arr = {1,2,3,4,51};
//         for(int x : arr){
//             System.out.println(x);
//         }
//     }
// }

// public class Test7{
//     public static void main(String[] args) {
//         int [] arr = {0,6,7};
//         print(arr);
//     }
//     public static void print(int[] arr){
//         for(int x : arr){
//             System.out.println(x);
//         }
//     }
// }

// public class Test7{
//     public static void main(String[] args) {
//         int num = 0;
//         fun(num);
//         System.out.println("num = "+num);
//     }
//     public static void fun(int x){
//         x = 2;
//         System.out.println("x = "+x);
//     }
// }

// public class Test7{
//     public static void main(String[] args) {
//         int[] arr = {1,2,3};
//         fun(arr);
//         System.out.println("arr[1] = "+arr[1]);
//     }
//     public static void fun(int[] arr1){
//         arr1[1] = 0;
//         System.out.println("arr1[1] = "+arr1[1]);
//     }
// }

// public class Test7{
//     public static void main(String[] args) {
//         int[] arr = {1,2,3};
//         fun1(arr);
//         fun(arr);
//     }
//     public static void fun(int[] arr){
//         for(int x : arr){
//             System.out.println(x);
//         }
//     }
//     public static void fun1(int[] arr){
//         for(int i = 0; i < arr.length; i++){
//             arr[i] = arr[i] * 2;
//         }
//     }
// }

// public class Test7{
//     public static void main(String[] args) {
//         int[] arr = {1,2,3};
//         int[] arr1 = fun1(arr);
//         fun(arr1);
//         fun(arr);
//     }
//     public static void fun(int[] arr){
//         for(int x : arr){
//             System.out.println(x);
//         }
//     }
//     public static int[] fun1(int[] arr){
//         int [] arr2 = new int[arr.length];
//         for(int i = 0; i < arr.length; i++){
//             arr2[i] = arr[i] * 2;
//         }
//         return arr2;
//     }
// }

// public class Test7{
//     public static void main(String[] args) {
//         int[] arr = {1,2,3};
//         System.out.println(Arrays.toString(arr));
//     }
// }

// public class Test7{
//     public static void main(String[] args) {
//         int[] arr = {1,2,3};
//         int[] arr1 = Arrays.copyOf(arr, arr.length);
//         System.out.println(Arrays.toString(arr1));
//     }
// }

// public class Test7{
//     public static void main(String[] args) {
//         int[] arr = {1,2,3};
//         System.out.println(max(arr));
//     }
//     public static int max(int[] arr){
//         int max = arr[0];
//         for(int i = 1; i < arr.length; i++){
//             if(arr[i] > max){
//                 max = arr[i];
//             }
//         }
//         return max;
//     }
// }

// public class Test7{
//     public static void main(String[] args) {
//         int[] arr = {1,2,3};
//         System.out.println(avg(arr));
//     }
//     public static double avg(int[] arr){
//         int sum = 0;
//         for(int x : arr){
//             sum += x;
//         }
//         return (double)sum /(double) arr.length;
//     }
// }

// public class Test7{
//     public static void main(String[] args) {
//         int[] arr = {1,3,6,5,8,9};
//         System.out.println(find(arr,10));
//     }
//     public static int find(int[] arr,int tofind){
//         for(int i = 0; i < arr.length; i++){
//             if(arr[i] == tofind){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }

// public class Test7{
//     public static void main(String[] args) {
//         int[] arr = {9,4,8,2};
//         Arrays.sort(arr);;
//         System.out.println(Arrays.toString(arr));
//     }
// }

// public class Test7{
//     public static void main(String[] args) {
//         int[] arr = { 1,6,4,8,5,9};
//         bubble(arr);
//         System.out.println(Arrays.toString(arr));
//     }
//     public static void bubble(int[] arr){
//         for(int start = 0; start < arr.length; start++){
//             for(int end = arr.length - 1; end > start; end--){
//                 if(arr[end - 1] > arr[end]){
//                     int tmp = arr[end - 1];
//                     arr[end - 1] = arr[end];
//                     arr[end] = tmp;
//                 }
//             }
//         }
//     }
// }

// public class Test7{
//     public static void main(String[] args) {
//         int[] arr = {1,3,4,6};
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

// public class Test7{
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4};
//         change(arr);
//         System.out.println(Arrays.toString(arr));
//     }
//     public static void change(int[] arr){
//         int left = 0;
//         int right = arr.length - 1;
//         while(left < right){
//             if(arr[left] % 2 != 0 && arr[right] % 2 == 0){
//                 int tmp = arr[left];
//                 arr[left] = arr[right];
//                 arr[right] = tmp;
//                 left++;
//                 right--;
//             }
//         }
//     }
// }

// public class Test7{
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4};
//         change(arr);
//         System.out.println(Arrays.toString(arr));
//     }
//     public static void change(int[] arr){
//         int left = 0;
//         int right = arr.length - 1;
//         while(left < right){
//             while(left < right && arr[left] % 2 == 0){
//                 left++;
//             }
//             while(left < right && arr[right] % 2 != 0){
//                 right--;
//             }
//             int tmp = arr[left];
//             arr[left] = arr[right];
//             arr[right] = tmp;
//         }
//     }
// }

