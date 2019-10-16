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
//        System.out.println(this.name + "正在飞翔");
//    }
//}

    class bird extends Animal {
    public bird(String name) {
        super(name);
    }

    public void fly() {
        System.out.println(this.name + "正在飞");
    }
    }
