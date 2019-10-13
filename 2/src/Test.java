//import java.util.Arrays;
//class person{
//    String name;
//    int age;
//}
//public class Test {
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        int ret = add(a,b);
//        System.out.println(ret);
        //   }

//    public static int add(int x,int y) {
//        return x + y;
//    }

//        int n = 5;
//        int ret = factor(n);
//        System.out.println(ret);
//  }
//    public static int factor(int n) {
//        if (n == 1) {
//            return 1;
//        }
//        return n * factor(n - 1);
//    }
//        int n = 4;
//        int ret = fib(n);
//        System.out.println(ret);

//        public static int fib(int n) {
//            if (n ==1 || n == 2) {
//                return 1;
//            }
//            return fib(n -1) + fib(n -2);
//        }
//        int n = 4;
//        int ret = fib(n);
//        System.out.println(ret);
//    }
//    public static int fib(int n) {
//        int last1 = 1;
//        int last2 = 1;
//        int cur = 0;
//        for (int i = 3; i <= n; i++) {
//            cur = last1 +last2;
//            last1 = last2;
//            last2 = cur;
//        }
//        return cur;
//}

//        int n = 5;
//        int ret = fogJump(n);
//        System.out.println(ret);
//    }
//    public static int fogJump(int n) {
//        if (n == 1) {
//            return 1;
//        }
//        if (n < 1) {
//            return 0;
//        }
//        if (n == 2) {
//            return 2;
//        }
//        return fogJump(n - 1) + fogJump(n - 2);

//        int[] arr = {1,2,3};
//        for (int x : arr){
//            System.out.println(x);
//        }

//        int[] arr= {9,5,2,7};
//        bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
//        }
//    public static void bubbleSort(int[] arr) {
//        for (int bound = 0; bound < arr.length; bound++) {
//            for (int cur = arr.length - 1; cur > bound; cur--) {
//                if (arr[cur - 1] > arr[cur]) {
//                    int tmp = arr[cur - 1];
//                    arr[cur - 1] = arr[cur];
//                    arr[cur] = tmp;
//                }
//            }
//        }

//        int[] arr = {1,2,3,4};
//        reverse(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//    public static void reverse(int[] arr) {
//        int left = 0;
//        int right = arr.length - 1;
//        while (left < right) {
//            int tmp = arr[right];
//            arr[right] = arr[left];
//            arr[left] = tmp;
//            left++;
//            right--;
//        }
//    }
//
//        int[] arr = {1,2,3,4,5,6};
//        transfor(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//    public static void transfor(int[] arr) {
//        int left = 0;
//        int right = arr.length - 1;
//        while (left < right) {
//            while (left < right && arr[left] % 2 != 0) {
//                left++;
//            }
//            while (left < right && arr[right] % 2 == 0) {
//                right--;
//            }
//            int tmp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = tmp;
//        }

//        person a = new person();
//        System.out.println(a.name);
//        System.out.println(a.age);
//    }
//}


public class Test {
    public static void main(String[] args) {
       int n = 6;
       int ret = fib(n);
        System.out.println(ret);
    }
    public static int fib(int n) {
        int last1 = 1;//定义第一个数为last1
        int last2 = 1;//定义第二个数为last2
        int cur = 0;//定义当前位置数为cur
        for (int i = 3; i <= n; i++) {
            cur = last1 + last2;
            last1 = last2;//把last2的值赋给last1
            last2 = cur;//把cur的值赋给last2
        }
        return cur;
    }
}
