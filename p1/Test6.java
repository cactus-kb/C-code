//求斐波那契数列的第 N 项 
// public class Test6{
//     public static void main(String[] args) {
//         int num = 6;
//         System.out.println(Fiber(num));
//     }
//     public static int Fiber(int num){
//         if(num == 1 || num == 2){
//             return 1;
//         }
//         return Fiber(num - 1) + Fiber(num - 2);
//     }
// }

//求解汉诺塔问题
// public class Test6{
//     public static void main(String[] args) {
//     int n = 3;
//     Hannor(n,"a","b","c");
//     }
//     public static void Hannor(int n,String a,String b,String c){
//         if(n == 1){
//             System.out.println("把第"+1+"个盘子从"+a+"移到"+c);
//         }
//         else{
//             Hannor(n - 1, a, c, b);
//             System.out.println("把第"+n+"个盘子从"+a+"移到"+c);
//             Hannor(n - 1, b, a, c);
//         }
//     }
// }

//青蛙跳台阶
public class Test6{
    public static void main(String[] args){
        int n = 4;
        System.out.println(Fogjump(n));
    }
    public static long Fogjump(int n){
        if(n < 1){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        return Fogjump(n - 1) + Fogjump(n - 2);
    }
}


