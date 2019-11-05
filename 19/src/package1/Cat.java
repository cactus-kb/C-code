package package1;

public class Cat extends Animal{
    public Cat(String name,int age) {
        super(name,age);
    }



//    public String name;
////
////    public Cat(String name) {
////        this.name = name;
////    }
////
    public void eat(String food) {
        System.out.println("i'm a cat");
        System.out.println(this.name + "正在吃" + food);
    }
}
