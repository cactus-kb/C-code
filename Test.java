public class Test {
    public static void main(String[] args) {
//        change p = new change(1, 2);
//        p.change();

        Calculator p = new Calculator();
       double ret =  p.Add(1,2.5);
        System.out.println("ret = " + ret);
       double ret1 = p.Sub(1,3);
        System.out.println("ret1 = " + ret1);
       double ret2 = p.Mul(1.5,2);
        System.out.println("ret2 = " + ret2);
       double ret3 = p.Div(2,5);
        System.out.println("ret3 = " + ret3);
        System.out.println("***********************");
        Person person = new Person("小红",15);
        person.eat();
        Person person1 = new Person("小兰",15);
        person1.play();
        Person person2 = new Person("小白",15);
        person2.study();
        Person person3 = new Person("小黑",18);
        person3.show();
    }
}

class change {
    private int num1;
    private int num2;

    public change (int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public  void change () {
        int tmp = this.num1;
        this.num1 = this.num2;
        this.num2 = tmp;
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
    }
}

