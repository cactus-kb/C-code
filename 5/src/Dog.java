//public class Dog {
//    public String name;
//
//    public Dog (String name) {
//        this.name = name;
//    }
//
//    public void eat (String food) {
//        System.out.println(this.name + "正在吃" + food);
//    }
//}


public class Dog extends Animal{
    public Dog(String name){
        super(name); //使用super调用父类的构造方法
    }
}