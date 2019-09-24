// public class Test9{
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 20;
//         int ret = add(a,b);
//         System.out.println("ret = " + ret);
//     }
//     public static int add(int a,int b){
//         return a + b;
//     }
// }

// public class Test9{
//     public static void main(String[] args) {
//         double a = 10.5;
//         double b = 10.5;
//         double ret = add(a,b);
//         System.out.println("ret = " + ret);
//     }
//     public static double add(double x,double y){
//         return x + y;
//     }
// }


//方法重载：方法的名字相同，但参数的类型不同；方法的名字相同，参数的个数不同
// public class Test9{
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 20;
//         int ret = add(a,b);
//         System.out.println("ret = " + ret);

//         double a1 = 10.5;
//         double a2 = 10.5;
//         double ret2 = add(a1,a2);
//         System.out.println("ret2 = " + ret2);

//         double x1 = 19.9;
//         double x2 = 18.9;
//         double x3 = 19.3;
//         double ret3 = add(x1,x2,x3);
//         System.out.println("ret3 = " + ret3);
//     }
//     public static int add(int x,int y){
//         return x + y;
//     }
//     public static double add(double x,double y){
//         return x + y;
//     }
//     public static double add(double a1,double a2,double a3){
//         return a1 + a2 + a3;
//     }
// }

//当两个方法的名字相同，参数也相同，但返回值的类型不同时，不构成重载。如下
public class Test9{
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int ret = add(x,y);
        System.out.println("ret = " + ret);
    }
    public static int add(int a,int b){
        return a + b;
    }
    public static double add(int q,int w){
        return q + w;
    }
}

// public class Test9{
//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(fac(n));
//     }
//     public static int fac(int num){
//         if(num == 1){
//             return 1;
//         }
//         else{
//             return num * fac(num - 1);
//         }
//     }
// }

// public class Test9{
//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(fac(n));
//     }
//     public static int fac(int num){
//         System.out.println("函数开始num = " + num);
//         if(num == 1){
//             System.out.println("函数结束num = " + num);
//             return 1;
//         }
//         int ret = num * fac(num - 1);
//         System.out.println("函数结束num = " + num + "ret = " + ret);
//         return ret;
//     }
// }

// public class Test9{
//     public static void main(String[] args) {
//         int num = 1234;
//         print(num);
//     }
//     public static void print(int n){
//         if(n > 9){
//             print(n / 10);
//         }
//         System.out.println(n % 10);
//     }
// }

// public class Test9{
//     public static void main(String[] args) {
//         int num = 12345;
//         print(num);
//     }
//     public static void print(int n){
//         if(n > 9){
//             print(n / 10);
//         }
//         System.out.println(n % 10);
//     }
// }

// public class Test9{
//     public static void main(String[] args) {
//         int n = 5;
//         int ret = add(n);
//         System.out.println(ret);
//     }
//     public static int add(int num){
//         if(num == 1){
//             return 1;
//         }
//         return num + add(num - 1);
//     }
// }

// public class Test9{
//     public static void main(String[] args) {
//         int num = 1234;
//         System.out.println(sum(num));
//     }
//     public static int sum(int n){
//         if(n < 9){
//             return n;
//         }
//         return n % 10 + sum(n / 10);
//     }
// }


// public class Test9{
//     public static void main(String[] args) {
//         int num = 123456789;
//         System.out.println(sum(num));
//     }
//     public static int sum(int n){
//         if(n < 10){
//             return n;
//         }
//         return n % 10 + sum(n / 10);
//     }
// }

// public class Test9{
//     public static void main(String[] args) {
//         int n = 6;
//         System.out.println(fac(n));
//     }
//     public static int fac(int n){
//         if(n == 1 || n == 2){
//             return 1;
//         }
//         return fac(n - 1) + fac(n - 2);
//     }
// }

// public class Test9{
//     public static void main(String[] args) {
//         int n = 46;
//         System.out.println(fac(n));
//     }
//     public static int fac(int n){
//         int last = 1;
//         int last2 = 1;
//         int cur = 0;
//         for(int i = 3; i <= n; i++){
//             cur = last +last2;
//             last = last2;
//             last2 = cur;
//         }
//         return cur;
//     }
// }

// public class Test9{
//     public static void main(String[] args) {
//         long num = 50;
//         System.out.println(fac(num));
//     }
//     public static long fac(long n){
//         long last = 1;
//         long last2 = 1;
//         long cur = 0;
//         for(int i = 3; i <= n; i++){
//             cur = last + last2;
//             last = last2;
//             last2 = cur;
//         }
//         return cur;
//     }
// }

