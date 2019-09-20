// //给定两个 int 变量, 交换变量的值
// // public class Go{
// //     public static void main(String[] args){
// //         int num1 = 10;
// //         int num2 = 20;
// //         int tmp;
// //         System.out.println("num1 = "+num1);
// //         System.out.println("num2 = "+num2);
// //         tmp = num1;
// //         num1 = num2;
// //         num2 = tmp;
// //         System.out.println("交换后：");
// //         System.out.println("num1 = "+num1);
// //         System.out.println("num2 = "+num2);
// //     }
// // }


// //给定三个 int 变量, 求其中的最大值和最小值. 
// public class Go{
//     public static void main(String[] args){
//         int a = 10;
//         int b = 30;
//         int c = 20;
//         if(a > b ){
//             if(a > c){
//                 System.out.println(a);
//             }
//             else{
//                 System.out.println(c);
//             }
//         }
//         else {
//             if(b < c){
//                 System.out.println(c);
//             }
//             else {
//                 System.out.println(b);
//             }
//         }
//         if(a > b ){
//             if(b > c){
//                 System.out.println(c);
//             }
//             else{
//                 System.out.println(b);
//             }
//         }
//         else {
//             if(a > c){
//                 System.out.println(c);
//             }
//             else {
//                 System.out.println(a);
//             }
//         }
//     }
// }

//根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上) 
// public class Go{
//     public static void main(String[] args){
//         int age = 78;
//         if(age <= 18){
//             System.out.println("childhood");
//         }
//         else if (age >= 19 && age <= 28){
//             System.out.println("youth");
//         }
//         else if (age >= 29 && age <= 55){
//             System.out.println("man");
//         }
//         else if (age > 55) {
//             System.out.println("old man");
//         }
//     }
// }

//判断一个数是否是素数
// public class Go{
//     public static void main(String[] args){
//         int num = 23;
//         int i;
//         for (i = 2; i <= Math.sqrt(num); i++){
//             if (num % i == 0){
//                 System.out.println("is not prime");
//             }
//             else {
//                 System.out.println("is  prime");
//             }
//         }
//     }
// }

//打印1--100之间所有的素数
// public class Go{
//     public static void main(String[] args){
//         int i;
//         for(int j = 2; j <= 100;j++){
//             i = 2;
//             while(j % i != 0){
//                 i++;
//             }
//             if(i == j){
//                 System.out.println(j);
//             }
//         }
//     }
// }


// 输出 1000 - 2000 之间所有的闰年 
// public class Go{
//     public static void main(String[] args){
//         int year;
//         for(year = 1000; year <= 2000; year++){
//             if(year % 400 == 0 ||(year % 4 == 0 && year % 100 != 0)){
//                 System.out.println(year);
//             }
//         }
//     }
// }

//输出乘法口诀表 
// public class Go{
//     public static void main(String[] args){
//         int i;
//         int j;
//         for(i = 1; i <= 9; i++){
//             for(j = 1; j <= i; j++){
//                 System.out.print(i + "*" + j + "=" + i * j + "\t");
//             }
//             System.out.println(" ");
//         }
//     }
// }

// 求两个正整数的最大公约数 
// public class Go{
//     public static void main(String[] args){
//         int num1 = 25;
//         int num2 = 15;
//         int ret;
//         ret = num1 % num2;
//         while(ret != 0){
//             num1 = num2;
//             num2 = ret;
//             ret = num1 % num2;
//         }
//         System.out.println(num2);
//     }
// }

// 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。 
public class Go{
    public static void main(String[] args){
        double a = 1.0;
        int i;
        double sum = 0.0;
        for(i = 1; i <= 100; i++){
            if(i % 2 == 0){
                sum += -(a/i);
            }
            else{
                sum += (a/i);
            }
        }
        System.out.println(sum);
    }
}
