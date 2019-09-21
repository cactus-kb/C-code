import java.util.Scanner;
//编写程序数一下 1到 100 的所有整数中出现多少个数字9。 
// public class Test3{
//     public static void main(String[] args) {
//         int count = 0;
//         int i;
//         for (i = 1; i <= 100; i++){
//             if (i % 10 == 9){
//                 count++;
//             }
//             else if (i / 10 == 9){
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }


//求出0～999之间的所有“水仙花数”并输出
// public class Test3{
//     public static void main(String[] args) {
//         int i;
//         for (i = 0; i <= 999; i++){
//             int x = i / 100;
//             int y = (i % 100) / 10;
//             int z = i % 10; 
//             if(i ==x*x*x+y*y*y+z*z*z){
//                 System.out.println(i);
//             }
//         }
//     }
// }

//编写代码模拟三次密码输入的场景。
// public class Test3{
//     public static void main(String[] args) {
//        int i;
//        Scanner sc = new Scanner(System.in);
//         for(i = 0; i < 3; i++){
//             System.out.println("请输入密码：");
//             String pwd = sc.nextLine(); 
//             if ("123456".equals(pwd) == true){
//                 System.out.println("密码正确!");
//                 break;
//             } 
//             else {
//                 System.out.println("密码错误，请重新输入!");
//             }
//         }
//         sc.close();
//     }
// }


//写一个函数返回参数二进制中 1 的个数 
// public class Test3{
//     public static void main(String[] args){
//         int num = 35;
//         int i;
//         int ret;
//         int count = 0;
//         for (i = 0; i < 32; i++){
//             ret = num  & 1;
//             num = num >> 1;
//             if(ret == 1){
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }


//获取一个数二进制序列中所有的偶数位和奇数位,分别输出二进制序列。 
// public class Test3{
//     public static void main (String[] args){
//         int num = 13;
//         int i;
//         int ret;
//         int ret1;
//         System.out.println("奇数位为：");
//         for (i = 31; i >= 0; i -= 2){
//             ret = (num >> i) & 1;
//             System.out.print(ret);
//         }
//         System.out.println();
//         System.out.println("偶数位为：");
//         for (i = 30; i >= 0; i -= 2){
//             ret1 = (num >> i) & 1;
//             System.out.print(ret1);
//         }
//     }
// }


// 输出一个整数的每一位. 
// public class Test3{
//     public static void main(String[] args) {
//         int num = 1234;
//         PrintNum(num);
//     }
//     public static void PrintNum(int a){
//         if (a > 9){
//             PrintNum(a / 10);
//         }
//         System.out.println(a % 10);
//     }
// }

//完成猜数字游戏
public class Test3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = (int) (Math.random() * 100);
        int guess;
        System.out.println("请输入您猜的数字：");
        while(true){
            guess = input.nextInt();
            if (guess > number){
                System.out.println("猜大了!");
            }
            else if (guess < number){
                System.out.println("猜小了");
            }
            else{
                System.out.println("猜对了");
            }
        }
    }
}