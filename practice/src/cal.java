public class cal {
//   数的加减乘除
//    private double num1;
//    private double num2;
//
//    public void Add(double a, double b){
//        double ret = a + b;
//        System.out.println("ret = " + ret);
//    }
//
//    public void Sub(double a, double b){
//        double ret = a - b;
//        System.out.println("ret = " + ret);
//    }
//
//    public void Mul(double a, double b){
//        double ret = a * b;
//        System.out.println("ret = " + ret);
//    }
//
//    public void Div(double a, double b){
//        double ret = a / b;
//        System.out.println("ret = " + ret);
//    }

// 构造函数
//    private String name;
//    private String sex;
//    private int age;
//
//    public cal(){
//        this.name = "小白";
//        this.sex = "boy";
//        this.age = 18;
//    }
//
//    public cal(String name, String sex, int age){
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//    }
//
//    public void show(){
//        System.out.println("my name is " + name + ",i'm a " + sex + " and i'm " + age);
//    }


//  交换两个数
//    private int num1 ;
//    private int num2 ;

//    public cal(int num1, int num2){
//        this.num1 = num1;
//        this.num2 = num2;
//    }
//
//    public void show(){
//        System.out.println("num1 = " + num1 + ", num2 = " + num2);
//    }

    public void show(int a,int b){
        System.out.println("a = " + a + ", b = " + b);
        int tmp;
        tmp = a;
        a = b;
        b = tmp;
        System.out.println("a = " + a + ", b = " + b);
    }
}
