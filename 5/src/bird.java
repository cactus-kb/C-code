//public class bird {
//    public String name;
//
//    public bird(String name) {
//        this.name = name;
//    }
//
//    public void eat(String food) {
//        System.out.println(this.name + "正在吃" + food);
//    }
//
//    public void fly() {
//        System.out.println(this.name + "在天空中飞");
//    }
//}

public class bird extends Animal{
    public bird(String name){
        super(name); //使用super调用父类的构造方法
    }

    public void fly() {
        System.out.println(this.name + "正在天空中飞翔");
    }
}