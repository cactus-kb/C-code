//public class Dog {
//    public String name;
//
//    public Dog(String name) {
//        this.name = name;
//    }
//
//    public void eat(String food) {
//        System.out.println(this.name + "正在吃" + food);
//    }
//}


public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    @Override
    public void eat(String food) {
        super.eat(food);
    }
}