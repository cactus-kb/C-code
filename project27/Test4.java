//递归求 N 的阶乘
// public class Test4{
//     public static void main(String[] args) {
//         int num = 7;
//         int ret = Fact(num);
//         System.out.println(ret);
//     }
//     public static int Fact(int a){
//         if(a == 1){
//             return 1;
//         }
//         else{
//             return a * Fact(a - 1);
//         }
//     }
// }

//递归求 1 + 2 + 3 + ... + 10 
// public class Test4{
//     public static void main(String[] args) {
//         int num = 10;
//         int ret = Sum(num);
//         System.out.println(ret);
//     }
//     public static int Sum(int a){
//         if(a == 1){
//             return 1;
//         }
//        else{
//             return a + Sum(a - 1);
//         }
//     }
// }

//按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4)
// public class Test4{
//     public static void main(String[] args) {
//         int num = 1234;
//         PrintNum(num);
//     }
//     public static void PrintNum(int a){
//         if(a > 9){
//         PrintNum(a / 10);
//         }
//         System.out.print(a % 10 + " ");
//     }
// }

//写一个递归方法，输入一个非负整数，返回组成它的数字之和
public class Test4{
    public static void main(String[] args) {
        int num = 1234;
        int sum = Print(num);
        System.out.println(sum);
    }
    public static int Print(int num){
        if(num < 10){
            return num;
        }
        else{
            return num % 10 + Print(num / 10);
        }
    }
    
}