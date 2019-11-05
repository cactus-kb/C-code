package package1;

public class Bird extends Animal{
//    public String name;
//
//    public Bird(String name) {
//        this.name = name;
//    }
//
//    public void eat(String food) {
//        System.out.println(this.name + "正在吃" + food);
//    }


    public Bird(String name, int age) {
        super(name,age);

    }

    public void eat(String food) {
        System.out.println("i'm a bird");
        System.out.println(this.name + "在吃" + food);
    }

    public void fly() {
        System.out.println(this.name + "正在飞");
    }
}
